// Generated from /Users/peng/workspace/github/dber/src/main/resources/Test.g4 by ANTLR 4.5.1
package psyco.dber.parser.test;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, AND_OR=13, MUL=14, PLUS=15, INT=16, NEWLINE=17, 
		WS=18, BLOCK_COMMENT=19, LINE_COMMENT=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "AND_OR", "MUL", "PLUS", "INT", "NEWLINE", "WS", 
		"BLOCK_COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'return'", "';'", "'break'", "'>='", "'>'", "'<'", "'<='", "'!='", 
		"'=='", "'{'", "','", "'}'", null, "'*'", "'+'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "AND_OR", "MUL", "PLUS", "INT", "NEWLINE", "WS", "BLOCK_COMMENT", 
		"LINE_COMMENT"
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


	public TestLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u0087\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\5\16V\n\16\3\17\3\17\3\20\3\20\3\21\6\21]\n\21\r\21\16\21^\3\22\5\22"+
		"b\n\22\3\22\3\22\3\22\3\22\3\23\6\23i\n\23\r\23\16\23j\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\7\24s\n\24\f\24\16\24v\13\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\7\25\u0081\n\25\f\25\16\25\u0084\13\25\3\25\3\25"+
		"\3t\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26\3\2\5\3\2\62;\5\2\13\f\17\17\"\"\4\2"+
		"\f\f\17\17\u008c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\62"+
		"\3\2\2\2\7\64\3\2\2\2\t:\3\2\2\2\13=\3\2\2\2\r?\3\2\2\2\17A\3\2\2\2\21"+
		"D\3\2\2\2\23G\3\2\2\2\25J\3\2\2\2\27L\3\2\2\2\31N\3\2\2\2\33U\3\2\2\2"+
		"\35W\3\2\2\2\37Y\3\2\2\2!\\\3\2\2\2#a\3\2\2\2%h\3\2\2\2\'n\3\2\2\2)|\3"+
		"\2\2\2+,\7t\2\2,-\7g\2\2-.\7v\2\2./\7w\2\2/\60\7t\2\2\60\61\7p\2\2\61"+
		"\4\3\2\2\2\62\63\7=\2\2\63\6\3\2\2\2\64\65\7d\2\2\65\66\7t\2\2\66\67\7"+
		"g\2\2\678\7c\2\289\7m\2\29\b\3\2\2\2:;\7@\2\2;<\7?\2\2<\n\3\2\2\2=>\7"+
		"@\2\2>\f\3\2\2\2?@\7>\2\2@\16\3\2\2\2AB\7>\2\2BC\7?\2\2C\20\3\2\2\2DE"+
		"\7#\2\2EF\7?\2\2F\22\3\2\2\2GH\7?\2\2HI\7?\2\2I\24\3\2\2\2JK\7}\2\2K\26"+
		"\3\2\2\2LM\7.\2\2M\30\3\2\2\2NO\7\177\2\2O\32\3\2\2\2PQ\7c\2\2QR\7p\2"+
		"\2RV\7f\2\2ST\7q\2\2TV\7t\2\2UP\3\2\2\2US\3\2\2\2V\34\3\2\2\2WX\7,\2\2"+
		"X\36\3\2\2\2YZ\7-\2\2Z \3\2\2\2[]\t\2\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2"+
		"\2\2^_\3\2\2\2_\"\3\2\2\2`b\7\17\2\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7"+
		"\f\2\2de\3\2\2\2ef\b\22\2\2f$\3\2\2\2gi\t\3\2\2hg\3\2\2\2ij\3\2\2\2jh"+
		"\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\b\23\2\2m&\3\2\2\2no\7\61\2\2op\7,\2\2"+
		"pt\3\2\2\2qs\13\2\2\2rq\3\2\2\2sv\3\2\2\2tu\3\2\2\2tr\3\2\2\2uw\3\2\2"+
		"\2vt\3\2\2\2wx\7,\2\2xy\7\61\2\2yz\3\2\2\2z{\b\24\3\2{(\3\2\2\2|}\7\61"+
		"\2\2}~\7\61\2\2~\u0082\3\2\2\2\177\u0081\n\4\2\2\u0080\177\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0085\u0086\b\25\3\2\u0086*\3\2\2\2\t\2U^ajt"+
		"\u0082\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}