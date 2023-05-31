package magmact_domain;

import java.io.Serial;
import java.io.Serializable;

public class Variables implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;
	
	private String varId;
	private Call call;
	private Variables vars;
	
	public Variables (String varId, Call call, Variables vars) {
		this.varId = varId;
		this.call = call;
		this.vars = vars;
	}
	
	public String getVarId() {
		return varId;
	}
	
	public Call getCall() {
		return call;
	}

	public void setCall(Call call) {
		this.call = call;
	}

	public void setCollectionUrlParameterValue(String name, String value) {
		if(vars != null)
			vars.setCollectionUrlParameterValue(name, value);
		else
			call.setCollectionUrlParameterValue(name, value);
	}

	public void setCollectionUrl(String collectionUrl) {
		if (vars != null)
			vars.setCollectionUrl(collectionUrl);
		else
			call.setCollectionUrl(collectionUrl);
	}

	public Variables getVars(){
		return vars;
	}


	public String getQueryParameterName() {
		return call != null? call.getQueryParameterName() : vars.getQueryParameterName();
	}

	public String getCollectionUrl() {
		if (vars != null)
			return vars.getCollectionUrl();
		else
			return call.getCollectionUrl();
	}


	public String getCollectionUrlParameterName() {
		if (vars != null)
			return vars.getCollectionUrlParameterName();
		else
			return call.getCollectionUrlParameterName();
	}


	public boolean hasPathParameter() {
		return call != null? call.hasPathParameter() : vars.hasPathParameter();
	}

	public boolean hasResponseBody() {
		return call != null? call.hasResponseBody() : vars.hasResponseBody();
	}

	public boolean hasBlockParameter() {
		return call != null? call.hasBlockParameter() : vars.hasBlockParameter();
	}


	public boolean hasQueryParameter() {
		return call != null? call.hasQueryParameter() : vars.hasQueryParameter();
	}


	public boolean hasThis() {
		return call != null? call.hasThis() : vars.hasThis();
	}

	public boolean hasPrevious () {
		return call != null? call.isPrevious() : vars.hasPrevious();
	}


	public boolean hasComposedParameters() {
		return call != null? call.hasComposedParameters() : vars.hasComposedParameters();
	}


	public boolean hasUrlComposedParameters() {
		return call != null? call.hasUrlComposedParameters() : vars.hasUrlComposedParameters();
	}


	@Override
	public String toString() {
		if(call != null)
			return varId + " in " + call;
		else
			return varId + ", " + vars.toString();
	}
}
