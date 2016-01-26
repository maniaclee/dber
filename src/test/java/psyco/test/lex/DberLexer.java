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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INT=7, LONG=8, ID=9, NULL=10, 
		STRING=11, VAR_PREFIX=12, GET=13, GT=14, LT=15, LET=16, EQ=17, NOT_EQ=18, 
		AND=19, OR=20, NEWLINE=21, WS=22, EMPTY=23, BLOCK_COMMENT=24, LINE_COMMENT=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "INT", "LONG", "ID", "NULL", 
		"STRING", "VAR_PREFIX", "GET", "GT", "LT", "LET", "EQ", "NOT_EQ", "AND", 
		"OR", "NEWLINE", "WS", "EMPTY", "BLOCK_COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'.'", "'}'", "'if'", "'->'", "'else'", null, null, null, 
		null, null, null, "'>='", "'>'", "'<'", "'<='", "'='", "'!='", "'&&'", 
		"'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "INT", "LONG", "ID", "NULL", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u00aa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\6\bH\n\b\r\b\16\bI\3\t\3\t\3\t\3\n\3\n\7\nQ\n\n\f\n"+
		"\16\nT\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13^\n\13\3\f\3\f"+
		"\7\fb\n\f\f\f\16\fe\13\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\5\26\u0081\n\26\3\26\3\26\3\26\3\26\3\27\6\27\u0088\n\27\r"+
		"\27\16\27\u0089\3\27\3\27\3\30\3\30\5\30\u0090\n\30\3\31\3\31\3\31\3\31"+
		"\7\31\u0096\n\31\f\31\16\31\u0099\13\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\7\32\u00a4\n\32\f\32\16\32\u00a7\13\32\3\32\3\32\4c\u0097"+
		"\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\7\3\2\62;\5"+
		"\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u00b2\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\t;\3\2\2\2"+
		"\13>\3\2\2\2\rA\3\2\2\2\17G\3\2\2\2\21K\3\2\2\2\23N\3\2\2\2\25]\3\2\2"+
		"\2\27_\3\2\2\2\31h\3\2\2\2\33j\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2!q\3\2\2"+
		"\2#t\3\2\2\2%v\3\2\2\2\'y\3\2\2\2)|\3\2\2\2+\u0080\3\2\2\2-\u0087\3\2"+
		"\2\2/\u008f\3\2\2\2\61\u0091\3\2\2\2\63\u009f\3\2\2\2\65\66\7}\2\2\66"+
		"\4\3\2\2\2\678\7\60\2\28\6\3\2\2\29:\7\177\2\2:\b\3\2\2\2;<\7k\2\2<=\7"+
		"h\2\2=\n\3\2\2\2>?\7/\2\2?@\7@\2\2@\f\3\2\2\2AB\7g\2\2BC\7n\2\2CD\7u\2"+
		"\2DE\7g\2\2E\16\3\2\2\2FH\t\2\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2"+
		"\2\2J\20\3\2\2\2KL\5\17\b\2LM\7n\2\2M\22\3\2\2\2NR\t\3\2\2OQ\t\4\2\2P"+
		"O\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\24\3\2\2\2TR\3\2\2\2UV\7p\2\2"+
		"VW\7w\2\2WX\7n\2\2X^\7n\2\2YZ\7P\2\2Z[\7W\2\2[\\\7N\2\2\\^\7N\2\2]U\3"+
		"\2\2\2]Y\3\2\2\2^\26\3\2\2\2_c\7)\2\2`b\13\2\2\2a`\3\2\2\2be\3\2\2\2c"+
		"d\3\2\2\2ca\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7)\2\2g\30\3\2\2\2hi\4%&\2i"+
		"\32\3\2\2\2jk\7@\2\2kl\7?\2\2l\34\3\2\2\2mn\7@\2\2n\36\3\2\2\2op\7>\2"+
		"\2p \3\2\2\2qr\7>\2\2rs\7?\2\2s\"\3\2\2\2tu\7?\2\2u$\3\2\2\2vw\7#\2\2"+
		"wx\7?\2\2x&\3\2\2\2yz\7(\2\2z{\7(\2\2{(\3\2\2\2|}\7~\2\2}~\7~\2\2~*\3"+
		"\2\2\2\177\u0081\7\17\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\7\f\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\26"+
		"\2\2\u0085,\3\2\2\2\u0086\u0088\t\5\2\2\u0087\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\b\27\2\2\u008c.\3\2\2\2\u008d\u0090\5+\26\2\u008e\u0090\5-\27\2"+
		"\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\60\3\2\2\2\u0091\u0092"+
		"\7\61\2\2\u0092\u0093\7,\2\2\u0093\u0097\3\2\2\2\u0094\u0096\13\2\2\2"+
		"\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0098\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7,\2\2\u009b"+
		"\u009c\7\61\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\31\3\2\u009e\62\3\2"+
		"\2\2\u009f\u00a0\7\61\2\2\u00a0\u00a1\7\61\2\2\u00a1\u00a5\3\2\2\2\u00a2"+
		"\u00a4\n\6\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\b\32\3\2\u00a9\64\3\2\2\2\f\2IR]c\u0080\u0089\u008f\u0097\u00a5"+
		"\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}