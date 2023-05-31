package magmact_domain;


import java.io.Serial;
import java.io.Serializable;
import java.util.Map;

public class QuantifiedFormula implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	private Quantifier quantifier;
	private Variables variables;
	private BooleanExpression expression;
	private QuantifiedFormula quantifiedFormula;

	public QuantifiedFormula(Quantifier quantifier, Variables variables, BooleanExpression expression, QuantifiedFormula quantifiedFormula) {
		this.quantifier = quantifier;
		this.variables = variables;
		this.expression = expression;
		this.quantifiedFormula = quantifiedFormula;
	}


	public Quantifier getQuantifier() {
		return quantifier;
	}

	public Variables getVariables() {
		return variables;
	}

	public BooleanExpression getBooleanExpression() {
		return expression;
	}

	public QuantifiedFormula getQuantifiedFormula() {
		return quantifiedFormula;
	}

	public String getQueryParameterName() {
		return variables.getQueryParameterName() != null? variables.getQueryParameterName() : expression.getQueryParameterName();
	}

	public String getCollectionUrl() {
		return variables.getCollectionUrl();
	}

	public String getCollectionUrlParameterName() {
		return variables.getCollectionUrlParameterName();
	}

	public void setBooleanExpression(BooleanExpression exp) {
		expression = exp;
	}

	public void setQuantifiedFormula(QuantifiedFormula quantifiedFormula) {
		this.quantifiedFormula = quantifiedFormula;
	}

	public void setCollectionUrlParameterValue(String name, String value) {
		if (quantifiedFormula != null)
			quantifiedFormula.setCollectionUrlParameterValue(name, value);
		else
			variables.setCollectionUrlParameterValue(name, value);
	}

	public void setNestedCollectionUrl(String collectionUrl) {
		if (quantifiedFormula != null)
			quantifiedFormula.setCollectionUrl(collectionUrl);
	}

	public void setCollectionUrl(String collectionUrl) {
		variables.setCollectionUrl(collectionUrl);
	}

	/**
	 * Checks if the collection url has a block parameter.
	 * @return true when the collection url has a block parameter, e.g., /ps/{p.id}
	 */
	public boolean hasBlockParameter() {
		return variables.hasBlockParameter();
	}

	public boolean hasResponseBody() {
		return variables.hasResponseBody() || expression.hasResponseBody() || quantifiedFormula.hasResponseBody();
	}

	public boolean isUniversal(){
		return quantifier.isUniversal();
	}

	public boolean isExistential() {
		return quantifier.isExistential();
	}

	public boolean isMultiVar(){
		return variables.getCall() == null;
	}

	public boolean hasNested() {
		return quantifiedFormula != null;
	}

	public boolean hasPathParameter() {
		if (expression != null)
			return variables.hasPathParameter() || expression.hasPathParameter();
		else // nested quanfied formula
			return variables.hasPathParameter() || quantifiedFormula.hasPathParameter();
	}

	public boolean hasQueryParameter() {
		if (expression != null)
			return variables.hasQueryParameter() || expression.hasQueryParameter();
		else // nested quanfied formula
			return variables.hasQueryParameter() || quantifiedFormula.hasQueryParameter();
	}

	public boolean hasThis() {
		if (expression != null)
			return variables.hasThis() || expression.hasThis();
		else // nested quanfied formula
			return variables.hasThis() || quantifiedFormula.hasThis();
	}

	public boolean hasComposedParameters() {
		if (expression != null)
			return variables.hasComposedParameters() || expression.hasComposedParameters();
		else // nested quanfied formula
			return variables.hasComposedParameters() || quantifiedFormula.hasComposedParameters();
	}

	public boolean hasUrlComposedParameters() {
		if (expression != null)
			return variables.hasUrlComposedParameters() || expression.hasUrlComposedParameters();
		else // nested quantified formula
			return variables.hasUrlComposedParameters() || quantifiedFormula.hasUrlComposedParameters();
	}

	public boolean hasPrevious () {
		if (expression != null)
			return variables.hasPrevious() || expression.hasPrevious();
		else
			return variables.hasPrevious() || quantifiedFormula.hasPrevious();
	}

	public OperationPrevious getOperationPrevious() {
		if (expression != null && expression.hasPrevious())
			return expression.getOperationPrevious();
		else if (quantifiedFormula != null && quantifiedFormula.hasPrevious())
			return quantifiedFormula.getOperationPrevious();
		else
			return null;
	}

	/**
	 * Resets a formula to its initial state
	 */
	public void reset() {

	}


	@Override
	public String toString() {
		String str = expression != null? " :- " + expression.toString() : " : " + quantifiedFormula.toString();
		return quantifier.toString() + " " + variables.toString() + str;
	}
}
