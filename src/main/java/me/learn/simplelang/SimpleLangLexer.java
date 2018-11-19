// Generated from D:/simplelang/src/main/java/me/learn/simplelang\SimpleLang.g4 by ANTLR 4.7
package me.learn.simplelang;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, VAR=11, INT=12, FLOAT=13, CHARSTRING=14, STRING=15, MUL=16, DIV=17, 
		ADD=18, SUB=19, COMMENT=20, LINE_COMMENT=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "VAR", "INT", "FLOAT", "CHARSTRING", "STRING", "MUL", "DIV", "ADD", 
		"SUB", "Digit", "ExponentPart", "EscapeSequence", "COMMENT", "LINE_COMMENT", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'return'", "'('", "','", "')'", "'nil'", "'false'", "'true'", 
		"'function'", "'end'", null, null, null, null, null, "'*'", "'/'", "'+'", 
		"'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "VAR", 
		"INT", "FLOAT", "CHARSTRING", "STRING", "MUL", "DIV", "ADD", "SUB", "COMMENT", 
		"LINE_COMMENT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SimpleLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00dd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\7\fc\n\f"+
		"\f\f\16\ff\13\f\3\r\6\ri\n\r\r\r\16\rj\3\16\6\16n\n\16\r\16\16\16o\3\16"+
		"\3\16\7\16t\n\16\f\16\16\16w\13\16\3\16\5\16z\n\16\3\16\3\16\6\16~\n\16"+
		"\r\16\16\16\177\3\16\5\16\u0083\n\16\3\16\6\16\u0086\n\16\r\16\16\16\u0087"+
		"\3\16\3\16\5\16\u008c\n\16\3\17\3\17\3\17\7\17\u0091\n\17\f\17\16\17\u0094"+
		"\13\17\3\17\3\17\3\20\3\20\3\20\7\20\u009b\n\20\f\20\16\20\u009e\13\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\5\26\u00ae\n\26\3\26\6\26\u00b1\n\26\r\26\16\26\u00b2\3\27\3\27\3\27"+
		"\3\27\5\27\u00b9\n\27\3\27\5\27\u00bc\n\27\3\30\3\30\3\30\3\30\7\30\u00c2"+
		"\n\30\f\30\16\30\u00c5\13\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\7\31\u00d0\n\31\f\31\16\31\u00d3\13\31\3\31\3\31\3\32\6\32\u00d8\n"+
		"\32\r\32\16\32\u00d9\3\32\3\32\3\u00c3\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\2"+
		"-\2/\26\61\27\63\30\3\2\f\5\2C\\aac|\6\2\62;C\\aac|\4\2))^^\4\2$$^^\3"+
		"\2\62;\4\2GGgg\4\2--//\f\2$$))^^cdhhppttvvxx||\4\2\f\f\17\17\5\2\13\f"+
		"\17\17\"\"\2\u00ee\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\7>\3\2\2\2\t@\3\2\2\2\13B\3\2\2"+
		"\2\rD\3\2\2\2\17H\3\2\2\2\21N\3\2\2\2\23S\3\2\2\2\25\\\3\2\2\2\27`\3\2"+
		"\2\2\31h\3\2\2\2\33\u008b\3\2\2\2\35\u008d\3\2\2\2\37\u0097\3\2\2\2!\u00a1"+
		"\3\2\2\2#\u00a3\3\2\2\2%\u00a5\3\2\2\2\'\u00a7\3\2\2\2)\u00a9\3\2\2\2"+
		"+\u00ab\3\2\2\2-\u00bb\3\2\2\2/\u00bd\3\2\2\2\61\u00cb\3\2\2\2\63\u00d7"+
		"\3\2\2\2\65\66\7?\2\2\66\4\3\2\2\2\678\7t\2\289\7g\2\29:\7v\2\2:;\7w\2"+
		"\2;<\7t\2\2<=\7p\2\2=\6\3\2\2\2>?\7*\2\2?\b\3\2\2\2@A\7.\2\2A\n\3\2\2"+
		"\2BC\7+\2\2C\f\3\2\2\2DE\7p\2\2EF\7k\2\2FG\7n\2\2G\16\3\2\2\2HI\7h\2\2"+
		"IJ\7c\2\2JK\7n\2\2KL\7u\2\2LM\7g\2\2M\20\3\2\2\2NO\7v\2\2OP\7t\2\2PQ\7"+
		"w\2\2QR\7g\2\2R\22\3\2\2\2ST\7h\2\2TU\7w\2\2UV\7p\2\2VW\7e\2\2WX\7v\2"+
		"\2XY\7k\2\2YZ\7q\2\2Z[\7p\2\2[\24\3\2\2\2\\]\7g\2\2]^\7p\2\2^_\7f\2\2"+
		"_\26\3\2\2\2`d\t\2\2\2ac\t\3\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2"+
		"\2e\30\3\2\2\2fd\3\2\2\2gi\5)\25\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2"+
		"\2\2k\32\3\2\2\2ln\5)\25\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3"+
		"\2\2\2qu\7\60\2\2rt\5)\25\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vy"+
		"\3\2\2\2wu\3\2\2\2xz\5+\26\2yx\3\2\2\2yz\3\2\2\2z\u008c\3\2\2\2{}\7\60"+
		"\2\2|~\5)\25\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0082\3\2\2\2\u0081\u0083\5+\26\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2"+
		"\2\2\u0083\u008c\3\2\2\2\u0084\u0086\5)\25\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008a\5+\26\2\u008a\u008c\3\2\2\2\u008bm\3\2\2\2\u008b{\3\2"+
		"\2\2\u008b\u0085\3\2\2\2\u008c\34\3\2\2\2\u008d\u0092\7)\2\2\u008e\u0091"+
		"\5-\27\2\u008f\u0091\n\4\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7)\2\2\u0096\36\3\2\2\2\u0097\u009c"+
		"\7$\2\2\u0098\u009b\5-\27\2\u0099\u009b\n\5\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7$\2\2\u00a0"+
		" \3\2\2\2\u00a1\u00a2\7,\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7\61\2\2\u00a4"+
		"$\3\2\2\2\u00a5\u00a6\7-\2\2\u00a6&\3\2\2\2\u00a7\u00a8\7/\2\2\u00a8("+
		"\3\2\2\2\u00a9\u00aa\t\6\2\2\u00aa*\3\2\2\2\u00ab\u00ad\t\7\2\2\u00ac"+
		"\u00ae\t\b\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2"+
		"\2\2\u00af\u00b1\5)\25\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3,\3\2\2\2\u00b4\u00b5\7^\2\2\u00b5"+
		"\u00bc\t\t\2\2\u00b6\u00b8\7^\2\2\u00b7\u00b9\7\17\2\2\u00b8\u00b7\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\7\f\2\2\u00bb"+
		"\u00b4\3\2\2\2\u00bb\u00b6\3\2\2\2\u00bc.\3\2\2\2\u00bd\u00be\7\61\2\2"+
		"\u00be\u00bf\7,\2\2\u00bf\u00c3\3\2\2\2\u00c0\u00c2\13\2\2\2\u00c1\u00c0"+
		"\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7,\2\2\u00c7\u00c8\7\61"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b\30\2\2\u00ca\60\3\2\2\2\u00cb\u00cc"+
		"\7\61\2\2\u00cc\u00cd\7\61\2\2\u00cd\u00d1\3\2\2\2\u00ce\u00d0\n\n\2\2"+
		"\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\b\31\2\2"+
		"\u00d5\62\3\2\2\2\u00d6\u00d8\t\13\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dc\b\32\3\2\u00dc\64\3\2\2\2\27\2djouy\177\u0082\u0087\u008b\u0090"+
		"\u0092\u009a\u009c\u00ad\u00b2\u00b8\u00bb\u00c3\u00d1\u00d9\4\2\3\2\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}