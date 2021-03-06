import me.learn.simplelang.SimpleLangLexer;
import me.learn.simplelang.SimpleLangParser;
import me.learn.simplelang.main.BytecodeVisitor;
import me.learn.simplelang.main.GlobalVarVisitor;
import me.learn.simplelang.main.VarTypeVisitor;
import me.learn.simplelang.main.data.Global;
import me.learn.simplelang.main.data.VarItem;
import me.learn.simplelang.main.util.VarTypeRefFilter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Queue;

public class TestVarTypeVisitor extends ClassLoader {

    private static final Logger log = LoggerFactory.getLogger(TestVarTypeVisitor.class);

    public static void main(String[] args) throws IOException, InvocationTargetException, IllegalAccessException {
        String filePath = TestVarTypeVisitor.class.getClassLoader().getResource("test.sl").getFile();
        log.info(filePath);
        ANTLRInputStream inputStream =  new ANTLRInputStream(
                new FileInputStream(filePath));
        SimpleLangLexer lexer = new SimpleLangLexer(inputStream);
        CommonTokenStream stream = new CommonTokenStream(lexer);
        SimpleLangParser parser = new SimpleLangParser(stream);
        GlobalVarVisitor visitor = new GlobalVarVisitor();
        visitor.visit(parser.simpleLang());

        VarTypeVisitor typeVisitor = new VarTypeVisitor();
        inputStream =  new ANTLRInputStream(
                new FileInputStream(filePath));
        lexer = new SimpleLangLexer(inputStream);
        stream = new CommonTokenStream(lexer);
        parser = new SimpleLangParser(stream);
        typeVisitor.visit(parser.simpleLang());

        log.info("Global.globalVarType {}", Global.globalVarType);
        log.info("Global.methodInfos {}", Global.methodInfos);
        log.info("Global.typeRef {}", Global.typeRef);
        log.debug("==================依赖==========================");
        Global.typeRef.forEach(item -> {
            log.info("{} =>", item, item.varTypeRef);
        });
        log.debug("============================================");
        // 通过
        Queue<VarItem> queue = VarTypeRefFilter.filter(Global.typeRef);
        log.debug("{}", queue);
        log.debug("============================================");
        VarTypeRefFilter.identifyVarType(Global.typeRef);

        if (Global.typeRef.stream().anyMatch(item -> item.isTerminal == null))
            throw new RuntimeException("can not identify all var's type [check your code for annulus dependency]");

        BytecodeVisitor bytecodeVisitor = new BytecodeVisitor();
        inputStream =  new ANTLRInputStream(
                new FileInputStream(filePath));
        lexer = new SimpleLangLexer(inputStream);
        stream = new CommonTokenStream(lexer);
        parser = new SimpleLangParser(stream);
        bytecodeVisitor.visit(parser.simpleLang());

        log.debug("{}", queue);
        log.debug("{}", Global.typeRef);

        byte[] data = Global.classWriter.toByteArray();
        File file = new File("Test.class");
        FileOutputStream fout = new FileOutputStream(file);
        fout.write(data);
        fout.close();

        TestVarTypeVisitor loader = new TestVarTypeVisitor();
        Class<?> c = loader.defineClass("Test", data, 0, data.length);
        System.out.println(c.getName());
        c.getMethods()[0].invoke(null, new Object[] { null });

    }

}
