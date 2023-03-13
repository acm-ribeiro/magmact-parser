package magmact_domain;

import java.io.Serializable;
import java.util.Map;

@SuppressWarnings("ALL")
public class Formula implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private QuantifiedFormula quantifiedFormula;
	private BooleanExpression booleanExpression;
	
	public Formula(QuantifiedFormula quantifiedFormula, BooleanExpression booleanExpression)  {
		this.quantifiedFormula = quantifiedFormula;
		this.booleanExpression = booleanExpression;
	}

	public QuantifiedFormula getQuantifiedFormula() {
		return quantifiedFormula;
	}

	public BooleanExpression getBooleanExpression() {
		return booleanExpression;
	}

	public String getQueryParameterName() {
		if(isQuantified())
			return quantifiedFormula.getQueryParameterName();
		else
			return booleanExpression.getQueryParameterName();
	}

	public void setCall(Call c) {
		if (isQuantified() && quantifiedFormula.getVariables().getVars() == null) // is quantified and not multivar
			quantifiedFormula.getVariables().setCall(c);
		else if (isBooleanExpression() && booleanExpression.isClause())
			booleanExpression.getClause().getComparison().getLeftTerm().setCall(c);
	}

	public void setBooleanExpression(BooleanExpression exp) {
		booleanExpression = exp;
	}
	
	public boolean isQuantified() {
		return quantifiedFormula != null;
	}

	public boolean isBooleanExpression() {
		return booleanExpression != null;
	}

	public boolean isComparison() {
		return booleanExpression != null && booleanExpression.getClause() != null && booleanExpression.getClause().isComparison();
	}

	public boolean hasPathParameter() {
		if (isQuantified())
			return quantifiedFormula.hasPathParameter();
		else
			return booleanExpression.hasPathParameter();
	}

	public boolean hasQueryParameter() {
		if (isQuantified())
			return quantifiedFormula.hasQueryParameter();
		else
			return booleanExpression.hasQueryParameter();
	}

	public boolean hasThis() {
		return isQuantified()? quantifiedFormula.hasThis() : booleanExpression.hasThis();
	}

	public boolean hasNested() {
		return isQuantified() && quantifiedFormula.hasNested();
	}

	public boolean hasComposedParameters() {
		boolean hasComposed, hasNestedComposed;

		if (isQuantified()) {
			// indicates if the first quantified formula has composed parameters
			hasComposed = quantifiedFormula.hasComposedParameters() || quantifiedFormula.hasUrlComposedParameters();

			if (hasNested()) {
				QuantifiedFormula nested = quantifiedFormula.getQuantifiedFormula();
				hasNestedComposed = nested.hasComposedParameters() || nested.hasUrlComposedParameters();
				return hasComposed && hasNestedComposed;
			}
		} else
			hasComposed = booleanExpression.hasComposedParameters() || booleanExpression.hasUrlComposedParameters();

		return hasComposed;
	}

	public boolean hasPrevious() {
		return isQuantified()? quantifiedFormula.hasPrevious() : booleanExpression.hasPrevious();
	}

	public Map.Entry<OperationHeader, HTTPRequest> getPreviousRequest() {
		if (quantifiedFormula != null && quantifiedFormula.hasPrevious())
			return quantifiedFormula.getPreviousRequest();
		else if (booleanExpression != null && booleanExpression.hasPrevious())
			return booleanExpression.getPreviousRequest();
		else
			return null;
	}


	@Override
	public String toString() {
		return quantifiedFormula != null? quantifiedFormula.toString() : booleanExpression.toString();
	}
}
