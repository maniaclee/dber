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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INT=7, LONG=8, ID=9, NULL=10, 
		STRING=11, VAR_PREFIX=12, ANY=13, GET=14, GT=15, LT=16, LET=17, EQ=18, 
		NOT_EQ=19, AND=20, OR=21, NEWLINE=22, WS=23, EMPTY=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "INT", "LONG", "ID", "NULL", 
		"STRING", "VAR_PREFIX", "ANY", "GET", "GT", "LT", "LET", "EQ", "NOT_EQ", 
		"AND", "OR", "NEWLINE", "WS", "EMPTY"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'.'", "'}'", "'if'", "'->'", "'else'", null, null, null, 
		null, null, null, null, "'>='", "'>'", "'<'", "'<='", "'='", "'!='", "'&&'", 
		"'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "INT", "LONG", "ID", "NULL", 
		"STRING", "VAR_PREFIX", "ANY", "GET", "GT", "LT", "LET", "EQ", "NOT_EQ", 
		"AND", "OR", "NEWLINE", "WS", "EMPTY"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u0093\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\6\bF\n\b\r\b\16\bG\3\t\3\t\3\t\3\n\3\n\7\nO\n\n\f\n\16\nR\13"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\\\n\13\3\f\3\f\7\f`\n"+
		"\f\f\f\16\fc\13\f\3\f\3\f\3\r\3\r\3\16\3\16\5\16k\n\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\5\27\u0083\n\27\3\27\3\27\3\27\3\27\3\30\6\30"+
		"\u008a\n\30\r\30\16\30\u008b\3\30\3\30\3\31\3\31\5\31\u0092\n\31\3a\2"+
		"\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\7\3\2\62;\5\2C\\"+
		"aac|\6\2\62;C\\aac|\4\2,,\60\60\5\2\13\f\17\17\"\"\u009a\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13<\3\2\2\2\r?\3\2"+
		"\2\2\17E\3\2\2\2\21I\3\2\2\2\23L\3\2\2\2\25[\3\2\2\2\27]\3\2\2\2\31f\3"+
		"\2\2\2\33j\3\2\2\2\35l\3\2\2\2\37o\3\2\2\2!q\3\2\2\2#s\3\2\2\2%v\3\2\2"+
		"\2\'x\3\2\2\2){\3\2\2\2+~\3\2\2\2-\u0082\3\2\2\2/\u0089\3\2\2\2\61\u0091"+
		"\3\2\2\2\63\64\7}\2\2\64\4\3\2\2\2\65\66\7\60\2\2\66\6\3\2\2\2\678\7\177"+
		"\2\28\b\3\2\2\29:\7k\2\2:;\7h\2\2;\n\3\2\2\2<=\7/\2\2=>\7@\2\2>\f\3\2"+
		"\2\2?@\7g\2\2@A\7n\2\2AB\7u\2\2BC\7g\2\2C\16\3\2\2\2DF\t\2\2\2ED\3\2\2"+
		"\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\20\3\2\2\2IJ\5\17\b\2JK\7n\2\2K\22\3"+
		"\2\2\2LP\t\3\2\2MO\t\4\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\24"+
		"\3\2\2\2RP\3\2\2\2ST\7p\2\2TU\7w\2\2UV\7n\2\2V\\\7n\2\2WX\7P\2\2XY\7W"+
		"\2\2YZ\7N\2\2Z\\\7N\2\2[S\3\2\2\2[W\3\2\2\2\\\26\3\2\2\2]a\7)\2\2^`\13"+
		"\2\2\2_^\3\2\2\2`c\3\2\2\2ab\3\2\2\2a_\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7"+
		")\2\2e\30\3\2\2\2fg\4%&\2g\32\3\2\2\2hk\t\5\2\2ik\13\2\2\2jh\3\2\2\2j"+
		"i\3\2\2\2k\34\3\2\2\2lm\7@\2\2mn\7?\2\2n\36\3\2\2\2op\7@\2\2p \3\2\2\2"+
		"qr\7>\2\2r\"\3\2\2\2st\7>\2\2tu\7?\2\2u$\3\2\2\2vw\7?\2\2w&\3\2\2\2xy"+
		"\7#\2\2yz\7?\2\2z(\3\2\2\2{|\7(\2\2|}\7(\2\2}*\3\2\2\2~\177\7~\2\2\177"+
		"\u0080\7~\2\2\u0080,\3\2\2\2\u0081\u0083\7\17\2\2\u0082\u0081\3\2\2\2"+
		"\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\f\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0087\b\27\2\2\u0087.\3\2\2\2\u0088\u008a\t\6\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\30\2\2\u008e\60\3\2\2\2\u008f\u0092"+
		"\5-\27\2\u0090\u0092\5/\30\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\62\3\2\2\2\13\2GP[aj\u0082\u008b\u0091\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}