package magmact_domain;

import java.io.Serial;
import java.io.Serializable;


public class Clause implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;
	
	private BooleanValue value;
	private Comparison comparison;
	
	public Clause(BooleanValue value, Comparison comparison) {
		this.value = value;
		this.comparison = comparison;
	}


	public BooleanValue getBooleanValue() {
		return value;
	}

	public Comparison getComparison() {
		return comparison;
	}

	public String getQueryParameterName() {
		return comparison.getQueryParameterName();
	}

	public String getStringParameterName() {
		return comparison != null? comparison.getStringParameterName() : null;
	}

	public void setStringParameter(String name, String value) {
		if (comparison != null)
			comparison.setStringParameter(name, value);
	}

	public boolean isComparison() {
		return comparison != null;
	}

	public boolean isBooleanValue() {
		return value != null;
	}

	public boolean hasResponseBody() {
		return comparison != null && comparison.hasResponseBody();
	}

	public boolean hasPathParameter() {
		return comparison != null && comparison.hasPathParameter();
	}

	public boolean hasQueryParameter() {
		return comparison != null && comparison.hasQueryParameter();
	}

	public boolean hasThis() {
		return comparison != null && comparison.hasThis();
	}

	public boolean hasPrevious () {
		return comparison != null && comparison.hasPrevious();
	}

	public OperationPrevious getOperationPrevious() {
		return comparison != null? comparison.getOperationPrevious() : null;
	}

	public boolean hasComposedParameters() {
		return comparison != null && comparison.hasComposedParameters();
	}

	public boolean hasUrlComposedParameters() {
		return comparison != null && comparison.hasUrlComposedParameters();
	}

	@Override
	public String toString() {
		return value != null? value.toString() : comparison.toString();
	}
}
