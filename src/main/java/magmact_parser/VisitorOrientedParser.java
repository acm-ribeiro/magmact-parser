package magmact_parser;

import magmact_domain.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;

import static java.util.stream.Collectors.toList;


@SuppressWarnings("deprecation")
public class VisitorOrientedParser {

    public Formula parse(String s) {
        CharStream charStream = new ANTLRInputStream(s);
        magmactLexer lexer = new magmactLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        magmactParser parser = new magmactParser(tokens);

        magmactVisitor visitor = new magmactVisitor();

        return visitor.visit(parser.formula());
    }


    private static class magmactVisitor extends magmactBaseVisitor<Formula> {
        @Override
        public Formula visitFormula(magmactParser.FormulaContext ctx) {
            QuantifiedFormulaVisitor quantifiedFormulaVisitor = new QuantifiedFormulaVisitor();
            QuantifiedFormula quantifiedFormula = ctx.quantifiedFormula() != null ? ctx.quantifiedFormula().accept(quantifiedFormulaVisitor) : null;

            BooleanExpressionVisitor booleanExpressionVisitor = new BooleanExpressionVisitor();
            BooleanExpression booleanExpression = ctx.booleanExpression() != null ? ctx.booleanExpression().accept(booleanExpressionVisitor) : null;

            return new Formula(quantifiedFormula, booleanExpression);
        }

        public static class QuantifiedFormulaVisitor extends magmactBaseVisitor<QuantifiedFormula> {
            @Override
            public QuantifiedFormula visitQuantifiedFormula(magmactParser.QuantifiedFormulaContext ctx) {
                QuantifierVisitor quantifierVisitor = new QuantifierVisitor();
                Quantifier quantifier = ctx.quantifier().accept(quantifierVisitor);

                VarsVisitor varsVisitor = new VarsVisitor();
                Variables vars = ctx.vars().accept(varsVisitor);

                BooleanExpressionVisitor booleanExpressionVisitor = new BooleanExpressionVisitor();
                BooleanExpression booleanExpression = ctx.booleanExpression() != null ? ctx.booleanExpression().accept(booleanExpressionVisitor) : null;

                QuantifiedFormulaVisitor quantifiedFormulaVisitor = new QuantifiedFormulaVisitor();
                QuantifiedFormula quantifiedFormula = ctx.quantifiedFormula() != null ? ctx.quantifiedFormula().accept(quantifiedFormulaVisitor) : null;

                return new QuantifiedFormula(quantifier, vars, booleanExpression, quantifiedFormula);
            }
        }

        public static class BooleanExpressionVisitor extends magmactBaseVisitor<BooleanExpression> {
            @Override
            public BooleanExpression visitBooleanExpression(magmactParser.BooleanExpressionContext ctx) {
                ClauseVisitor clauseVisitor = new ClauseVisitor();
                Clause clause = ctx.clause() != null ? ctx.clause().accept(clauseVisitor) : null;

                BooleanExpressionVisitor booleanExpressionVisitor = new BooleanExpressionVisitor();
                BooleanExpression left = ctx.booleanExpression(0) != null ? ctx.booleanExpression(0).accept(booleanExpressionVisitor) : null;
                BooleanExpression right = ctx.booleanExpression(1) != null ? ctx.booleanExpression(1).accept(booleanExpressionVisitor) : null;

                BooleanOperatorVisitor booleanOperatorVisitor = new BooleanOperatorVisitor();
                BooleanOperator op = ctx.booleanOperator() != null ? ctx.booleanOperator().accept(booleanOperatorVisitor) : null;

                return new BooleanExpression(clause, left, right, op);
            }

        }

        public static class QuantifierVisitor extends magmactBaseVisitor<Quantifier> {
            @Override
            public Quantifier visitQuantifier(magmactParser.QuantifierContext ctx) {
                String quantifier = ctx.getText();
                return new Quantifier(quantifier);
            }
        }

        public static class VarsVisitor extends magmactBaseVisitor<Variables> {
            @Override
            public Variables visitVars(magmactParser.VarsContext ctx) {
                String varID = ctx.varID().getText();

                CallVisitor callVisitor = new CallVisitor();
                Call call = ctx.call() != null ? ctx.call().accept(callVisitor) : null;

                VarsVisitor varsVisitor = new VarsVisitor();
                Variables vars = ctx.vars() != null ? ctx.vars().accept(varsVisitor) : null;

                return new Variables(varID, call, vars);
            }
        }

