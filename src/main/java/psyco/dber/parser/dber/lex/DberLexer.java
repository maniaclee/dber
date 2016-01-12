package psyco.dber.parser.dber.lex;// Generated from Dber.g4 by ANTLR 4.5
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DberLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, INT=8, LONG=9, 
		ID=10, NULL=11, STRING=12, VAR_PREFIX=13, GET=14, GT=15, LT=16, LET=17, 
		EQ=18, NOT_EQ=19, AND=20, OR=21, NEWLINE=22, WS=23, EMPTY=24, BLOCK_COMMENT=25, 
		LINE_COMMENT=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "INT", "LONG", 
		"ID", "NULL", "STRING", "VAR_PREFIX", "GET", "GT", "LT", "LET", "EQ", 
		"NOT_EQ", "AND", "OR", "NEWLINE", "WS", "EMPTY", "BLOCK_COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'.'", "'}'", "'if'", "'*'", "'->'", "'else'", null, null, 
		null, null, null, null, "'>='", "'>'", "'<'", "'<='", "'='", "'!='", "'&&'", 
		"'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "INT", "LONG", "ID", "NULL", 
		"STRING", "VAR_PREFIX", "GET", "GT", "LT", "LET", "EQ", "NOT_EQ", "AND", 
		"OR", "NEWLINE", "WS", "EMPTY", "BLOCK_COMMENT", "LINE_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u00ae\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\6\tL\n\t\r\t\16\tM\3\n\3\n\3\n\3"+
		"\13\3\13\7\13U\n\13\f\13\16\13X\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\fb\n\f\3\r\3\r\7\rf\n\r\f\r\16\ri\13\r\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\5\27\u0085\n\27\3\27\3\27\3\27\3\27\3\30"+
		"\6\30\u008c\n\30\r\30\16\30\u008d\3\30\3\30\3\31\3\31\5\31\u0094\n\31"+
		"\3\32\3\32\3\32\3\32\7\32\u009a\n\32\f\32\16\32\u009d\13\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00a8\n\33\f\33\16\33\u00ab\13"+
		"\33\3\33\3\33\4g\u009b\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\""+
		"\"\4\2\f\f\17\17\u00b6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3"+
		"\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13@\3\2\2\2\rB\3\2\2\2\17E\3\2"+
		"\2\2\21K\3\2\2\2\23O\3\2\2\2\25R\3\2\2\2\27a\3\2\2\2\31c\3\2\2\2\33l\3"+
		"\2\2\2\35n\3\2\2\2\37q\3\2\2\2!s\3\2\2\2#u\3\2\2\2%x\3\2\2\2\'z\3\2\2"+
		"\2)}\3\2\2\2+\u0080\3\2\2\2-\u0084\3\2\2\2/\u008b\3\2\2\2\61\u0093\3\2"+
		"\2\2\63\u0095\3\2\2\2\65\u00a3\3\2\2\2\678\7}\2\28\4\3\2\2\29:\7\60\2"+
		"\2:\6\3\2\2\2;<\7\177\2\2<\b\3\2\2\2=>\7k\2\2>?\7h\2\2?\n\3\2\2\2@A\7"+
		",\2\2A\f\3\2\2\2BC\7/\2\2CD\7@\2\2D\16\3\2\2\2EF\7g\2\2FG\7n\2\2GH\7u"+
		"\2\2HI\7g\2\2I\20\3\2\2\2JL\t\2\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3"+
		"\2\2\2N\22\3\2\2\2OP\5\21\t\2PQ\7n\2\2Q\24\3\2\2\2RV\t\3\2\2SU\t\4\2\2"+
		"TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\26\3\2\2\2XV\3\2\2\2YZ\7p\2"+
		"\2Z[\7w\2\2[\\\7n\2\2\\b\7n\2\2]^\7P\2\2^_\7W\2\2_`\7N\2\2`b\7N\2\2aY"+
		"\3\2\2\2a]\3\2\2\2b\30\3\2\2\2cg\7)\2\2df\13\2\2\2ed\3\2\2\2fi\3\2\2\2"+
		"gh\3\2\2\2ge\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7)\2\2k\32\3\2\2\2lm\4%&\2"+
		"m\34\3\2\2\2no\7@\2\2op\7?\2\2p\36\3\2\2\2qr\7@\2\2r \3\2\2\2st\7>\2\2"+
		"t\"\3\2\2\2uv\7>\2\2vw\7?\2\2w$\3\2\2\2xy\7?\2\2y&\3\2\2\2z{\7#\2\2{|"+
		"\7?\2\2|(\3\2\2\2}~\7(\2\2~\177\7(\2\2\177*\3\2\2\2\u0080\u0081\7~\2\2"+
		"\u0081\u0082\7~\2\2\u0082,\3\2\2\2\u0083\u0085\7\17\2\2\u0084\u0083\3"+
		"\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\f\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\b\27\2\2\u0089.\3\2\2\2\u008a\u008c\t\5\2\2"+
		"\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\30\2\2\u0090\60\3\2\2\2\u0091"+
		"\u0094\5-\27\2\u0092\u0094\5/\30\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2"+
		"\2\2\u0094\62\3\2\2\2\u0095\u0096\7\61\2\2\u0096\u0097\7,\2\2\u0097\u009b"+
		"\3\2\2\2\u0098\u009a\13\2\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u009f\7,\2\2\u009f\u00a0\7\61\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\b\32\3\2\u00a2\64\3\2\2\2\u00a3\u00a4\7\61\2\2\u00a4\u00a5\7\61"+
		"\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a8\n\6\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\b\33\3\2\u00ad\66\3\2\2\2\f\2MVa"+
		"g\u0084\u008d\u0093\u009b\u00a9\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}