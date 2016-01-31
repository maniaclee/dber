// Generated from Dber.g4 by ANTLR 4.5
package psyco.dber.parser.dber.lex;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DberParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		INT=10, LONG=11, ID=12, NULL=13, STRING=14, RPAREN=15, LPAREN=16, PLACEHOLDER=17, 
		COMMA=18, VAR_PREFIX=19, GET=20, GT=21, LT=22, LET=23, EQ=24, NOT_EQ=25, 
		AND=26, OR=27, NEWLINE=28, WS=29, EMPTY=30, BLOCK_COMMENT=31, LINE_COMMENT=32;
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
		null, "'.'", "'null'", "'NULL'", "'if'", "'{'", "'->'", "'else'", "'}'", 
		"'*'", null, null, null, null, null, "')'", "'('", "'?'", "','", null, 
		"'>='", "'>'", "'<'", "'<='", "'='", "'!='", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "INT", "LONG", 
		"ID", "NULL", "STRING", "RPAREN", "LPAREN", "PLACEHOLDER", "COMMA", "VAR_PREFIX", 
		"GET", "GT", "LT", "LET", "EQ", "NOT_EQ", "AND", "OR", "NEWLINE", "WS", 
		"EMPTY", "BLOCK_COMMENT", "LINE_COMMENT"
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(VAR_PREFIX);
			setState(29);
			((VarExprContext)_localctx).ID = match(ID);
			((VarExprContext)_localctx).vars.add(((VarExprContext)_localctx).ID);
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					match(T__0);
					setState(31);
					((VarExprContext)_localctx).ID = match(ID);
					((VarExprContext)_localctx).vars.add(((VarExprContext)_localctx).ID);
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
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
			setState(45);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(T__2);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				((ValueContext)_localctx).STRING = match(STRING);
				((ValueContext)_localctx).result =   (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VarExprContext varExpr() {
			return getRuleContext(VarExprContext.class,0);
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
			setState(49);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				value();
				}
				break;
			case VAR_PREFIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				varExpr();
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
			setState(51);
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
			setState(54);
			calVar();
			}
			_ctx.stop = _input.LT(-1);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CalContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cal);
					setState(56);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(57);
					op();
					setState(58);
					cal(3);
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
			setState(66);
			cal(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PredictContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_predict);
					setState(68);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(69);
					andOr();
					setState(70);
					predict(3);
					}
					} 
				}
				setState(76);
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
			setState(77);
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
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				varExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
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
			setState(83);
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
			setState(85);
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
			setState(87);
			constIf();
			setState(88);
			match(T__4);
			setState(89);
			predict(0);
			setState(90);
			match(T__5);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(91);
					predictBodyTrue();
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(105);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(97);
				match(T__6);
				setState(98);
				match(T__5);
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(99);
						predictBodyFalse();
						}
						} 
					}
					setState(104);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
			}

			setState(107);
			match(T__7);
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
			setState(109);
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
			setState(111);
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
			setState(118); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(118);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(113);
						exprPredict();
						}
						break;
					case 2:
						{
						setState(114);
						varExpr();
						}
						break;
					case 3:
						{
						setState(115);
						match(T__8);
						}
						break;
					case 4:
						{
						setState(116);
						match(T__0);
						}
						break;
					case 5:
						{
						setState(117);
						matchWildcard();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(120); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\7\2#\n\2\f\2\16\2&"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\5\4\64\n\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6?\n\6\f\6\16\6B\13\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7K\n\7\f\7\16\7N\13\7\3\b\3\b\3\t\3\t\5\tT\n\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f_\n\f\f\f\16\fb\13\f\3\f\3\f\3\f"+
		"\7\fg\n\f\f\f\16\fj\13\f\5\fl\n\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\6\17y\n\17\r\17\16\17z\3\17\5`hz\4\n\f\20\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\2\5\3\2\f\r\3\2\26\33\3\2\34\35~\2\36\3\2\2\2"+
		"\4/\3\2\2\2\6\63\3\2\2\2\b\65\3\2\2\2\n\67\3\2\2\2\fC\3\2\2\2\16O\3\2"+
		"\2\2\20S\3\2\2\2\22U\3\2\2\2\24W\3\2\2\2\26Y\3\2\2\2\30o\3\2\2\2\32q\3"+
		"\2\2\2\34x\3\2\2\2\36\37\7\25\2\2\37$\7\16\2\2 !\7\3\2\2!#\7\16\2\2\""+
		" \3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\b\2\1"+
		"\2(\3\3\2\2\2)\60\7\4\2\2*\60\7\5\2\2+,\7\20\2\2,\60\b\3\1\2-.\7\f\2\2"+
		".\60\b\3\1\2/)\3\2\2\2/*\3\2\2\2/+\3\2\2\2/-\3\2\2\2\60\5\3\2\2\2\61\64"+
		"\5\4\3\2\62\64\5\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\7\3\2\2\2\65\66"+
		"\t\2\2\2\66\t\3\2\2\2\678\b\6\1\289\5\6\4\29@\3\2\2\2:;\f\4\2\2;<\5\30"+
		"\r\2<=\5\n\6\5=?\3\2\2\2>:\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\13\3"+
		"\2\2\2B@\3\2\2\2CD\b\7\1\2DE\5\n\6\2EL\3\2\2\2FG\f\4\2\2GH\5\32\16\2H"+
		"I\5\f\7\5IK\3\2\2\2JF\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\r\3\2\2\2"+
		"NL\3\2\2\2OP\7\6\2\2P\17\3\2\2\2QT\5\2\2\2RT\13\2\2\2SQ\3\2\2\2SR\3\2"+
		"\2\2T\21\3\2\2\2UV\5\20\t\2V\23\3\2\2\2WX\5\20\t\2X\25\3\2\2\2YZ\5\16"+
		"\b\2Z[\7\7\2\2[\\\5\f\7\2\\`\7\b\2\2]_\5\22\n\2^]\3\2\2\2_b\3\2\2\2`a"+
		"\3\2\2\2`^\3\2\2\2ak\3\2\2\2b`\3\2\2\2cd\7\t\2\2dh\7\b\2\2eg\5\24\13\2"+
		"fe\3\2\2\2gj\3\2\2\2hi\3\2\2\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2kc\3\2\2\2"+
		"kl\3\2\2\2lm\3\2\2\2mn\7\n\2\2n\27\3\2\2\2op\t\3\2\2p\31\3\2\2\2qr\t\4"+
		"\2\2r\33\3\2\2\2sy\5\26\f\2ty\5\2\2\2uy\7\13\2\2vy\7\3\2\2wy\13\2\2\2"+
		"xs\3\2\2\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2yz\3\2\2\2z{\3\2\2\2"+
		"zx\3\2\2\2{\35\3\2\2\2\r$/\63@LS`hkxz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}