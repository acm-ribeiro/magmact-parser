package magmact_parser;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link magmactParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface magmactVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link magmactParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(magmactParser.FormulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#quantifiedFormula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifiedFormula(magmactParser.QuantifiedFormulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(magmactParser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(magmactParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(magmactParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(magmactParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause(magmactParser.ClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(magmactParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#leftTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftTerm(magmactParser.LeftTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#rightTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightTerm(magmactParser.RightTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#noValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoValue(magmactParser.NoValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#operationPrevious}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationPrevious(magmactParser.OperationPreviousContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(magmactParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#operationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationSuffix(magmactParser.OperationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#operationHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationHeader(magmactParser.OperationHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#pathParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathParameter(magmactParser.PathParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#queryParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryParameter(magmactParser.QueryParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#operationParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationParameter(magmactParser.OperationParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#httpRequest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHttpRequest(magmactParser.HttpRequestContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(magmactParser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(magmactParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(magmactParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#booleanOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOperator(magmactParser.BooleanOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(magmactParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#stringParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringParam(magmactParser.StringParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(magmactParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#segment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment(magmactParser.SegmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(magmactParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#blockParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockParameter(magmactParser.BlockParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(magmactParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#functionID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionID(magmactParser.FunctionIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#varID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarID(magmactParser.VarIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link magmactParser#previousHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreviousHeader(magmactParser.PreviousHeaderContext ctx);
}