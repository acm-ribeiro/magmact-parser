package magmact_domain;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class OperationParameter implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private HTTPRequest request;
	private String this_request;
	
	public OperationParameter(HTTPRequest request, String this_request) {
		this.request = request;
		this.this_request = this_request;
	}
	
	public HTTPRequest getRequest() {
		return request;
	}


	public void setRequest(HTTPRequest request) {
		this.request = request;
		this_request = null;
	}


	public void setCollectionUrlParameterValue(String name, String value) {
		if(request != null)
			request.setCollectionUrlParameterValue(name, value);
	}

	public void setUrl(String url){
		if (request != null)
			request.setUrl(url);
	}

	public String getThis() {
		return this_request;
	}

	public int getPathParameterIndex() {
		return request.getPathParameterIndex();
	}

	public String getUrlQueryParameterName() {
		return request.getUrlQueryParameterName();
	}

	public String getUrlComposedParameterName() {
		return request.getUrlComposedParameterName();
	}


	public String getUrl() {
		return request != null ? request.getUrl().toString() : null;
	}

	public String getCollectionUrlParameterName() {
		return request != null? request.getUrl().getCollectionUrlParameterName() : null;
	}


	public boolean isThis() {
		return this_request != null;
	}


	public boolean hasPathParameter() {
		return this_request != null? false : request.getUrl().hasPathParameter();
	}

	public boolean hasUrlRequestBody() {
		return this_request == null ? request.hasRequestBody() : false;
	}

	public boolean hasUrlResponseBody() {
		return this_request == null? request.hasResponseBody() : false;
	}

	@Override
	public String toString() {
		String this_s = this_request != null? "this" : "";
		String request_s = request != null? request.toString() : "";
		return this_s + request_s;
	}

}
