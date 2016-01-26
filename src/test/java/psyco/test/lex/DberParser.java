// Generated from Dber.g4 by ANTLR 4.5
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INT=7, LONG=8, ID=9, NULL=10, 
		STRING=11, VAR_PREFIX=12, GET=13, GT=14, LT=15, LET=16, EQ=17, NOT_EQ=18, 
		AND=19, OR=20, NEWLINE=21, WS=22, EMPTY=23, BLOCK_COMMENT=24, LINE_COMMENT=25;
	public static final int
		RULE_num = 0, RULE_value = 1, RULE_varExpr = 2, RULE_calVar = 3, RULE_cal = 4, 
		RULE_predict = 5, RULE_constIf = 6, RULE_exprSimple = 7, RULE_predictBodyTrue = 8, 
		RULE_predictBodyFalse = 9, RULE_exprPredict = 10, RULE_op = 11, RULE_andOr = 12, 
		RULE_sentence = 13;
	public static final String[] ruleNames = {
		"num", "value", "varExpr", "calVar", "cal", "predict", "constIf", "exprSimple", 
		"predictBodyTrue", "predictBodyFalse", "exprPredict", "op", "andOr", "sentence"
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
		enterRule(_localctx, 0, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
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

	public static class ValueContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode STRING() { return getToken(DberParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(DberParser.NULL, 0); }
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
			setState(33);
			switch (_input.LA(1)) {
			case INT:
			case LONG:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				num();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(STRING);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(NULL);
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

	public static class VarExprContext extends ParserRuleContext {
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
		enterRule(_localctx, 4, RULE_varExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(VAR_PREFIX);
			setState(36);
			match(T__0);
			setState(37);
			((VarExprContext)_localctx).ID = match(ID);
			((VarExprContext)_localctx).vars.add(((VarExprContext)_localctx).ID);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(38);
				match(T__1);
				setState(39);
				((VarExprContext)_localctx).ID = match(ID);
				((VarExprContext)_localctx).vars.add(((VarExprContext)_localctx).ID);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
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

	public static class CalVarContext extends ParserRuleContext {
		public Token ID;
		public List<Token> vars = new ArrayList<Token>();
		public List<TerminalNode> ID() { return getTokens(DberParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DberParser.ID, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 6, RULE_calVar);
		try {
			int _alt;
			setState(56);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				((CalVarContext)_localctx).ID = match(ID);
				((CalVarContext)_localctx).vars.add(((CalVarContext)_localctx).ID);
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(48);
						match(T__1);
						setState(49);
						((CalVarContext)_localctx).ID = match(ID);
						((CalVarContext)_localctx).vars.add(((CalVarContext)_localctx).ID);
						}
						} 
					}
					setState(54);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				break;
			case INT:
			case LONG:
			case NULL:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				value();
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
			setState(59);
			calVar();
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
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
					setState(61);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(62);
					op();
					setState(63);
					cal(3);
					}
					} 
				}
				setState(69);
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
			setState(71);
			cal(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
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
					setState(73);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(74);
					andOr();
					setState(75);
					predict(3);
					}
					} 
				}
				setState(81);
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
			setState(82);
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
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				varExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
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
			setState(88);
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
			setState(90);
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
			setState(92);
			constIf();
			setState(93);
			match(T__0);
			setState(94);
			predict(0);
			setState(95);
			match(T__4);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(96);
					predictBodyTrue();
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(110);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(102);
				match(T__5);
				setState(103);
				match(T__4);
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(104);
						predictBodyFalse();
						}
						} 
					}
					setState(109);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
			}

			setState(112);
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
			setState(114);
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
			setState(116);
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
			setState(121); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(121);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(118);
						exprPredict();
						}
						break;
					case 2:
						{
						setState(119);
						varExpr();
						}
						break;
					case 3:
						{
						setState(120);
						matchWildcard();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(123); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u0080\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\5\3$\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\4\3\4\3\5\3\5\3\5\7\5\65"+
		"\n\5\f\5\16\58\13\5\3\5\5\5;\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6D\n\6"+
		"\f\6\16\6G\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7P\n\7\f\7\16\7S\13\7\3"+
		"\b\3\b\3\t\3\t\5\tY\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\fd\n\f"+
		"\f\f\16\fg\13\f\3\f\3\f\3\f\7\fl\n\f\f\f\16\fo\13\f\5\fq\n\f\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\6\17|\n\17\r\17\16\17}\3\17\5em}\4\n\f"+
		"\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\5\3\2\t\n\3\2\17\24\3\2\25\26"+
		"\177\2\36\3\2\2\2\4#\3\2\2\2\6%\3\2\2\2\b:\3\2\2\2\n<\3\2\2\2\fH\3\2\2"+
		"\2\16T\3\2\2\2\20X\3\2\2\2\22Z\3\2\2\2\24\\\3\2\2\2\26^\3\2\2\2\30t\3"+
		"\2\2\2\32v\3\2\2\2\34{\3\2\2\2\36\37\t\2\2\2\37\3\3\2\2\2 $\5\2\2\2!$"+
		"\7\r\2\2\"$\7\f\2\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$\5\3\2\2\2%&\7\16\2"+
		"\2&\'\7\3\2\2\',\7\13\2\2()\7\4\2\2)+\7\13\2\2*(\3\2\2\2+.\3\2\2\2,*\3"+
		"\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\5\2\2\60\7\3\2\2\2\61\66\7"+
		"\13\2\2\62\63\7\4\2\2\63\65\7\13\2\2\64\62\3\2\2\2\658\3\2\2\2\66\64\3"+
		"\2\2\2\66\67\3\2\2\2\67;\3\2\2\28\66\3\2\2\29;\5\4\3\2:\61\3\2\2\2:9\3"+
		"\2\2\2;\t\3\2\2\2<=\b\6\1\2=>\5\b\5\2>E\3\2\2\2?@\f\4\2\2@A\5\30\r\2A"+
		"B\5\n\6\5BD\3\2\2\2C?\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\13\3\2\2"+
		"\2GE\3\2\2\2HI\b\7\1\2IJ\5\n\6\2JQ\3\2\2\2KL\f\4\2\2LM\5\32\16\2MN\5\f"+
		"\7\5NP\3\2\2\2OK\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\r\3\2\2\2SQ\3"+
		"\2\2\2TU\7\6\2\2U\17\3\2\2\2VY\5\6\4\2WY\13\2\2\2XV\3\2\2\2XW\3\2\2\2"+
		"Y\21\3\2\2\2Z[\5\20\t\2[\23\3\2\2\2\\]\5\20\t\2]\25\3\2\2\2^_\5\16\b\2"+
		"_`\7\3\2\2`a\5\f\7\2ae\7\7\2\2bd\5\22\n\2cb\3\2\2\2dg\3\2\2\2ef\3\2\2"+
		"\2ec\3\2\2\2fp\3\2\2\2ge\3\2\2\2hi\7\b\2\2im\7\7\2\2jl\5\24\13\2kj\3\2"+
		"\2\2lo\3\2\2\2mn\3\2\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2ph\3\2\2\2pq\3\2"+
		"\2\2qr\3\2\2\2rs\7\5\2\2s\27\3\2\2\2tu\t\3\2\2u\31\3\2\2\2vw\t\4\2\2w"+
		"\33\3\2\2\2x|\5\26\f\2y|\5\6\4\2z|\13\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3\2"+
		"\2\2|}\3\2\2\2}~\3\2\2\2}{\3\2\2\2~\35\3\2\2\2\16#,\66:EQXemp{}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}