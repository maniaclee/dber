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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, INT=8, LONG=9, 
		ID=10, NULL=11, STRING=12, VAR_PREFIX=13, GET=14, GT=15, LT=16, LET=17, 
		EQ=18, NOT_EQ=19, AND=20, OR=21, NEWLINE=22, WS=23, EMPTY=24, BLOCK_COMMENT=25, 
		LINE_COMMENT=26;
	public static final int
		RULE_num = 0, RULE_value = 1, RULE_varExpr = 2, RULE_calVar = 3, RULE_cal = 4, 
		RULE_predict = 5, RULE_constIf = 6, RULE_any = 7, RULE_exprSimple = 8, 
		RULE_predictBodyTrue = 9, RULE_predictBodyFalse = 10, RULE_exprPredict = 11, 
		RULE_op = 12, RULE_andOr = 13, RULE_sentence = 14;
	public static final String[] ruleNames = {
		"num", "value", "varExpr", "calVar", "cal", "predict", "constIf", "any", 
		"exprSimple", "predictBodyTrue", "predictBodyFalse", "exprPredict", "op", 
		"andOr", "sentence"
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
		public Token INT;
		public Token LONG;
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
		try {
			setState(34);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				((NumContext)_localctx).INT = match(INT);
				java.lang.Number x = (((NumContext)_localctx).INT!=null?Integer.valueOf(((NumContext)_localctx).INT.getText()):0);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				((NumContext)_localctx).LONG = match(LONG);
				java.lang.Number x = java.lang.Long.parseLong((((NumContext)_localctx).LONG!=null?((NumContext)_localctx).LONG.getText():null));
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
			setState(39);
			switch (_input.LA(1)) {
			case INT:
			case LONG:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				num();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(STRING);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
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
			setState(41);
			match(VAR_PREFIX);
			setState(42);
			match(T__0);
			setState(43);
			((VarExprContext)_localctx).ID = match(ID);
			((VarExprContext)_localctx).vars.add(((VarExprContext)_localctx).ID);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(44);
				match(T__1);
				setState(45);
				((VarExprContext)_localctx).ID = match(ID);
				((VarExprContext)_localctx).vars.add(((VarExprContext)_localctx).ID);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(DberParser.ID, 0); }
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
			setState(55);
			switch (_input.LA(1)) {
			case INT:
			case LONG:
			case NULL:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				value();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(ID);
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
		public List<CalVarContext> calVar() {
			return getRuleContexts(CalVarContext.class);
		}
		public CalVarContext calVar(int i) {
			return getRuleContext(CalVarContext.class,i);
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
		CalContext _localctx = new CalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cal);
		try {
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				calVar();
				setState(58);
				op();
				setState(59);
				calVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				calVar();
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
			setState(65);
			cal();
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
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
					setState(67);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(68);
					andOr();
					setState(69);
					predict(3);
					}
					} 
				}
				setState(75);
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
			setState(76);
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

	public static class AnyContext extends ParserRuleContext {
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).enterAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DberListener ) ((DberListener)listener).exitAny(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_any);
		try {
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
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

	public static class ExprSimpleContext extends ParserRuleContext {
		public VarExprContext varExpr() {
			return getRuleContext(VarExprContext.class,0);
		}
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
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
		enterRule(_localctx, 16, RULE_exprSimple);
		try {
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				varExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				any();
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
		enterRule(_localctx, 18, RULE_predictBodyTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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
		enterRule(_localctx, 20, RULE_predictBodyFalse);
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
		enterRule(_localctx, 22, RULE_exprPredict);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			constIf();
			setState(91);
			match(T__0);
			setState(92);
			predict(0);
			setState(93);
			match(T__5);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(94);
					predictBodyTrue();
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(108);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(100);
				match(T__6);
				setState(101);
				match(T__5);
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(102);
						predictBodyFalse();
						}
						} 
					}
					setState(107);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
			}

			setState(110);
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
		enterRule(_localctx, 24, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
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
		enterRule(_localctx, 26, RULE_andOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
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
		public List<ExprSimpleContext> exprSimple() {
			return getRuleContexts(ExprSimpleContext.class);
		}
		public ExprSimpleContext exprSimple(int i) {
			return getRuleContext(ExprSimpleContext.class,i);
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
		enterRule(_localctx, 28, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(118);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(116);
					exprPredict();
					}
					break;
				case 2:
					{
					setState(117);
					exprSimple();
					}
					break;
				}
				}
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << INT) | (1L << LONG) | (1L << ID) | (1L << NULL) | (1L << STRING) | (1L << VAR_PREFIX) | (1L << GET) | (1L << GT) | (1L << LT) | (1L << LET) | (1L << EQ) | (1L << NOT_EQ) | (1L << AND) | (1L << OR) | (1L << NEWLINE) | (1L << WS) | (1L << EMPTY) | (1L << BLOCK_COMMENT) | (1L << LINE_COMMENT))) != 0) );
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
		case 5:
			return predict_sempred((PredictContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean predict_sempred(PredictContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\5\2%\n\2"+
		"\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\7\4\61\n\4\f\4\16\4\64\13\4"+
		"\3\4\3\4\3\5\3\5\5\5:\n\5\3\6\3\6\3\6\3\6\3\6\5\6A\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\b\3\b\3\t\3\t\5\tS\n\t\3\n\3\n"+
		"\5\nW\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\rb\n\r\f\r\16\re\13"+
		"\r\3\r\3\r\3\r\7\rj\n\r\f\r\16\rm\13\r\5\ro\n\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\6\20y\n\20\r\20\16\20z\3\20\4ck\3\f\21\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36\2\4\3\2\20\25\3\2\26\27{\2$\3\2\2\2\4)\3\2\2"+
		"\2\6+\3\2\2\2\b9\3\2\2\2\n@\3\2\2\2\fB\3\2\2\2\16N\3\2\2\2\20R\3\2\2\2"+
		"\22V\3\2\2\2\24X\3\2\2\2\26Z\3\2\2\2\30\\\3\2\2\2\32r\3\2\2\2\34t\3\2"+
		"\2\2\36x\3\2\2\2 !\7\n\2\2!%\b\2\1\2\"#\7\13\2\2#%\b\2\1\2$ \3\2\2\2$"+
		"\"\3\2\2\2%\3\3\2\2\2&*\5\2\2\2\'*\7\16\2\2(*\7\r\2\2)&\3\2\2\2)\'\3\2"+
		"\2\2)(\3\2\2\2*\5\3\2\2\2+,\7\17\2\2,-\7\3\2\2-\62\7\f\2\2./\7\4\2\2/"+
		"\61\7\f\2\2\60.\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65"+
		"\3\2\2\2\64\62\3\2\2\2\65\66\7\5\2\2\66\7\3\2\2\2\67:\5\4\3\28:\7\f\2"+
		"\29\67\3\2\2\298\3\2\2\2:\t\3\2\2\2;<\5\b\5\2<=\5\32\16\2=>\5\b\5\2>A"+
		"\3\2\2\2?A\5\b\5\2@;\3\2\2\2@?\3\2\2\2A\13\3\2\2\2BC\b\7\1\2CD\5\n\6\2"+
		"DK\3\2\2\2EF\f\4\2\2FG\5\34\17\2GH\5\f\7\5HJ\3\2\2\2IE\3\2\2\2JM\3\2\2"+
		"\2KI\3\2\2\2KL\3\2\2\2L\r\3\2\2\2MK\3\2\2\2NO\7\6\2\2O\17\3\2\2\2PS\7"+
		"\7\2\2QS\13\2\2\2RP\3\2\2\2RQ\3\2\2\2S\21\3\2\2\2TW\5\6\4\2UW\5\20\t\2"+
		"VT\3\2\2\2VU\3\2\2\2W\23\3\2\2\2XY\5\22\n\2Y\25\3\2\2\2Z[\5\22\n\2[\27"+
		"\3\2\2\2\\]\5\16\b\2]^\7\3\2\2^_\5\f\7\2_c\7\b\2\2`b\5\24\13\2a`\3\2\2"+
		"\2be\3\2\2\2cd\3\2\2\2ca\3\2\2\2dn\3\2\2\2ec\3\2\2\2fg\7\t\2\2gk\7\b\2"+
		"\2hj\5\26\f\2ih\3\2\2\2jm\3\2\2\2kl\3\2\2\2ki\3\2\2\2lo\3\2\2\2mk\3\2"+
		"\2\2nf\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\5\2\2q\31\3\2\2\2rs\t\2\2\2s\33"+
		"\3\2\2\2tu\t\3\2\2u\35\3\2\2\2vy\5\30\r\2wy\5\22\n\2xv\3\2\2\2xw\3\2\2"+
		"\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\37\3\2\2\2\17$)\629@KRVcknxz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}