        public static class CallVisitor extends magmactBaseVisitor<Call> {
            @Override
            public Call visitCall(magmactParser.CallContext ctx) {
                OperationVisitor operationVisitor = new OperationVisitor();
                Operation operation = ctx.operation() != null ? ctx.operation().accept(operationVisitor) : null;

                OperationPreviousVisitor operationPreviousVisitor = new OperationPreviousVisitor();
                OperationPrevious operationPrevious = ctx.operationPrevious() != null ? ctx.operationPrevious().accept(operationPreviousVisitor) : null;

                return new Call(operation, operationPrevious);
            }
        }

        public static class ClauseVisitor extends magmactBaseVisitor<Clause> {
            @Override
            public Clause visitClause(magmactParser.ClauseContext ctx) {
                BooleanValueVisitor booleanValueVisitor = new BooleanValueVisitor();
                BooleanValue booleanValue = ctx.booleanValue() != null ? ctx.booleanValue().accept(booleanValueVisitor) : null;

                ComparisonVisitor comparisonVisitor = new ComparisonVisitor();
                Comparison comparison = ctx.comparison() != null ? ctx.comparison().accept(comparisonVisitor) : null;

                return new Clause(booleanValue, comparison);
            }
        }

        public static class BooleanValueVisitor extends magmactBaseVisitor<BooleanValue> {
            @Override
            public BooleanValue visitBooleanValue(@NotNull magmactParser.BooleanValueContext ctx) {
                String value = ctx.getText();
                return new BooleanValue(value);
            }
        }

        public static class BooleanOperatorVisitor extends magmactBaseVisitor<BooleanOperator> {
            @Override
            public BooleanOperator visitBooleanOperator(@NotNull magmactParser.BooleanOperatorContext ctx) {
                String operator = ctx.getText();
                return new BooleanOperator(operator);
            }
        }


        public static class ComparisonVisitor extends magmactBaseVisitor<Comparison> {
            @Override
            public Comparison visitComparison(@NotNull magmactParser.ComparisonContext ctx) {
                LeftTermVisitor leftTermVisitor = new LeftTermVisitor();
                RightTermVisitor rightTermVisitor = new RightTermVisitor();

                LeftTerm left = ctx.leftTerm().accept(leftTermVisitor);
                RightTerm right = ctx.rightTerm().accept(rightTermVisitor);

                ComparatorVisitor comparatorVisitor = new ComparatorVisitor();
                Comparator comparator = ctx.comparator().accept(comparatorVisitor);

                return new Comparison(left, right, comparator);
            }
        }

        public static class RightTermVisitor extends magmactBaseVisitor<RightTerm> {
            @Override
            public RightTerm visitRightTerm(@NotNull magmactParser.RightTermContext ctx) {

                LeftTermVisitor leftTermVisitor = new LeftTermVisitor();
                LeftTerm leftTerm = ctx.leftTerm() != null ? ctx.leftTerm().accept(leftTermVisitor) : null;

                String noValue = ctx.getText();

                return new RightTerm(leftTerm, noValue);
            }
        }


        public static class LeftTermVisitor extends magmactBaseVisitor<LeftTerm> {
            @Override
            public LeftTerm visitLeftTerm(@NotNull magmactParser.LeftTermContext ctx) {

                CallVisitor callVisitor = new CallVisitor();
                Call call = ctx.call() != null ? ctx.call().accept(callVisitor) : null;

                ParamVisitor paramVisitor = new ParamVisitor();
                Param param = ctx.param() != null ? ctx.param().accept(paramVisitor) : null;

                boolean hasCurls = ctx.LCURL() != null && ctx.RCURL() != null;

                return new LeftTerm(call, param, hasCurls);
            }
        }


