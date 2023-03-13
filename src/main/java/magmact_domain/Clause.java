package magmact_domain;

import java.io.Serializable;
import java.util.Map;

@SuppressWarnings("ALL")
public class Clause implements Serializable {

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

	public boolean hasPathParameter() {
		return comparison != null? comparison.hasPathParameter() : false;
	}

	public boolean hasQueryParameter() {
		return comparison != null? comparison.hasQueryParameter() : false;
	}

	public boolean hasThis() {
		return comparison != null? comparison.hasThis() : false;
	}

	public boolean hasPrevious () {
		return comparison != null? comparison.hasPrevious() : false;
	}

	public Map.Entry<OperationHeader, HTTPRequest> getPreviousRequest() {
		return comparison != null? comparison.getPreviousRequest() : null;
	}

	public boolean hasComposedParameters() {
		return comparison != null? comparison.hasComposedParameters() : false;
	}

	public boolean hasUrlComposedParameters() {
		return comparison != null? comparison.hasUrlComposedParameters() : false;
	}

	@Override
	public String toString() {
		return value != null? value.toString() : comparison.toString();
	}
}
