// Generated from /Users/peng/workspace/github/dber/src/main/resources/Dber.g4 by ANTLR 4.5.1
package psyco.dber.parser.dber;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DberLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, NULL=2, VAR=3, STRING=4, VALUE=5, GET=6, GT=7, LT=8, LET=9, EQ=10, 
		NOT_EQ=11, OP=12, AND=13, OR=14, AND_OR=15, NEWLINE=16, WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "NULL", "VAR", "STRING", "VALUE", "GET", "GT", "LT", "LET", "EQ", 
		"NOT_EQ", "OP", "AND", "OR", "AND_OR", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'>='", "'>'", "'<'", "'<='", "'='", 
		"'!='", null, "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "NULL", "VAR", "STRING", "VALUE", "GET", "GT", "LT", "LET", 
		"EQ", "NOT_EQ", "OP", "AND", "OR", "AND_OR", "NEWLINE", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23{\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2\'\n\2\r\2\16\2(\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n\3\3"+
		"\4\6\4\66\n\4\r\4\16\4\67\3\4\6\4;\n\4\r\4\16\4<\3\5\3\5\7\5A\n\5\f\5"+
		"\16\5D\13\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6L\n\6\3\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\rb\n\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\5\20l\n\20\3\21\5\21o\n\21\3\21\3"+
		"\21\3\21\3\21\3\22\6\22v\n\22\r\22\16\22w\3\22\3\22\2\2\23\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"\3\2\6\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u0089\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\3&\3\2\2\2\5\62\3\2\2\2\7\65\3\2\2\2\t>\3\2\2\2\13K\3\2\2\2\rM\3\2\2"+
		"\2\17P\3\2\2\2\21R\3\2\2\2\23T\3\2\2\2\25W\3\2\2\2\27Y\3\2\2\2\31a\3\2"+
		"\2\2\33c\3\2\2\2\35f\3\2\2\2\37k\3\2\2\2!n\3\2\2\2#u\3\2\2\2%\'\t\2\2"+
		"\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\4\3\2\2\2*+\7p\2\2+,\7w\2"+
		"\2,-\7n\2\2-\63\7n\2\2./\7P\2\2/\60\7W\2\2\60\61\7N\2\2\61\63\7N\2\2\62"+
		"*\3\2\2\2\62.\3\2\2\2\63\6\3\2\2\2\64\66\t\3\2\2\65\64\3\2\2\2\66\67\3"+
		"\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29;\t\4\2\2:9\3\2\2\2;<\3\2\2"+
		"\2<:\3\2\2\2<=\3\2\2\2=\b\3\2\2\2>B\7)\2\2?A\13\2\2\2@?\3\2\2\2AD\3\2"+
		"\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7)\2\2F\n\3\2\2\2GL\5\3"+
		"\2\2HL\5\t\5\2IL\5\5\3\2JL\3\2\2\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2"+
		"\2\2L\f\3\2\2\2MN\7@\2\2NO\7?\2\2O\16\3\2\2\2PQ\7@\2\2Q\20\3\2\2\2RS\7"+
		">\2\2S\22\3\2\2\2TU\7>\2\2UV\7?\2\2V\24\3\2\2\2WX\7?\2\2X\26\3\2\2\2Y"+
		"Z\7#\2\2Z[\7?\2\2[\30\3\2\2\2\\b\5\r\7\2]b\5\17\b\2^b\5\23\n\2_b\5\25"+
		"\13\2`b\5\27\f\2a\\\3\2\2\2a]\3\2\2\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\32"+
		"\3\2\2\2cd\7(\2\2de\7(\2\2e\34\3\2\2\2fg\7~\2\2gh\7~\2\2h\36\3\2\2\2i"+
		"l\5\33\16\2jl\5\35\17\2ki\3\2\2\2kj\3\2\2\2l \3\2\2\2mo\7\17\2\2nm\3\2"+
		"\2\2no\3\2\2\2op\3\2\2\2pq\7\f\2\2qr\3\2\2\2rs\b\21\2\2s\"\3\2\2\2tv\t"+
		"\5\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\b\22\2\2z$"+
		"\3\2\2\2\r\2(\62\67<BKaknw\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}