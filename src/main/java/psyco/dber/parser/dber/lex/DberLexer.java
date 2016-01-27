// Generated from Dber.g4 by ANTLR 4.5
package psyco.dber.parser.dber.lex;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DberLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		INT=10, LONG=11, ID=12, NULL=13, STRING=14, VAR_PREFIX=15, GET=16, GT=17, 
		LT=18, LET=19, EQ=20, NOT_EQ=21, AND=22, OR=23, NEWLINE=24, WS=25, EMPTY=26, 
		BLOCK_COMMENT=27, LINE_COMMENT=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"INT", "LONG", "ID", "NULL", "STRING", "VAR_PREFIX", "GET", "GT", "LT", 
		"LET", "EQ", "NOT_EQ", "AND", "OR", "NEWLINE", "WS", "EMPTY", "BLOCK_COMMENT", 
		"LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'null'", "'NULL'", "'if'", "'{'", "'->'", "'else'", "'}'", 
		"'*'", null, null, null, null, null, null, "'>='", "'>'", "'<'", "'<='", 
		"'='", "'!='", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "INT", "LONG", 
		"ID", "NULL", "STRING", "VAR_PREFIX", "GET", "GT", "LT", "LET", "EQ", 
		"NOT_EQ", "AND", "OR", "NEWLINE", "WS", "EMPTY", "BLOCK_COMMENT", "LINE_COMMENT"
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


	public DberLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Dber.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u00bc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\6\13Z\n\13\r\13\16\13[\3\f\3\f\3\f\3\r\3\r"+
		"\7\rc\n\r\f\r\16\rf\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"p\n\16\3\17\3\17\7\17t\n\17\f\17\16\17w\13\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\5\31\u0093\n\31\3\31\3\31\3\31\3\31"+
		"\3\32\6\32\u009a\n\32\r\32\16\32\u009b\3\32\3\32\3\33\3\33\5\33\u00a2"+
		"\n\33\3\34\3\34\3\34\3\34\7\34\u00a8\n\34\f\34\16\34\u00ab\13\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u00b6\n\35\f\35\16\35\u00b9"+
		"\13\35\3\35\3\35\4u\u00a9\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2"+
		"\13\f\17\17\"\"\4\2\f\f\17\17\u00c4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7B\3\2\2\2\tG\3\2"+
		"\2\2\13J\3\2\2\2\rL\3\2\2\2\17O\3\2\2\2\21T\3\2\2\2\23V\3\2\2\2\25Y\3"+
		"\2\2\2\27]\3\2\2\2\31`\3\2\2\2\33o\3\2\2\2\35q\3\2\2\2\37z\3\2\2\2!|\3"+
		"\2\2\2#\177\3\2\2\2%\u0081\3\2\2\2\'\u0083\3\2\2\2)\u0086\3\2\2\2+\u0088"+
		"\3\2\2\2-\u008b\3\2\2\2/\u008e\3\2\2\2\61\u0092\3\2\2\2\63\u0099\3\2\2"+
		"\2\65\u00a1\3\2\2\2\67\u00a3\3\2\2\29\u00b1\3\2\2\2;<\7\60\2\2<\4\3\2"+
		"\2\2=>\7p\2\2>?\7w\2\2?@\7n\2\2@A\7n\2\2A\6\3\2\2\2BC\7P\2\2CD\7W\2\2"+
		"DE\7N\2\2EF\7N\2\2F\b\3\2\2\2GH\7k\2\2HI\7h\2\2I\n\3\2\2\2JK\7}\2\2K\f"+
		"\3\2\2\2LM\7/\2\2MN\7@\2\2N\16\3\2\2\2OP\7g\2\2PQ\7n\2\2QR\7u\2\2RS\7"+
		"g\2\2S\20\3\2\2\2TU\7\177\2\2U\22\3\2\2\2VW\7,\2\2W\24\3\2\2\2XZ\t\2\2"+
		"\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\26\3\2\2\2]^\5\25\13\2^"+
		"_\7n\2\2_\30\3\2\2\2`d\t\3\2\2ac\t\4\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2"+
		"de\3\2\2\2e\32\3\2\2\2fd\3\2\2\2gh\7p\2\2hi\7w\2\2ij\7n\2\2jp\7n\2\2k"+
		"l\7P\2\2lm\7W\2\2mn\7N\2\2np\7N\2\2og\3\2\2\2ok\3\2\2\2p\34\3\2\2\2qu"+
		"\7)\2\2rt\13\2\2\2sr\3\2\2\2tw\3\2\2\2uv\3\2\2\2us\3\2\2\2vx\3\2\2\2w"+
		"u\3\2\2\2xy\7)\2\2y\36\3\2\2\2z{\4%&\2{ \3\2\2\2|}\7@\2\2}~\7?\2\2~\""+
		"\3\2\2\2\177\u0080\7@\2\2\u0080$\3\2\2\2\u0081\u0082\7>\2\2\u0082&\3\2"+
		"\2\2\u0083\u0084\7>\2\2\u0084\u0085\7?\2\2\u0085(\3\2\2\2\u0086\u0087"+
		"\7?\2\2\u0087*\3\2\2\2\u0088\u0089\7#\2\2\u0089\u008a\7?\2\2\u008a,\3"+
		"\2\2\2\u008b\u008c\7(\2\2\u008c\u008d\7(\2\2\u008d.\3\2\2\2\u008e\u008f"+
		"\7~\2\2\u008f\u0090\7~\2\2\u0090\60\3\2\2\2\u0091\u0093\7\17\2\2\u0092"+
		"\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\f"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\31\2\2\u0097\62\3\2\2\2\u0098\u009a"+
		"\t\5\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\32\2\2\u009e\64\3\2\2"+
		"\2\u009f\u00a2\5\61\31\2\u00a0\u00a2\5\63\32\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\66\3\2\2\2\u00a3\u00a4\7\61\2\2\u00a4\u00a5\7,\2"+
		"\2\u00a5\u00a9\3\2\2\2\u00a6\u00a8\13\2\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7,\2\2\u00ad\u00ae\7\61\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\b\34\3\2\u00b08\3\2\2\2\u00b1\u00b2\7\61\2"+
		"\2\u00b2\u00b3\7\61\2\2\u00b3\u00b7\3\2\2\2\u00b4\u00b6\n\6\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\b\35\3\2\u00bb"+
		":\3\2\2\2\f\2[dou\u0092\u009b\u00a1\u00a9\u00b7\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}