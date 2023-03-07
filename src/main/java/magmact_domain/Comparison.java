package magmact_domain;


import java.io.Serializable;

@SuppressWarnings("ALL")
public class Comparison implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private LeftTerm left;
	private RightTerm right;
	private Comparator comparator;
	
	public Comparison(LeftTerm left, RightTerm right, Comparator comparator) {
		this.left = left;
		this.right = right;
		this.comparator = comparator;
	}

	public LeftTerm getLeftTerm() {
		return left;
	}

	public RightTerm getRightTerm() {
		return right;
	}

	/**
	 * Replaces a comparison's term.
	 * @param t       term to replace
	 * @param isLeft  indicates what term needs to be replaced: true for the left term, false for the right term.
	 */
	public void setTerm(LeftTerm t, boolean isLeft) {
		if (isLeft)
			left = t;
		else
			right.setLeft(t);
	}

	public void setLeftTerm(LeftTerm t) {
		left = t;
	}

	public void setRightTerm(LeftTerm t) {
		right.setLeft(t);
	}

	public void setStringParameter(String name, String value) {
		// this is false
		if (left.hasStringParameter())
			left.setParam(name, value);
		else if(right.hasStringParameter())
			right.setParam(name, value);
	}


	public Comparator getComparator() {
		return comparator;
	}


	public String getQueryParameterName() {
		return left.getQueryParameterName() != null? left.getQueryParameterName() : right.getQueryParameterName();
	}

	public boolean hasStringParameter() {
		return left.hasStringParameter() || right.hasStringParameter();
	}

	public String getStringParameterName() {
		return left.getStringParameterName() != null? left.getStringParameterName() : right.getStringParameterName();
	}


	public boolean hasPathParameter() {
		return left.hasPathParameter() || right.hasPathParameter();
	}


	public boolean hasQueryParameter() {
		return left.hasQueryParameter() || right.hasQueryParameter();
	}


	public boolean hasThis() {
		return left.hasThis() || right.hasThis();
	}

	public boolean hasPrevious() {
		return left.hasPrevious() || right.hasPrevious();
	}


	public boolean hasComposedParameters() {
		return left.hasComposedParameters() || right.hasComposedParameters();
	}

	public boolean hasUrlComposedParameters() {
		return left.hasUrlComposedParameters() || right.hasUrlComposedParameters();
	}

	@Override
	public String toString() {
		return left.toString() + " " + comparator.toString() + " " + right.toString();
	}
}
