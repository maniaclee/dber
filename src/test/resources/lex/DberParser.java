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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		INT=10, LONG=11, ID=12, NULL=13, STRING=14, VAR_PREFIX=15, GET=16, GT=17, 
		LT=18, LET=19, EQ=20, NOT_EQ=21, AND=22, OR=23, NEWLINE=24, WS=25, EMPTY=26, 
		BLOCK_COMMENT=27, LINE_COMMENT=28;
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
		null, "'{'", "'.'", "'}'", "'null'", "'NULL'", "'if'", "'->'", "'else'", 
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
			setState(47);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(T__4);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				((ValueContext)_localctx).STRING = match(STRING);
				((ValueContext)_localctx).result =   (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
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
			setState(58);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				value();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(50);
				((CalVarContext)_localctx).ID = match(ID);
				((CalVarContext)_localctx).vars.add(((CalVarContext)_localctx).ID);
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(51);
						match(T__1);
						setState(52);
						((CalVarContext)_localctx).ID = match(ID);
						((CalVarContext)_localctx).vars.add(((CalVarContext)_localctx).ID);
						}
						} 
					}
					setState(57);
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
			setState(60);
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
			setState(63);
			calVar();
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
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
					setState(65);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(66);
					op();
					setState(67);
					cal(3);
					}
					} 
				}
				setState(73);
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
			setState(75);
			cal(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
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
					setState(77);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(78);
					andOr();
					setState(79);
					predict(3);
					}
					} 
				}
				setState(85);
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
			setState(86);
			match(T__5);
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
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				varExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
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
			setState(92);
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
			setState(94);
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
			setState(96);
			constIf();
			setState(97);
			match(T__0);
			setState(98);
			predict(0);
			setState(99);
			match(T__6);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(100);
					predictBodyTrue();
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(114);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(106);
				match(T__7);
				setState(107);
				match(T__6);
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(108);
						predictBodyFalse();
						}
						} 
					}
					setState(113);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
			}

			setState(116);
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
			setState(118);
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
			setState(120);
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
			setState(127); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(127);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(122);
						exprPredict();
						}
						break;
					case 2:
						{
						setState(123);
						varExpr();
						}
						break;
					case 3:
						{
						setState(124);
						match(T__8);
						}
						break;
					case 4:
						{
						setState(125);
						match(T__1);
						}
						break;
					case 5:
						{
						setState(126);
						matchWildcard();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(129); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36\u0086\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\7\2$\n\2"+
		"\f\2\16\2\'\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4\3"+
		"\4\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\5\4=\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6H\n\6\f\6\16\6K\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7T\n"+
		"\7\f\7\16\7W\13\7\3\b\3\b\3\t\3\t\5\t]\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\7\fh\n\f\f\f\16\fk\13\f\3\f\3\f\3\f\7\fp\n\f\f\f\16\fs\13\f"+
		"\5\fu\n\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\6\17\u0082"+
		"\n\17\r\17\16\17\u0083\3\17\5iq\u0083\4\n\f\20\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\2\5\3\2\f\r\3\2\22\27\3\2\30\31\u0088\2\36\3\2\2\2\4\61\3"+
		"\2\2\2\6<\3\2\2\2\b>\3\2\2\2\n@\3\2\2\2\fL\3\2\2\2\16X\3\2\2\2\20\\\3"+
		"\2\2\2\22^\3\2\2\2\24`\3\2\2\2\26b\3\2\2\2\30x\3\2\2\2\32z\3\2\2\2\34"+
		"\u0081\3\2\2\2\36\37\7\21\2\2\37 \7\3\2\2 %\7\16\2\2!\"\7\4\2\2\"$\7\16"+
		"\2\2#!\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7"+
		"\5\2\2)*\b\2\1\2*\3\3\2\2\2+\62\7\6\2\2,\62\7\7\2\2-.\7\20\2\2.\62\b\3"+
		"\1\2/\60\7\f\2\2\60\62\b\3\1\2\61+\3\2\2\2\61,\3\2\2\2\61-\3\2\2\2\61"+
		"/\3\2\2\2\62\5\3\2\2\2\63=\5\4\3\2\649\7\16\2\2\65\66\7\4\2\2\668\7\16"+
		"\2\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:=\3\2\2\2;9\3\2\2\2"+
		"<\63\3\2\2\2<\64\3\2\2\2=\7\3\2\2\2>?\t\2\2\2?\t\3\2\2\2@A\b\6\1\2AB\5"+
		"\6\4\2BI\3\2\2\2CD\f\4\2\2DE\5\30\r\2EF\5\n\6\5FH\3\2\2\2GC\3\2\2\2HK"+
		"\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\13\3\2\2\2KI\3\2\2\2LM\b\7\1\2MN\5\n\6\2"+
		"NU\3\2\2\2OP\f\4\2\2PQ\5\32\16\2QR\5\f\7\5RT\3\2\2\2SO\3\2\2\2TW\3\2\2"+
		"\2US\3\2\2\2UV\3\2\2\2V\r\3\2\2\2WU\3\2\2\2XY\7\b\2\2Y\17\3\2\2\2Z]\5"+
		"\2\2\2[]\13\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]\21\3\2\2\2^_\5\20\t\2_\23\3\2"+
		"\2\2`a\5\20\t\2a\25\3\2\2\2bc\5\16\b\2cd\7\3\2\2de\5\f\7\2ei\7\t\2\2f"+
		"h\5\22\n\2gf\3\2\2\2hk\3\2\2\2ij\3\2\2\2ig\3\2\2\2jt\3\2\2\2ki\3\2\2\2"+
		"lm\7\n\2\2mq\7\t\2\2np\5\24\13\2on\3\2\2\2ps\3\2\2\2qr\3\2\2\2qo\3\2\2"+
		"\2ru\3\2\2\2sq\3\2\2\2tl\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\5\2\2w\27\3\2"+
		"\2\2xy\t\3\2\2y\31\3\2\2\2z{\t\4\2\2{\33\3\2\2\2|\u0082\5\26\f\2}\u0082"+
		"\5\2\2\2~\u0082\7\13\2\2\177\u0082\7\4\2\2\u0080\u0082\13\2\2\2\u0081"+
		"|\3\2\2\2\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\35\3\2\2\2\16%\619<IU\\iqt\u0081\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}