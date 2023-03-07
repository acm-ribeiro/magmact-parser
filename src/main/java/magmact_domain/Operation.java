package magmact_domain;


import java.io.Serializable;

@SuppressWarnings("ALL")
public class Operation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private OperationHeader header;
	private OperationParameter parameter;
	private OperationSuffix suffix;
	private PathParam pathParam;
	private QueryParam queryParam;

	public Operation(OperationHeader header, OperationParameter parameter, OperationSuffix suffix, PathParam pathParam, QueryParam queryParam) {
		this.header = header;
		this.parameter = parameter;
		this.suffix = suffix;
		this.pathParam = pathParam;
		this.queryParam = queryParam;
	}


	public OperationHeader getHeader() {
		return header;
	}


	public void setOperationParameter(OperationParameter parameter) {
		this.parameter = parameter;
	}


	public void setUrlParameterValue(String name, String value) {
		if (parameter != null && !parameter.isThis())
			parameter.setCollectionUrlParameterValue(name, value);
	}

	public void setUrl(String url) {
		if (parameter != null && !parameter.isThis())
			parameter.setUrl(url);
	}


	public OperationParameter getParameter() {
		return parameter;
	}


	public OperationSuffix getSuffix() {
		return suffix;
	}


	public String getQueryParameterName() {
		return queryParam.getParameterName();
	}

	public String getComposedParameterName() {
		if(hasComposedParameters())
			return suffix.getStringParam().getParam();
		else if (hasUrlComposedParameters())
			return parameter.getUrlComposedParameterName();
		else
			return null;
	}

	public String getUrlQueryParameterName() {
		return isQueryParam()? queryParam.getParameterName() : parameter.getUrlQueryParameterName();
	}


	public String getUrl() {
		return parameter != null? parameter.getUrl() : null;
	}


	public String getUrlParameterName() {
		return parameter != null? parameter.getCollectionUrlParameterName() : null;
	}

	public int getPathParameterIndex() {
		return isPathParam()? pathParam.getNum() : parameter.getPathParameterIndex();
	}

	public PathParam getPathParam () {
		return pathParam;
	}

	public boolean isPathParam() {
		return pathParam != null;
	}

	public boolean hasUrlRequestBodyComposed() {
		return parameter != null && parameter.hasUrlRequestBody();
	}

	public boolean hasUrlResponseBodyComposed() {
		return parameter != null && parameter.hasUrlResponseBody();
	}


	public boolean hasUrlComposedParameters() {
		return hasUrlRequestBodyComposed() || hasUrlResponseBodyComposed();
	}

	public boolean hasUrlPathParam() {
		if (parameter != null)
			return !parameter.isThis() && parameter.getRequest().getUrl().hasPathParameter();
		else
			return false;
	}

	public boolean hasUrlQueryParam() {
		if (parameter != null)
			return !parameter.isThis() && parameter.getRequest().getUrl().hasQueryParameter();
		else
			return false;
	}

	public boolean hasBlockParameter() {
		if(parameter != null)
			return !parameter.isThis() && parameter.getRequest().hasBlockParameter();
		else
			return false;
	}

	public boolean hasThis() {
		return parameter != null && parameter.isThis();
	}

	public boolean isQueryParam() {
		return queryParam != null;
	}

	public boolean isRequestBody() {
		return header != null && header.isRequestBody();
	}

	public boolean isResponseBody() {
		return header != null && header.isResponseBody();
	}


	public boolean isResponseCode() {
		return header != null && header.isResponseCode();
	}


	public boolean hasComposedParameters() {
		return suffix != null && suffix.isStringParam();
	}


	public QueryParam getQueryParam() {
		return queryParam;
	}
	

	@Override
	public String toString() {
		String s = suffix != null? suffix.toString() : "";

		if (pathParam != null)
			return pathParam.toString();
		else if (queryParam != null)
			return queryParam.toString();
		else
			return header.getID() + "(" + parameter.toString() + ")" + s;
	}

}