        public static class ParamVisitor extends magmactBaseVisitor<Param> {
            @Override
            public Param visitParam(@NotNull magmactParser.ParamContext ctx) {
                StringParamVisitor stringParamVisitor = new StringParamVisitor();
                StringParam stringParam = ctx.stringParam() != null ? ctx.stringParam().accept(stringParamVisitor) : null;

                Integer intParam = ctx.INT() != null ? Integer.parseInt(ctx.getText()) : null;

                return new Param(stringParam, intParam);
            }
        }

        public static class ComparatorVisitor extends magmactBaseVisitor<Comparator> {
            @Override
            public Comparator visitComparator(@NotNull magmactParser.ComparatorContext ctx) {
                String comp = ctx.getText();
                return new Comparator(comp);
            }
        }


        public static class OperationPreviousVisitor extends magmactBaseVisitor<OperationPrevious> {
            @Override
            public OperationPrevious visitOperationPrevious(@NotNull magmactParser.OperationPreviousContext ctx) {
                PreviousHeaderVisitor previousHeaderVisitor = new PreviousHeaderVisitor();
                PreviousHeader previousHeader = ctx.previousHeader().accept(previousHeaderVisitor);

                OperationVisitor operationVisitor = new OperationVisitor();
                Operation operation = ctx.operation().accept(operationVisitor);

                return new OperationPrevious(previousHeader, operation);
            }
        }

        public static class OperationVisitor extends magmactBaseVisitor<Operation> {
            @Override
            public Operation visitOperation(@NotNull magmactParser.OperationContext ctx) {
                OperationHeaderVisitor operationHeaderVisitor = new OperationHeaderVisitor();
                OperationHeader operationHeader = ctx.operationHeader() != null ? ctx.operationHeader().accept(operationHeaderVisitor) : null;

                OperationParameterVisitor operationParameterVisitor = new OperationParameterVisitor();
                OperationParameter operationParameter = ctx.operationParameter() != null ? ctx.operationParameter().accept(operationParameterVisitor) : null;

                OperationSuffixVisitor operationSuffixVisitor = new OperationSuffixVisitor();
                OperationSuffix operationSuffix = ctx.operationSuffix() != null ? ctx.operationSuffix().accept(operationSuffixVisitor) : null;

                PathParamVisitor pathParamVisitor = new PathParamVisitor();
                PathParam pathParam = ctx.pathParameter() != null ? ctx.pathParameter().accept(pathParamVisitor) : null;

                QueryParameterVisitor queryParameterVisitor = new QueryParameterVisitor();
                QueryParam queryParam = ctx.queryParameter() != null ? ctx.queryParameter().accept(queryParameterVisitor) : null;

                return new Operation(operationHeader, operationParameter, operationSuffix, pathParam, queryParam);
            }
        }

        public static class PathParamVisitor extends magmactBaseVisitor<PathParam> {
            @Override
            public PathParam visitPathParameter(@NotNull magmactParser.PathParameterContext ctx) {
                String[] parts = ctx.getText().split("\\[");
                String num_str = parts[1].split("]")[0];
                int num = Integer.parseInt(num_str);

                return new PathParam("this", num);
            }
        }

        public static class OperationSuffixVisitor extends magmactBaseVisitor<OperationSuffix> {
            @Override
            public OperationSuffix visitOperationSuffix(@NotNull magmactParser.OperationSuffixContext ctx) {
                FunctionVisitor functionVisitor = new FunctionVisitor();
                Function function = ctx.function() != null ? ctx.function().accept(functionVisitor) : null;

                StringParamVisitor stringParamVisitor = new StringParamVisitor();
                StringParam stringParam = ctx.stringParam() != null ? ctx.stringParam().accept(stringParamVisitor) : null;

                return new OperationSuffix(function, stringParam);
            }
        }

        public static class StringParamVisitor extends magmactBaseVisitor<StringParam> {
            @Override
            public StringParam visitStringParam(@NotNull magmactParser.StringParamContext ctx) {
                String param = ctx.getText();
                return new StringParam(param);
            }
        }


        public static class PreviousHeaderVisitor extends magmactBaseVisitor<PreviousHeader> {
            @Override
            public PreviousHeader visitPreviousHeader(@NotNull magmactParser.PreviousHeaderContext ctx) {
                String header = ctx.getText();
                return new PreviousHeader(header);
            }
        }


