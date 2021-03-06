package me.learn.simplelang.main.data;

public class VarItemFactory {

    public static VarItem createReturnVarItem(MethodInfo belongedMethod) {
        VarItem item = new VarItem();
        item.scope = VarItem.Scope.METHOD_RETURN;
        item.belongedMethod = belongedMethod;
        return item;
    }

    public static VarItem createMethodArgVarItem(MethodInfo belongedMethod) {
        VarItem item = new VarItem();
        item.scope = VarItem.Scope.METHOD_ARG;
        item.belongedMethod = belongedMethod;
        return item;
    }

    public static VarItem createVarMethodVarItem(MethodInfo belongedMethod, String var) {
        VarItem item = new VarItem();
        item.belongedMethod = belongedMethod;
        item.var = var;
        return item;
    }

    public static VarItem createBelongedMethodVarItem(MethodInfo belongedMethod) {
        VarItem item = new VarItem();
        item.belongedMethod = belongedMethod;
        return item;
    }

    public static VarItem createGlobalVarItem(String var) {
        VarItem item = new VarItem();
        item.var = var;
        item.scope = VarItem.Scope.GLOBAL;
        return item;
    }

    public static VarItem createVarVarItem(String var,Type type, MethodInfo belongedMethod) {
        VarItem item = new VarItem();
        item.var = var;
        item.type = type;
        item.belongedMethod = belongedMethod;
        return item;
    }
}
