// Generated from Dber.g4 by ANTLR 4.5
package psyco.dber.parser.dber.lex;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DberParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, INT=8, LONG=9, 
		ID=10, NULL=11, STRING=12, VAR_PREFIX=13, GET=14, GT=15, LT=16, LET=17, 
		EQ=18, NOT_EQ=19, AND=20, OR=21, NEWLINE=22, WS=23, EMPTY=24, BLOCK_COMMENT=25, 
		LINE_COMMENT=26;
	public static final int
		RULE_varExpr = 0, RULE_value = 1, RULE_calVar = 2, RULE_num = 3, RULE_cal = 4, 
		RULE_predict = 5, RULE_constIf = 6, RULE_exprSimple = 7, RULE_predictBodyTrue = 8, 
		RULE_predictBodyFalse = 9, RULE_exprPredict = 10, RULE_op = 11, RULE_andOr = 12, 
		RULE_sentence = 13;
	public static final String[] ruleNames = {
		"varExpr", "value", "calVar", "num", "cal", "predict", "constIf", "exprSimple", 
		"predictBodyTrue", "predictBodyFalse", "exprPredict", "op", "andOr", "sentence"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'.'", "'}'", "'if'", "'->'", "'else'", "'*'", null, null, 
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

	@Override
	public String getGrammarFileName() { return "Dber.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DberParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class VarExprContext extends ParserRuleContext {
		public List<String> result;
		public Token ID;
		public List<Token> vars = new ArrayList<Token>();
		public TerminalNode VAR_PREFIX() { return getToken(DberParser.VAR_PREFIX, 0); }
		public List<TerminalNode> ID() { return getTokens(DberParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DberParser.ID, i);
		}
		public VarExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).exitVarExpr(this);
		}
	}

	public final VarExprContext varExpr() throws RecognitionException {
		VarExprContext _localctx = new VarExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_varExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(VAR_PREFIX);
			setState(29);
			match(T__0);
			setState(30);
			((VarExprContext)_localctx).ID = match(ID);
			((VarExprContext)_localctx).vars.add(((VarExprContext)_localctx).ID);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(31);
				match(T__1);
				setState(32);
				((VarExprContext)_localctx).ID = match(ID);
				((VarExprContext)_localctx).vars.add(((VarExprContext)_localctx).ID);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(T__2);
			((VarExprContext)_localctx).result =  ((VarExprContext)_localctx).vars.stream().map(v->v.getText()).collect(java.util.stream.Collectors.toList());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public Object result;
		public Token STRING;
		public Token INT;
		public TerminalNode NULL() { return getToken(DberParser.NULL, 0); }
		public TerminalNode STRING() { return getToken(DberParser.STRING, 0); }
		public TerminalNode INT() { return getToken(DberParser.INT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_value);
		try {
			setState(46);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(NULL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				((ValueContext)_localctx).STRING = match(STRING);
				((ValueContext)_localctx).result =   (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				((ValueContext)_localctx).INT = match(INT);
				((ValueContext)_localctx).result =   (((ValueContext)_localctx).INT!=null?Integer.valueOf(((ValueContext)_localctx).INT.getText()):0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalVarContext extends ParserRuleContext {
		public Token ID;
		public List<Token> vars = new ArrayList<Token>();
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DberParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DberParser.ID, i);
		}
		public CalVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).enterCalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).exitCalVar(this);
		}
	}

	public final CalVarContext calVar() throws RecognitionException {
		CalVarContext _localctx = new CalVarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_calVar);
		try {
			int _alt;
			setState(57);
			switch (_input.LA(1)) {
			case INT:
			case NULL:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				value();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(49);
				((CalVarContext)_localctx).ID = match(ID);
				((CalVarContext)_localctx).vars.add(((CalVarContext)_localctx).ID);
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(50);
						match(T__1);
						setState(51);
						((CalVarContext)_localctx).ID = match(ID);
						((CalVarContext)_localctx).vars.add(((CalVarContext)_localctx).ID);
						}
						} 
					}
					setState(56);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DberParser.INT, 0); }
		public TerminalNode LONG() { return getToken(DberParser.LONG, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==LONG) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalContext extends ParserRuleContext {
		public CalVarContext calVar() {
			return getRuleContext(CalVarContext.class,0);
		}
		public List<CalContext> cal() {
			return getRuleContexts(CalContext.class);
		}
		public CalContext cal(int i) {
			return getRuleContext(CalContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public CalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).enterCal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).exitCal(this);
		}
	}

	public final CalContext cal() throws RecognitionException {
		return cal(0);
	}

	private CalContext cal(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CalContext _localctx = new CalContext(_ctx, _parentState);
		CalContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_cal, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(62);
			calVar();
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CalContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cal);
					setState(64);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(65);
					op();
					setState(66);
					cal(3);
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredictContext extends ParserRuleContext {
		public CalContext cal() {
			return getRuleContext(CalContext.class,0);
		}
		public List<PredictContext> predict() {
			return getRuleContexts(PredictContext.class);
		}
		public PredictContext predict(int i) {
			return getRuleContext(PredictContext.class,i);
		}
		public AndOrContext andOr() {
			return getRuleContext(AndOrContext.class,0);
		}
		public PredictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).enterPredict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).exitPredict(this);
		}
	}

	public final PredictContext predict() throws RecognitionException {
		return predict(0);
	}

	private PredictContext predict(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PredictContext _localctx = new PredictContext(_ctx, _parentState);
		PredictContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_predict, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(74);
			cal(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PredictContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_predict);
					setState(76);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(77);
					andOr();
					setState(78);
					predict(3);
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstIfContext extends ParserRuleContext {
		public ConstIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).enterConstIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).exitConstIf(this);
		}
	}

	public final ConstIfContext constIf() throws RecognitionException {
		ConstIfContext _localctx = new ConstIfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprSimpleContext extends ParserRuleContext {
		public VarExprContext varExpr() {
			return getRuleContext(VarExprContext.class,0);
		}
		public ExprSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).enterExprSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).exitExprSimple(this);
		}
	}

	public final ExprSimpleContext exprSimple() throws RecognitionException {
		ExprSimpleContext _localctx = new ExprSimpleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprSimple);
		try {
			setState(89);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				varExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				matchWildcard();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredictBodyTrueContext extends ParserRuleContext {
		public ExprSimpleContext exprSimple() {
			return getRuleContext(ExprSimpleContext.class,0);
		}
		public PredictBodyTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predictBodyTrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).enterPredictBodyTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).exitPredictBodyTrue(this);
		}
	}

	public final PredictBodyTrueContext predictBodyTrue() throws RecognitionException {
		PredictBodyTrueContext _localctx = new PredictBodyTrueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_predictBodyTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			exprSimple();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredictBodyFalseContext extends ParserRuleContext {
		public ExprSimpleContext exprSimple() {
			return getRuleContext(ExprSimpleContext.class,0);
		}
		public PredictBodyFalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predictBodyFalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).enterPredictBodyFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).exitPredictBodyFalse(this);
		}
	}

	public final PredictBodyFalseContext predictBodyFalse() throws RecognitionException {
		PredictBodyFalseContext _localctx = new PredictBodyFalseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_predictBodyFalse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			exprSimple();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprPredictContext extends ParserRuleContext {
		public ConstIfContext constIf() {
			return getRuleContext(ConstIfContext.class,0);
		}
		public PredictContext predict() {
			return getRuleContext(PredictContext.class,0);
		}
		public List<PredictBodyTrueContext> predictBodyTrue() {
			return getRuleContexts(PredictBodyTrueContext.class);
		}
		public PredictBodyTrueContext predictBodyTrue(int i) {
			return getRuleContext(PredictBodyTrueContext.class,i);
		}
		public List<PredictBodyFalseContext> predictBodyFalse() {
			return getRuleContexts(PredictBodyFalseContext.class);
		}
		public PredictBodyFalseContext predictBodyFalse(int i) {
			return getRuleContext(PredictBodyFalseContext.class,i);
		}
		public ExprPredictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprPredict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).enterExprPredict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).exitExprPredict(this);
		}
	}

	public final ExprPredictContext exprPredict() throws RecognitionException {
		ExprPredictContext _localctx = new ExprPredictContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exprPredict);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			constIf();
			setState(96);
			match(T__0);
			setState(97);
			predict(0);
			setState(98);
			match(T__4);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(99);
					predictBodyTrue();
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(113);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(105);
				match(T__5);
				setState(106);
				match(T__4);
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(107);
						predictBodyFalse();
						}
						} 
					}
					setState(112);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
			}

			setState(115);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(DberParser.GET, 0); }
		public TerminalNode GT() { return getToken(DberParser.GT, 0); }
		public TerminalNode LT() { return getToken(DberParser.LT, 0); }
		public TerminalNode LET() { return getToken(DberParser.LET, 0); }
		public TerminalNode EQ() { return getToken(DberParser.EQ, 0); }
		public TerminalNode NOT_EQ() { return getToken(DberParser.NOT_EQ, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GET) | (1L << GT) | (1L << LT) | (1L << LET) | (1L << EQ) | (1L << NOT_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndOrContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(DberParser.AND, 0); }
		public TerminalNode OR() { return getToken(DberParser.OR, 0); }
		public AndOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).enterAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).exitAndOr(this);
		}
	}

	public final AndOrContext andOr() throws RecognitionException {
		AndOrContext _localctx = new AndOrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_andOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public List<ExprPredictContext> exprPredict() {
			return getRuleContexts(ExprPredictContext.class);
		}
		public ExprPredictContext exprPredict(int i) {
			return getRuleContext(ExprPredictContext.class,i);
		}
		public List<VarExprContext> varExpr() {
			return getRuleContexts(VarExprContext.class);
		}
		public VarExprContext varExpr(int i) {
			return getRuleContext(VarExprContext.class,i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sentence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(126);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(121);
						exprPredict();
						}
						break;
					case 2:
						{
						setState(122);
						varExpr();
						}
						break;
					case 3:
						{
						setState(123);
						match(T__6);
						}
						break;
					case 4:
						{
						setState(124);
						match(T__1);
						}
						break;
					case 5:
						{
						setState(125);
						matchWildcard();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(128); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return cal_sempred((CalContext)_localctx, predIndex);
		case 5:
			return predict_sempred((PredictContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean cal_sempred(CalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean predict_sempred(PredictContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u0085\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\7\2$\n\2"+
		"\f\2\16\2\'\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4\3"+
		"\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\5\4<\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6G\n\6\f\6\16\6J\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7S\n\7"+
		"\f\7\16\7V\13\7\3\b\3\b\3\t\3\t\5\t\\\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\7\fg\n\f\f\f\16\fj\13\f\3\f\3\f\3\f\7\fo\n\f\f\f\16\fr\13\f"+
		"\5\ft\n\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\6\17\u0081"+
		"\n\17\r\17\16\17\u0082\3\17\5hp\u0082\4\n\f\20\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\2\5\3\2\n\13\3\2\20\25\3\2\26\27\u0086\2\36\3\2\2\2\4\60"+
		"\3\2\2\2\6;\3\2\2\2\b=\3\2\2\2\n?\3\2\2\2\fK\3\2\2\2\16W\3\2\2\2\20[\3"+
		"\2\2\2\22]\3\2\2\2\24_\3\2\2\2\26a\3\2\2\2\30w\3\2\2\2\32y\3\2\2\2\34"+
		"\u0080\3\2\2\2\36\37\7\17\2\2\37 \7\3\2\2 %\7\f\2\2!\"\7\4\2\2\"$\7\f"+
		"\2\2#!\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7"+
		"\5\2\2)*\b\2\1\2*\3\3\2\2\2+\61\7\r\2\2,-\7\16\2\2-\61\b\3\1\2./\7\n\2"+
		"\2/\61\b\3\1\2\60+\3\2\2\2\60,\3\2\2\2\60.\3\2\2\2\61\5\3\2\2\2\62<\5"+
		"\4\3\2\638\7\f\2\2\64\65\7\4\2\2\65\67\7\f\2\2\66\64\3\2\2\2\67:\3\2\2"+
		"\28\66\3\2\2\289\3\2\2\29<\3\2\2\2:8\3\2\2\2;\62\3\2\2\2;\63\3\2\2\2<"+
		"\7\3\2\2\2=>\t\2\2\2>\t\3\2\2\2?@\b\6\1\2@A\5\6\4\2AH\3\2\2\2BC\f\4\2"+
		"\2CD\5\30\r\2DE\5\n\6\5EG\3\2\2\2FB\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2"+
		"\2\2I\13\3\2\2\2JH\3\2\2\2KL\b\7\1\2LM\5\n\6\2MT\3\2\2\2NO\f\4\2\2OP\5"+
		"\32\16\2PQ\5\f\7\5QS\3\2\2\2RN\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U"+
		"\r\3\2\2\2VT\3\2\2\2WX\7\6\2\2X\17\3\2\2\2Y\\\5\2\2\2Z\\\13\2\2\2[Y\3"+
		"\2\2\2[Z\3\2\2\2\\\21\3\2\2\2]^\5\20\t\2^\23\3\2\2\2_`\5\20\t\2`\25\3"+
		"\2\2\2ab\5\16\b\2bc\7\3\2\2cd\5\f\7\2dh\7\7\2\2eg\5\22\n\2fe\3\2\2\2g"+
		"j\3\2\2\2hi\3\2\2\2hf\3\2\2\2is\3\2\2\2jh\3\2\2\2kl\7\b\2\2lp\7\7\2\2"+
		"mo\5\24\13\2nm\3\2\2\2or\3\2\2\2pq\3\2\2\2pn\3\2\2\2qt\3\2\2\2rp\3\2\2"+
		"\2sk\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\5\2\2v\27\3\2\2\2wx\t\3\2\2x\31\3"+
		"\2\2\2yz\t\4\2\2z\33\3\2\2\2{\u0081\5\26\f\2|\u0081\5\2\2\2}\u0081\7\t"+
		"\2\2~\u0081\7\4\2\2\177\u0081\13\2\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0080"+
		"}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0083\35\3\2\2\2\16%\608;HT[hps\u0080\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}