// Generated from Dber.g4 by ANTLR 4.5
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
		T__0=1, T__1=2, T__2=3, INT=4, LONG=5, ID=6, NULL=7, STRING=8, VAR_PREFIX=9, 
		IF=10, GET=11, GT=12, LT=13, LET=14, EQ=15, NOT_EQ=16, OP=17, AND=18, 
		OR=19, AND_OR=20, NEWLINE=21, WS=22, EMPTY=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "INT", "LONG", "ID", "NULL", "STRING", "VAR_PREFIX", 
		"IF", "GET", "GT", "LT", "LET", "EQ", "NOT_EQ", "OP", "AND", "OR", "AND_OR", 
		"NEWLINE", "WS", "EMPTY"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'->'", null, null, null, null, null, null, "'if'", 
		"'>='", "'>'", "'<'", "'<='", "'='", "'!='", null, "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "INT", "LONG", "ID", "NULL", "STRING", "VAR_PREFIX", 
		"IF", "GET", "GT", "LT", "LET", "EQ", "NOT_EQ", "OP", "AND", "OR", "AND_OR", 
		"NEWLINE", "WS", "EMPTY"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u0091\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\5\6\5:\n\5\r\5\16\5;\3\6\3\6\3\6\3\7\3\7\7"+
		"\7C\n\7\f\7\16\7F\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bP\n\b\3\t\3"+
		"\t\7\tT\n\t\f\t\16\tW\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\5\22t\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\5\25"+
		"~\n\25\3\26\5\26\u0081\n\26\3\26\3\26\3\26\3\26\3\27\6\27\u0088\n\27\r"+
		"\27\16\27\u0089\3\27\3\27\3\30\3\30\5\30\u0090\n\30\3U\2\31\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\3\2\6\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2"+
		"\13\f\17\17\"\"\u009c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t9\3\2"+
		"\2\2\13=\3\2\2\2\r@\3\2\2\2\17O\3\2\2\2\21Q\3\2\2\2\23Z\3\2\2\2\25\\\3"+
		"\2\2\2\27_\3\2\2\2\31b\3\2\2\2\33d\3\2\2\2\35f\3\2\2\2\37i\3\2\2\2!k\3"+
		"\2\2\2#s\3\2\2\2%u\3\2\2\2\'x\3\2\2\2)}\3\2\2\2+\u0080\3\2\2\2-\u0087"+
		"\3\2\2\2/\u008f\3\2\2\2\61\62\7}\2\2\62\4\3\2\2\2\63\64\7\177\2\2\64\6"+
		"\3\2\2\2\65\66\7/\2\2\66\67\7@\2\2\67\b\3\2\2\28:\t\2\2\298\3\2\2\2:;"+
		"\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\n\3\2\2\2=>\5\t\5\2>?\7n\2\2?\f\3\2\2\2"+
		"@D\t\3\2\2AC\t\4\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\16\3\2\2"+
		"\2FD\3\2\2\2GH\7p\2\2HI\7w\2\2IJ\7n\2\2JP\7n\2\2KL\7P\2\2LM\7W\2\2MN\7"+
		"N\2\2NP\7N\2\2OG\3\2\2\2OK\3\2\2\2P\20\3\2\2\2QU\7)\2\2RT\13\2\2\2SR\3"+
		"\2\2\2TW\3\2\2\2UV\3\2\2\2US\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7)\2\2Y\22"+
		"\3\2\2\2Z[\4%&\2[\24\3\2\2\2\\]\7k\2\2]^\7h\2\2^\26\3\2\2\2_`\7@\2\2`"+
		"a\7?\2\2a\30\3\2\2\2bc\7@\2\2c\32\3\2\2\2de\7>\2\2e\34\3\2\2\2fg\7>\2"+
		"\2gh\7?\2\2h\36\3\2\2\2ij\7?\2\2j \3\2\2\2kl\7#\2\2lm\7?\2\2m\"\3\2\2"+
		"\2nt\5\27\f\2ot\5\31\r\2pt\5\35\17\2qt\5\37\20\2rt\5!\21\2sn\3\2\2\2s"+
		"o\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t$\3\2\2\2uv\7(\2\2vw\7(\2\2w&"+
		"\3\2\2\2xy\7~\2\2yz\7~\2\2z(\3\2\2\2{~\5%\23\2|~\5\'\24\2}{\3\2\2\2}|"+
		"\3\2\2\2~*\3\2\2\2\177\u0081\7\17\2\2\u0080\177\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\f\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\b\26\2\2\u0085,\3\2\2\2\u0086\u0088\t\5\2\2\u0087\u0086\3\2\2\2"+
		"\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008c\b\27\2\2\u008c.\3\2\2\2\u008d\u0090\5+\26\2\u008e"+
		"\u0090\5-\27\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\60\3\2\2"+
		"\2\f\2;DOUs}\u0080\u0089\u008f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}