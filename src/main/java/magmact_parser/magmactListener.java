package magmact_parser;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link magmactParser}.
 */
public interface magmactListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link magmactParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(magmactParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(magmactParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#quantifiedFormula}.
	 * @param ctx the parse tree
	 */
	void enterQuantifiedFormula(magmactParser.QuantifiedFormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#quantifiedFormula}.
	 * @param ctx the parse tree
	 */
	void exitQuantifiedFormula(magmactParser.QuantifiedFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(magmactParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(magmactParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(magmactParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(magmactParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(magmactParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(magmactParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(magmactParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(magmactParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause(magmactParser.ClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause(magmactParser.ClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(magmactParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(magmactParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#leftTerm}.
	 * @param ctx the parse tree
	 */
	void enterLeftTerm(magmactParser.LeftTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#leftTerm}.
	 * @param ctx the parse tree
	 */
	void exitLeftTerm(magmactParser.LeftTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#rightTerm}.
	 * @param ctx the parse tree
	 */
	void enterRightTerm(magmactParser.RightTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#rightTerm}.
	 * @param ctx the parse tree
	 */
	void exitRightTerm(magmactParser.RightTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#noValue}.
	 * @param ctx the parse tree
	 */
	void enterNoValue(magmactParser.NoValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#noValue}.
	 * @param ctx the parse tree
	 */
	void exitNoValue(magmactParser.NoValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#operationPrevious}.
	 * @param ctx the parse tree
	 */
	void enterOperationPrevious(magmactParser.OperationPreviousContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#operationPrevious}.
	 * @param ctx the parse tree
	 */
	void exitOperationPrevious(magmactParser.OperationPreviousContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(magmactParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(magmactParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#operationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterOperationSuffix(magmactParser.OperationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#operationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitOperationSuffix(magmactParser.OperationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#operationHeader}.
	 * @param ctx the parse tree
	 */
	void enterOperationHeader(magmactParser.OperationHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#operationHeader}.
	 * @param ctx the parse tree
	 */
	void exitOperationHeader(magmactParser.OperationHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#pathParameter}.
	 * @param ctx the parse tree
	 */
	void enterPathParameter(magmactParser.PathParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#pathParameter}.
	 * @param ctx the parse tree
	 */
	void exitPathParameter(magmactParser.PathParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#queryParameter}.
	 * @param ctx the parse tree
	 */
	void enterQueryParameter(magmactParser.QueryParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#queryParameter}.
	 * @param ctx the parse tree
	 */
	void exitQueryParameter(magmactParser.QueryParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#operationParameter}.
	 * @param ctx the parse tree
	 */
	void enterOperationParameter(magmactParser.OperationParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#operationParameter}.
	 * @param ctx the parse tree
	 */
	void exitOperationParameter(magmactParser.OperationParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#httpRequest}.
	 * @param ctx the parse tree
	 */
	void enterHttpRequest(magmactParser.HttpRequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#httpRequest}.
	 * @param ctx the parse tree
	 */
	void exitHttpRequest(magmactParser.HttpRequestContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(magmactParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(magmactParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(magmactParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(magmactParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(magmactParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(magmactParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOperator(magmactParser.BooleanOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOperator(magmactParser.BooleanOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(magmactParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(magmactParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#stringParam}.
	 * @param ctx the parse tree
	 */
	void enterStringParam(magmactParser.StringParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#stringParam}.
	 * @param ctx the parse tree
	 */
	void exitStringParam(magmactParser.StringParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(magmactParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(magmactParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#segment}.
	 * @param ctx the parse tree
	 */
	void enterSegment(magmactParser.SegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#segment}.
	 * @param ctx the parse tree
	 */
	void exitSegment(magmactParser.SegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(magmactParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(magmactParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#blockParameter}.
	 * @param ctx the parse tree
	 */
	void enterBlockParameter(magmactParser.BlockParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#blockParameter}.
	 * @param ctx the parse tree
	 */
	void exitBlockParameter(magmactParser.BlockParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(magmactParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(magmactParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#functionID}.
	 * @param ctx the parse tree
	 */
	void enterFunctionID(magmactParser.FunctionIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#functionID}.
	 * @param ctx the parse tree
	 */
	void exitFunctionID(magmactParser.FunctionIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#varID}.
	 * @param ctx the parse tree
	 */
	void enterVarID(magmactParser.VarIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#varID}.
	 * @param ctx the parse tree
	 */
	void exitVarID(magmactParser.VarIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link magmactParser#previousHeader}.
	 * @param ctx the parse tree
	 */
	void enterPreviousHeader(magmactParser.PreviousHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link magmactParser#previousHeader}.
	 * @param ctx the parse tree
	 */
	void exitPreviousHeader(magmactParser.PreviousHeaderContext ctx);
}