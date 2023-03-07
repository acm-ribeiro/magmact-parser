package magmact_domain;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class OperationPrevious implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private PreviousHeader header;
	private Operation operation;
	
	public OperationPrevious(PreviousHeader header, Operation operation) {
		this.header = header;
		this.operation = operation;
	}


	public PreviousHeader getHeader() {
		return header;
	}


	public Operation getOperation() {
		return operation;
	}


	public void setOperation(Operation operation) {
		this.operation = operation;
	}


	public String getQueryParameterName() {
		return operation.isQueryParam()? operation.getQueryParameterName() : operation.getUrlQueryParameterName();
	}


	public String getUrl() {
		return operation.getUrl();
	}


	public String getUrlParameterName() {
		return operation.getUrlParameterName();
	}

	public int getPathParameterIndex() {
		return operation.getPathParameterIndex();
	}

	public boolean hasPathParam() {
		return operation.isPathParam() || operation.hasUrlPathParam();
	}

	public boolean hasQueryParam() {
		return operation.isQueryParam() || operation.hasUrlQueryParam();
	}


	public boolean hasThis() {
		return operation.hasThis();
	}


	public boolean hasComposedParameters() {
		return operation.hasComposedParameters();
	}


	public boolean hasUrlComposedParameters() {
		return operation.hasUrlComposedParameters();
	}

	public boolean hasBlockParameter() {
		return operation.hasBlockParameter();
	}


	public void setUrlParameterValue(String name, String value) {
		operation.setUrlParameterValue(name, value);
	}

	public void setUrl(String url) {
		operation.setUrl(url);
	}



	@Override
	public String toString() {
		return header.getHeader() + "(" + operation.toString() + ")";
	}
	
	
}