        public static class FunctionVisitor extends magmactBaseVisitor<Function> {
            @Override
            public Function visitFunction(@NotNull magmactParser.FunctionContext ctx) {
                String id = ctx.functionID().getText();
                return new Function(id);
            }
        }


        public static class OperationParameterVisitor extends magmactBaseVisitor<OperationParameter> {
            @Override
            public OperationParameter visitOperationParameter(@NotNull magmactParser.OperationParameterContext ctx) {
                HTTPRequestVisitor httpRequestVisitor = new HTTPRequestVisitor();
                HTTPRequest httpRequest = ctx.httpRequest() != null ? ctx.httpRequest().accept(httpRequestVisitor) : null;
                String thisRequest = ctx.THIS() != null ? ctx.THIS().getText().toLowerCase() : null;

                return new OperationParameter(httpRequest, thisRequest);
            }
        }


        private static class OperationHeaderVisitor extends magmactBaseVisitor<OperationHeader> {
            @Override
            public OperationHeader visitOperationHeader(@NotNull magmactParser.OperationHeaderContext ctx) {
                String header = ctx.getText();
                return new OperationHeader(header);
            }
        }


        private static class HTTPRequestVisitor extends magmactBaseVisitor<HTTPRequest> {
            @Override
            public HTTPRequest visitHttpRequest(@NotNull magmactParser.HttpRequestContext ctx) {
                MethodVisitor methodVisitor = new MethodVisitor();
                Method method = ctx.method().accept(methodVisitor);

                UrlVisitor urlVisitor = new UrlVisitor();
                Url url = ctx.url().accept(urlVisitor);

                return new HTTPRequest(method, url);
            }
        }


        private static class MethodVisitor extends magmactBaseVisitor<Method> {
            @Override
            public Method visitMethod(@NotNull magmactParser.MethodContext ctx) {
                String method = ctx.getText();
                return new Method(method);
            }
        }


        private static class UrlVisitor extends magmactBaseVisitor<Url> {
            @Override
            public Url visitUrl(@NotNull magmactParser.UrlContext ctx) {
                SegmentVisitor segmentVisitor = new SegmentVisitor();

                List<Segment> segments = ctx.segment() != null ? ctx.segment()
                        .stream()
                        .map(segment -> segment.accept(segmentVisitor))
                        .collect(toList()) : null;

                return new Url(segments);
            }
        }


        private static class SegmentVisitor extends magmactBaseVisitor<Segment> {
            @Override
            public Segment visitSegment(@NotNull magmactParser.SegmentContext ctx) {
                BlockVisitor blockVisitor = new BlockVisitor();

                List<Block> blocks = ctx.block()
                        .stream()
                        .map(block -> block.accept(blockVisitor))
                        .collect(toList());

                return new Segment(blocks);
            }
        }

        private static class BlockVisitor extends magmactBaseVisitor<Block> {
            @Override
            public Block visitBlock(@NotNull magmactParser.BlockContext ctx) {
                Integer intBlock = null;
                String stringBlock = null;

                try {
                    intBlock = Integer.parseInt(ctx.getText());
                } catch (NumberFormatException e) {
                    stringBlock = ctx.getText();
                }

                BlockParameterVisitor parameterVisitor = new BlockParameterVisitor();
                BlockParameter blockParameter = ctx.blockParameter() != null ? ctx.blockParameter().accept(parameterVisitor) : null;

                OperationVisitor operationVisitor = new OperationVisitor();
                Operation operation = ctx.operation() != null ? ctx.operation().accept(operationVisitor) : null;

                return new Block(stringBlock, intBlock, blockParameter, operation);
            }
        }

        private static class QueryParameterVisitor extends magmactBaseVisitor<QueryParam> {
            @Override
            public QueryParam visitQueryParameter(@NotNull magmactParser.QueryParameterContext ctx) {
                String parameterName = ctx.getText().split("\\{")[1].replace("}", "");
                return new QueryParam("this", parameterName);
            }
        }

        private static class BlockParameterVisitor extends magmactBaseVisitor<BlockParameter> {
            @Override
            public BlockParameter visitBlockParameter(@NotNull magmactParser.BlockParameterContext ctx) {
                String parameter = ctx.getText();
                return new BlockParameter(parameter);
            }
        }

    }

}
