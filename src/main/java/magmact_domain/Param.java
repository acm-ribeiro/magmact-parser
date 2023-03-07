package magmact_domain;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class Param implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private StringParam stringParam;
	private Integer intParam;

	public Param(StringParam stringParam, Integer intParam) {
		this.stringParam = stringParam;
		this.intParam = intParam;
	}
	
	public StringParam getStringParam() {
		return stringParam;
	}

	public String getStringParameterName() {
		return stringParam != null ? stringParam.getParameterName() : null;
	}

	public boolean isStringParameter() {
		return stringParam != null;
	}

	public void setStringParam (String value) {
		stringParam.setParam(value);
		intParam = null;
	}

	public Integer getIntParam() {
		return intParam;
	}

	@Override
	public String toString() {
		return stringParam != null? stringParam.toString() : String.valueOf(intParam);
	}
}
