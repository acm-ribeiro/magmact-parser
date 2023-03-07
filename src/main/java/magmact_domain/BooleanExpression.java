package magmact_domain;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class BooleanExpression implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Clause clause;
	private BooleanExpression left, right;
	private BooleanOperator op;
	
	public BooleanExpression(Clause clause, BooleanExpression left, BooleanExpression right, BooleanOperator op) {
		this.clause = clause;
		this.left = left;
		this.right = right;
		this.op = op;
	}
	
	public Clause getClause() {
		return clause;
	}

	public BooleanExpression getLeftExpression() {
		return left;
	}

	public BooleanExpression getRightExpression() {
		return right;
	}


	public void setClause(Clause clause) {
		this.clause = clause;
	}

	public void setLeftExpression(BooleanExpression lelft) {
		this.left = left;
	}

	public void setRightExpression(BooleanExpression right) {
		this.right = right;
	}

	public void setStringParameter(String name, String value) {
		if (clause != null)
			clause.setStringParameter(name, value);
	}

	public BooleanOperator getOperator() {
		return op;
	}


	public String getQueryParameterName() {
		if (clause != null)
			return clause.getQueryParameterName();
		else
			return left.hasQueryParameterName()? left.getQueryParameterName() : right.getQueryParameterName();
	}

	public String getStringParameterName() {
		return clause != null? clause.getStringParameterName() : null;
	}

	public boolean hasQueryParameterName() {
		return getQueryParameterName() != null;
	}


	public boolean isImplication() {
		return op.equals("=>");
	}

	public boolean isClause() {
		return clause != null;
	}


	public boolean hasPathParameter() {
		return clause != null? clause.hasPathParameter() : (left.hasPathParameter() || right.hasPathParameter());
	}


	public boolean hasQueryParameter() {
		return clause != null? clause.hasQueryParameter() : (left.hasQueryParameter() || right.hasQueryParameter());
	}

	public boolean hasThis() {
		return clause != null? clause.hasThis() : (left.hasThis() || right.hasThis());
	}

	public boolean hasPrevious() {
		return clause != null? clause.hasPrevious() : (left.hasPrevious() || right.hasPrevious());
	}


	public boolean hasComposedParameters() {
		return clause != null? clause.hasComposedParameters() : (left.hasComposedParameters() || right.hasComposedParameters());
	}

	public boolean hasUrlComposedParameters() {
		return clause != null? clause.hasUrlComposedParameters() : (left.hasUrlComposedParameters() || right.hasUrlComposedParameters());
	}

	@Override
	public String toString() {
		if(clause != null)
			return clause.toString();
		else
			return left.toString() + op.toString() + right.toString();
	}

}
