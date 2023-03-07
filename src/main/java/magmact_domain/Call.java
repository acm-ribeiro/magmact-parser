package magmact_domain;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class Call implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Operation operation;
	private OperationPrevious operationPrevious;
	
	public Call(Operation operation, OperationPrevious operationPrevious) {
		this.operation = operation;
		this.operationPrevious = operationPrevious;
	}


	public Operation getOperation() {
		return operation;
	}


	public void setOperation(Operation operation) {
		this.operation = operation;
	}


	public void setOperationPrevious(Operation operation) {
		operationPrevious.setOperation(operation);
	}

	public void setCollectionUrlParameterValue(String name, String value) {
		if (operation != null)
			operation.setUrlParameterValue(name, value);
		else
			operationPrevious.setUrlParameterValue(name, value);
	}

	public void setCollectionUrl(String collectionUrl) {
		if (operation != null)
			operation.setUrl(collectionUrl);
		else
			operationPrevious.setUrl(collectionUrl);
	}

	public OperationPrevious getOperationPrevious() {
		return operationPrevious;
	}


	public String getQueryParameterName() {
		if(operation != null && operation.isQueryParam())
			return operation.getQueryParameterName();
		else if (operation != null)
			return operation.getUrlQueryParameterName();
		else
			return operationPrevious.getQueryParameterName();
	}

	public String getCollectionUrl () {
		return operation != null? operation.getUrl() : operationPrevious.getUrl();
	}


	public String getCollectionUrlParameterName() {
		return operation != null? operation.getUrlParameterName() : operationPrevious.getUrlParameterName();
	}

	public int getPathParameterIndex() {
		return operation != null? operation.getPathParameterIndex() : operationPrevious.getPathParameterIndex();
	}

	public boolean isPrevious() {
		return operationPrevious != null;
	}


	public boolean hasBlockParameter () {
		return operation != null? operation.hasBlockParameter() : operationPrevious.hasBlockParameter();
	}


	public boolean hasPathParameter() {
		boolean operation_path = operation != null? operation.isPathParam() || operation.hasUrlPathParam() : false;
		boolean previous_path = operationPrevious != null? operationPrevious.hasPathParam() : false;

		return operation_path || previous_path;
	}


	public boolean hasQueryParameter() {
		boolean operation_query = operation != null? operation.isQueryParam() || operation.hasUrlQueryParam() : false;
		boolean previous_query = operationPrevious != null? operationPrevious.hasQueryParam() : false;

		return operation_query || previous_query;
	}


	public boolean hasThis() {
		return operation != null? operation.hasThis() : operationPrevious.hasThis();
	}


	public boolean hasComposedParameters() {
		boolean operation_comp = operation != null? operation.hasComposedParameters() : false;
		boolean previous_comp = operationPrevious != null? operationPrevious.hasComposedParameters() : false;

		return operation_comp || previous_comp;
	}


	public boolean hasUrlComposedParameters() {
		boolean operation_comp = operation != null? operation.hasUrlComposedParameters() : false;
		boolean previous_comp = operationPrevious != null? operationPrevious.hasUrlComposedParameters() : false;

		return operation_comp || previous_comp;
	}


	public String toString() {
		return operation != null? operation.toString() : operationPrevious.toString();
	}
}
