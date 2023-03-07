package magmact_parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class magmactParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		THIS=32, STRING=33, INT=34, RBAR=35, LCURL=36, RCURL=37, LPAR=38, RPAR=39, 
		LSTR8=40, RSTR8=41, NEWLINE=42, WS=43;
	public static final int
		RULE_formula = 0, RULE_quantifiedFormula = 1, RULE_quantifier = 2, RULE_vars = 3, 
		RULE_call = 4, RULE_booleanExpression = 5, RULE_clause = 6, RULE_comparison = 7, 
		RULE_leftTerm = 8, RULE_rightTerm = 9, RULE_noValue = 10, RULE_operationPrevious = 11, 
		RULE_operation = 12, RULE_operationSuffix = 13, RULE_operationHeader = 14, 
		RULE_pathParameter = 15, RULE_queryParameter = 16, RULE_operationParameter = 17, 
		RULE_httpRequest = 18, RULE_url = 19, RULE_method = 20, RULE_comparator = 21, 
		RULE_booleanOperator = 22, RULE_booleanValue = 23, RULE_stringParam = 24, 
		RULE_param = 25, RULE_segment = 26, RULE_block = 27, RULE_blockParameter = 28, 
		RULE_function = 29, RULE_functionID = 30, RULE_varID = 31, RULE_previousHeader = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"formula", "quantifiedFormula", "quantifier", "vars", "call", "booleanExpression", 
			"clause", "comparison", "leftTerm", "rightTerm", "noValue", "operationPrevious", 
			"operation", "operationSuffix", "operationHeader", "pathParameter", "queryParameter", 
			"operationParameter", "httpRequest", "url", "method", "comparator", "booleanOperator", 
			"booleanValue", "stringParam", "param", "segment", "block", "blockParameter", 
			"function", "functionID", "varID", "previousHeader"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':-'", "':'", "'for'", "'exists'", "'in'", "','", "'null'", "'nil'", 
			"'none'", "'request_body'", "'response_body'", "'response_code'", "'path_param'", 
			"'query_param'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'=='", "'!='", 
			"'<='", "'>='", "'<'", "'>'", "'&&'", "'||'", "'=>'", "'T'", "'F'", "'.'", 
			"'previous'", "'this'", null, null, "'/'", "'{'", "'}'", "'('", "')'", 
			"'['", "']'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "THIS", "STRING", "INT", 
			"RBAR", "LCURL", "RCURL", "LPAR", "RPAR", "LSTR8", "RSTR8", "NEWLINE", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public magmactParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormulaContext extends ParserRuleContext {
		public QuantifiedFormulaContext quantifiedFormula() {
			return getRuleContext(QuantifiedFormulaContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitFormula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_formula);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				quantifiedFormula();
				}
				break;
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__27:
			case T__28:
			case T__30:
			case STRING:
			case INT:
			case LCURL:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				booleanExpression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QuantifiedFormulaContext extends ParserRuleContext {
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public QuantifiedFormulaContext quantifiedFormula() {
			return getRuleContext(QuantifiedFormulaContext.class,0);
		}
		public QuantifiedFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifiedFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterQuantifiedFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitQuantifiedFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitQuantifiedFormula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifiedFormulaContext quantifiedFormula() throws RecognitionException {
		QuantifiedFormulaContext _localctx = new QuantifiedFormulaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_quantifiedFormula);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				quantifier();
				setState(71);
				vars();
				setState(72);
				match(T__0);
				setState(73);
				booleanExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				quantifier();
				setState(76);
				vars();
				setState(77);
				match(T__1);
				setState(78);
				quantifiedFormula();
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

	@SuppressWarnings("CheckReturnValue")
	public static class QuantifierContext extends ParserRuleContext {
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarsContext extends ParserRuleContext {
		public VarIDContext varID() {
			return getRuleContext(VarIDContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vars);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				varID();
				setState(85);
				match(T__4);
				setState(86);
				call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				varID();
				setState(89);
				match(T__5);
				setState(90);
				vars();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public OperationPreviousContext operationPrevious() {
			return getRuleContext(OperationPreviousContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_call);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				operation();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				operationPrevious();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionContext extends ParserRuleContext {
		public ClauseContext clause() {
			return getRuleContext(ClauseContext.class,0);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public BooleanOperatorContext booleanOperator() {
			return getRuleContext(BooleanOperatorContext.class,0);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(99);
			clause();
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BooleanExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
					setState(101);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(102);
					booleanOperator();
					setState(103);
					booleanExpression(3);
					}
					} 
				}
				setState(109);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClauseContext extends ParserRuleContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_clause);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				booleanValue();
				}
				break;
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__30:
			case STRING:
			case INT:
			case LCURL:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				comparison();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public LeftTermContext leftTerm() {
			return getRuleContext(LeftTermContext.class,0);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public RightTermContext rightTerm() {
			return getRuleContext(RightTermContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			leftTerm();
			setState(115);
			comparator();
			setState(116);
			rightTerm();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LeftTermContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(magmactParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(magmactParser.RCURL, 0); }
		public LeftTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterLeftTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitLeftTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitLeftTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftTermContext leftTerm() throws RecognitionException {
		LeftTermContext _localctx = new LeftTermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_leftTerm);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				call();
				}
				break;
			case STRING:
			case INT:
			case LCURL:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LCURL) {
					{
					setState(119);
					match(LCURL);
					}
				}

				setState(122);
				param();
				setState(124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(123);
					match(RCURL);
					}
					break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class RightTermContext extends ParserRuleContext {
		public LeftTermContext leftTerm() {
			return getRuleContext(LeftTermContext.class,0);
		}
		public NoValueContext noValue() {
			return getRuleContext(NoValueContext.class,0);
		}
		public RightTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterRightTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitRightTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitRightTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightTermContext rightTerm() throws RecognitionException {
		RightTermContext _localctx = new RightTermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rightTerm);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__30:
			case STRING:
			case INT:
			case LCURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				leftTerm();
				}
				break;
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				noValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NoValueContext extends ParserRuleContext {
		public NoValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterNoValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitNoValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitNoValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoValueContext noValue() throws RecognitionException {
		NoValueContext _localctx = new NoValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_noValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperationPreviousContext extends ParserRuleContext {
		public PreviousHeaderContext previousHeader() {
			return getRuleContext(PreviousHeaderContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(magmactParser.LPAR, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(magmactParser.RPAR, 0); }
		public OperationPreviousContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationPrevious; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterOperationPrevious(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitOperationPrevious(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitOperationPrevious(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationPreviousContext operationPrevious() throws RecognitionException {
		OperationPreviousContext _localctx = new OperationPreviousContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operationPrevious);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			previousHeader();
			setState(135);
			match(LPAR);
			setState(136);
			operation();
			setState(137);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public OperationHeaderContext operationHeader() {
			return getRuleContext(OperationHeaderContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(magmactParser.LPAR, 0); }
		public OperationParameterContext operationParameter() {
			return getRuleContext(OperationParameterContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(magmactParser.RPAR, 0); }
		public OperationSuffixContext operationSuffix() {
			return getRuleContext(OperationSuffixContext.class,0);
		}
		public PathParameterContext pathParameter() {
			return getRuleContext(PathParameterContext.class,0);
		}
		public QueryParameterContext queryParameter() {
			return getRuleContext(QueryParameterContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operation);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				operationHeader();
				setState(140);
				match(LPAR);
				setState(141);
				operationParameter();
				setState(142);
				match(RPAR);
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(143);
					operationSuffix();
					}
					break;
				}
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				pathParameter();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				queryParameter();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperationSuffixContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(magmactParser.LCURL, 0); }
		public StringParamContext stringParam() {
			return getRuleContext(StringParamContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(magmactParser.RCURL, 0); }
		public OperationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterOperationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitOperationSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitOperationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationSuffixContext operationSuffix() throws RecognitionException {
		OperationSuffixContext _localctx = new OperationSuffixContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operationSuffix);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				function();
				}
				break;
			case LCURL:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(LCURL);
				setState(152);
				stringParam();
				setState(153);
				match(RCURL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperationHeaderContext extends ParserRuleContext {
		public OperationHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterOperationHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitOperationHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitOperationHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationHeaderContext operationHeader() throws RecognitionException {
		OperationHeaderContext _localctx = new OperationHeaderContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operationHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PathParameterContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(magmactParser.LPAR, 0); }
		public TerminalNode THIS() { return getToken(magmactParser.THIS, 0); }
		public TerminalNode LSTR8() { return getToken(magmactParser.LSTR8, 0); }
		public TerminalNode INT() { return getToken(magmactParser.INT, 0); }
		public TerminalNode RSTR8() { return getToken(magmactParser.RSTR8, 0); }
		public TerminalNode RPAR() { return getToken(magmactParser.RPAR, 0); }
		public PathParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterPathParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitPathParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitPathParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathParameterContext pathParameter() throws RecognitionException {
		PathParameterContext _localctx = new PathParameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pathParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__12);
			setState(160);
			match(LPAR);
			setState(161);
			match(THIS);
			setState(162);
			match(LSTR8);
			setState(163);
			match(INT);
			setState(164);
			match(RSTR8);
			setState(165);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QueryParameterContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(magmactParser.LPAR, 0); }
		public TerminalNode THIS() { return getToken(magmactParser.THIS, 0); }
		public TerminalNode RPAR() { return getToken(magmactParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(magmactParser.LCURL, 0); }
		public TerminalNode STRING() { return getToken(magmactParser.STRING, 0); }
		public TerminalNode RCURL() { return getToken(magmactParser.RCURL, 0); }
		public QueryParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterQueryParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitQueryParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitQueryParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryParameterContext queryParameter() throws RecognitionException {
		QueryParameterContext _localctx = new QueryParameterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_queryParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__13);
			setState(168);
			match(LPAR);
			setState(169);
			match(THIS);
			setState(170);
			match(RPAR);
			setState(171);
			match(LCURL);
			setState(172);
			match(STRING);
			setState(173);
			match(RCURL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperationParameterContext extends ParserRuleContext {
		public HttpRequestContext httpRequest() {
			return getRuleContext(HttpRequestContext.class,0);
		}
		public TerminalNode THIS() { return getToken(magmactParser.THIS, 0); }
		public OperationParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterOperationParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitOperationParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitOperationParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationParameterContext operationParameter() throws RecognitionException {
		OperationParameterContext _localctx = new OperationParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operationParameter);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				httpRequest();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(THIS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HttpRequestContext extends ParserRuleContext {
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public HttpRequestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_httpRequest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterHttpRequest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitHttpRequest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitHttpRequest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HttpRequestContext httpRequest() throws RecognitionException {
		HttpRequestContext _localctx = new HttpRequestContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_httpRequest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			method();
			setState(180);
			url();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UrlContext extends ParserRuleContext {
		public List<SegmentContext> segment() {
			return getRuleContexts(SegmentContext.class);
		}
		public SegmentContext segment(int i) {
			return getRuleContext(SegmentContext.class,i);
		}
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_url);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				segment();
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RBAR );
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodContext extends ParserRuleContext {
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 491520L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparatorContext extends ParserRuleContext {
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 33030144L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanOperatorContext extends ParserRuleContext {
		public BooleanOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterBooleanOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitBooleanOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitBooleanOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanOperatorContext booleanOperator() throws RecognitionException {
		BooleanOperatorContext _localctx = new BooleanOperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_booleanOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanValueContext extends ParserRuleContext {
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringParamContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(magmactParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(magmactParser.STRING, i);
		}
		public StringParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterStringParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitStringParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitStringParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringParamContext stringParam() throws RecognitionException {
		StringParamContext _localctx = new StringParamContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_stringParam);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(STRING);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					match(T__29);
					setState(197);
					match(STRING);
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public StringParamContext stringParam() {
			return getRuleContext(StringParamContext.class,0);
		}
		public TerminalNode INT() { return getToken(magmactParser.INT, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_param);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				stringParam();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SegmentContext extends ParserRuleContext {
		public TerminalNode RBAR() { return getToken(magmactParser.RBAR, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public SegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegmentContext segment() throws RecognitionException {
		SegmentContext _localctx = new SegmentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(RBAR);
			setState(208);
			block();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(209);
				match(T__29);
				setState(210);
				block();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(magmactParser.LCURL, 0); }
		public BlockParameterContext blockParameter() {
			return getRuleContext(BlockParameterContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(magmactParser.RCURL, 0); }
		public TerminalNode STRING() { return getToken(magmactParser.STRING, 0); }
		public TerminalNode INT() { return getToken(magmactParser.INT, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_block);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(LCURL);
				setState(217);
				blockParameter();
				setState(218);
				match(RCURL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(STRING);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(INT);
				}
				break;
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				operation();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockParameterContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(magmactParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(magmactParser.STRING, i);
		}
		public BlockParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterBlockParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitBlockParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitBlockParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockParameterContext blockParameter() throws RecognitionException {
		BlockParameterContext _localctx = new BlockParameterContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_blockParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(STRING);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(226);
				match(T__29);
				setState(227);
				match(STRING);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public FunctionIDContext functionID() {
			return getRuleContext(FunctionIDContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__29);
			setState(231);
			functionID();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionIDContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(magmactParser.STRING, 0); }
		public FunctionIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterFunctionID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitFunctionID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitFunctionID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIDContext functionID() throws RecognitionException {
		FunctionIDContext _localctx = new FunctionIDContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_functionID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarIDContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(magmactParser.STRING, 0); }
		public VarIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterVarID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitVarID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitVarID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarIDContext varID() throws RecognitionException {
		VarIDContext _localctx = new VarIDContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_varID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PreviousHeaderContext extends ParserRuleContext {
		public PreviousHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_previousHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).enterPreviousHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof magmactListener) ((magmactListener)listener).exitPreviousHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof magmactVisitor) return ((magmactVisitor<? extends T>)visitor).visitPreviousHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreviousHeaderContext previousHeader() throws RecognitionException {
		PreviousHeaderContext _localctx = new PreviousHeaderContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_previousHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__30);
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
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u00f0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001\u0000\u0003\u0000"+
		"E\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"Q\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"]\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004a\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005j\b\u0005\n\u0005\f\u0005m\t\u0005\u0001\u0006\u0001\u0006\u0003"+
		"\u0006q\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0003\by\b\b\u0001\b\u0001\b\u0003\b}\b\b\u0003\b\u007f\b\b"+
		"\u0001\t\u0001\t\u0003\t\u0083\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0091\b\f\u0001\f\u0001\f\u0003\f\u0095\b\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u009c\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00b2\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0004"+
		"\u0013\u00b8\b\u0013\u000b\u0013\f\u0013\u00b9\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u00c7\b\u0018\n\u0018"+
		"\f\u0018\u00ca\t\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u00ce\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u00d4\b\u001a"+
		"\n\u001a\f\u001a\u00d7\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u00e0\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u00e5\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0000\u0001\n!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000\u0007"+
		"\u0001\u0000\u0003\u0004\u0001\u0000\u0007\t\u0001\u0000\n\f\u0001\u0000"+
		"\u000f\u0012\u0001\u0000\u0013\u0018\u0001\u0000\u0019\u001b\u0001\u0000"+
		"\u001c\u001d\u00e5\u0000D\u0001\u0000\u0000\u0000\u0002P\u0001\u0000\u0000"+
		"\u0000\u0004R\u0001\u0000\u0000\u0000\u0006\\\u0001\u0000\u0000\u0000"+
		"\b`\u0001\u0000\u0000\u0000\nb\u0001\u0000\u0000\u0000\fp\u0001\u0000"+
		"\u0000\u0000\u000er\u0001\u0000\u0000\u0000\u0010~\u0001\u0000\u0000\u0000"+
		"\u0012\u0082\u0001\u0000\u0000\u0000\u0014\u0084\u0001\u0000\u0000\u0000"+
		"\u0016\u0086\u0001\u0000\u0000\u0000\u0018\u0094\u0001\u0000\u0000\u0000"+
		"\u001a\u009b\u0001\u0000\u0000\u0000\u001c\u009d\u0001\u0000\u0000\u0000"+
		"\u001e\u009f\u0001\u0000\u0000\u0000 \u00a7\u0001\u0000\u0000\u0000\""+
		"\u00b1\u0001\u0000\u0000\u0000$\u00b3\u0001\u0000\u0000\u0000&\u00b7\u0001"+
		"\u0000\u0000\u0000(\u00bb\u0001\u0000\u0000\u0000*\u00bd\u0001\u0000\u0000"+
		"\u0000,\u00bf\u0001\u0000\u0000\u0000.\u00c1\u0001\u0000\u0000\u00000"+
		"\u00c3\u0001\u0000\u0000\u00002\u00cd\u0001\u0000\u0000\u00004\u00cf\u0001"+
		"\u0000\u0000\u00006\u00df\u0001\u0000\u0000\u00008\u00e1\u0001\u0000\u0000"+
		"\u0000:\u00e6\u0001\u0000\u0000\u0000<\u00e9\u0001\u0000\u0000\u0000>"+
		"\u00eb\u0001\u0000\u0000\u0000@\u00ed\u0001\u0000\u0000\u0000BE\u0003"+
		"\u0002\u0001\u0000CE\u0003\n\u0005\u0000DB\u0001\u0000\u0000\u0000DC\u0001"+
		"\u0000\u0000\u0000E\u0001\u0001\u0000\u0000\u0000FG\u0003\u0004\u0002"+
		"\u0000GH\u0003\u0006\u0003\u0000HI\u0005\u0001\u0000\u0000IJ\u0003\n\u0005"+
		"\u0000JQ\u0001\u0000\u0000\u0000KL\u0003\u0004\u0002\u0000LM\u0003\u0006"+
		"\u0003\u0000MN\u0005\u0002\u0000\u0000NO\u0003\u0002\u0001\u0000OQ\u0001"+
		"\u0000\u0000\u0000PF\u0001\u0000\u0000\u0000PK\u0001\u0000\u0000\u0000"+
		"Q\u0003\u0001\u0000\u0000\u0000RS\u0007\u0000\u0000\u0000S\u0005\u0001"+
		"\u0000\u0000\u0000TU\u0003>\u001f\u0000UV\u0005\u0005\u0000\u0000VW\u0003"+
		"\b\u0004\u0000W]\u0001\u0000\u0000\u0000XY\u0003>\u001f\u0000YZ\u0005"+
		"\u0006\u0000\u0000Z[\u0003\u0006\u0003\u0000[]\u0001\u0000\u0000\u0000"+
		"\\T\u0001\u0000\u0000\u0000\\X\u0001\u0000\u0000\u0000]\u0007\u0001\u0000"+
		"\u0000\u0000^a\u0003\u0018\f\u0000_a\u0003\u0016\u000b\u0000`^\u0001\u0000"+
		"\u0000\u0000`_\u0001\u0000\u0000\u0000a\t\u0001\u0000\u0000\u0000bc\u0006"+
		"\u0005\uffff\uffff\u0000cd\u0003\f\u0006\u0000dk\u0001\u0000\u0000\u0000"+
		"ef\n\u0002\u0000\u0000fg\u0003,\u0016\u0000gh\u0003\n\u0005\u0003hj\u0001"+
		"\u0000\u0000\u0000ie\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\u000b\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000nq\u0003.\u0017\u0000oq\u0003\u000e"+
		"\u0007\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000q\r\u0001"+
		"\u0000\u0000\u0000rs\u0003\u0010\b\u0000st\u0003*\u0015\u0000tu\u0003"+
		"\u0012\t\u0000u\u000f\u0001\u0000\u0000\u0000v\u007f\u0003\b\u0004\u0000"+
		"wy\u0005$\u0000\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000z|\u00032\u0019\u0000{}\u0005%\u0000\u0000|"+
		"{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000"+
		"\u0000\u0000~v\u0001\u0000\u0000\u0000~x\u0001\u0000\u0000\u0000\u007f"+
		"\u0011\u0001\u0000\u0000\u0000\u0080\u0083\u0003\u0010\b\u0000\u0081\u0083"+
		"\u0003\u0014\n\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0013\u0001\u0000\u0000\u0000\u0084\u0085\u0007"+
		"\u0001\u0000\u0000\u0085\u0015\u0001\u0000\u0000\u0000\u0086\u0087\u0003"+
		"@ \u0000\u0087\u0088\u0005&\u0000\u0000\u0088\u0089\u0003\u0018\f\u0000"+
		"\u0089\u008a\u0005\'\u0000\u0000\u008a\u0017\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0003\u001c\u000e\u0000\u008c\u008d\u0005&\u0000\u0000\u008d\u008e"+
		"\u0003\"\u0011\u0000\u008e\u0090\u0005\'\u0000\u0000\u008f\u0091\u0003"+
		"\u001a\r\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u0095\u0001\u0000\u0000\u0000\u0092\u0095\u0003\u001e"+
		"\u000f\u0000\u0093\u0095\u0003 \u0010\u0000\u0094\u008b\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000"+
		"\u0000\u0095\u0019\u0001\u0000\u0000\u0000\u0096\u009c\u0003:\u001d\u0000"+
		"\u0097\u0098\u0005$\u0000\u0000\u0098\u0099\u00030\u0018\u0000\u0099\u009a"+
		"\u0005%\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0096\u0001"+
		"\u0000\u0000\u0000\u009b\u0097\u0001\u0000\u0000\u0000\u009c\u001b\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0007\u0002\u0000\u0000\u009e\u001d\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005\r\u0000\u0000\u00a0\u00a1\u0005&"+
		"\u0000\u0000\u00a1\u00a2\u0005 \u0000\u0000\u00a2\u00a3\u0005(\u0000\u0000"+
		"\u00a3\u00a4\u0005\"\u0000\u0000\u00a4\u00a5\u0005)\u0000\u0000\u00a5"+
		"\u00a6\u0005\'\u0000\u0000\u00a6\u001f\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0005\u000e\u0000\u0000\u00a8\u00a9\u0005&\u0000\u0000\u00a9\u00aa\u0005"+
		" \u0000\u0000\u00aa\u00ab\u0005\'\u0000\u0000\u00ab\u00ac\u0005$\u0000"+
		"\u0000\u00ac\u00ad\u0005!\u0000\u0000\u00ad\u00ae\u0005%\u0000\u0000\u00ae"+
		"!\u0001\u0000\u0000\u0000\u00af\u00b2\u0003$\u0012\u0000\u00b0\u00b2\u0005"+
		" \u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2#\u0001\u0000\u0000\u0000\u00b3\u00b4\u0003(\u0014\u0000"+
		"\u00b4\u00b5\u0003&\u0013\u0000\u00b5%\u0001\u0000\u0000\u0000\u00b6\u00b8"+
		"\u00034\u001a\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001"+
		"\u0000\u0000\u0000\u00ba\'\u0001\u0000\u0000\u0000\u00bb\u00bc\u0007\u0003"+
		"\u0000\u0000\u00bc)\u0001\u0000\u0000\u0000\u00bd\u00be\u0007\u0004\u0000"+
		"\u0000\u00be+\u0001\u0000\u0000\u0000\u00bf\u00c0\u0007\u0005\u0000\u0000"+
		"\u00c0-\u0001\u0000\u0000\u0000\u00c1\u00c2\u0007\u0006\u0000\u0000\u00c2"+
		"/\u0001\u0000\u0000\u0000\u00c3\u00c8\u0005!\u0000\u0000\u00c4\u00c5\u0005"+
		"\u001e\u0000\u0000\u00c5\u00c7\u0005!\u0000\u0000\u00c6\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c91\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00ce\u00030\u0018\u0000"+
		"\u00cc\u00ce\u0005\"\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd"+
		"\u00cc\u0001\u0000\u0000\u0000\u00ce3\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0005#\u0000\u0000\u00d0\u00d5\u00036\u001b\u0000\u00d1\u00d2\u0005\u001e"+
		"\u0000\u0000\u00d2\u00d4\u00036\u001b\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d65\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005$\u0000\u0000\u00d9"+
		"\u00da\u00038\u001c\u0000\u00da\u00db\u0005%\u0000\u0000\u00db\u00e0\u0001"+
		"\u0000\u0000\u0000\u00dc\u00e0\u0005!\u0000\u0000\u00dd\u00e0\u0005\""+
		"\u0000\u0000\u00de\u00e0\u0003\u0018\f\u0000\u00df\u00d8\u0001\u0000\u0000"+
		"\u0000\u00df\u00dc\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000"+
		"\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e07\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e4\u0005!\u0000\u0000\u00e2\u00e3\u0005\u001e\u0000\u0000\u00e3"+
		"\u00e5\u0005!\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e59\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005"+
		"\u001e\u0000\u0000\u00e7\u00e8\u0003<\u001e\u0000\u00e8;\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0005!\u0000\u0000\u00ea=\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0005!\u0000\u0000\u00ec?\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005"+
		"\u001f\u0000\u0000\u00eeA\u0001\u0000\u0000\u0000\u0014DP\\`kpx|~\u0082"+
		"\u0090\u0094\u009b\u00b1\u00b9\u00c8\u00cd\u00d5\u00df\u00e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}