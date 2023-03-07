package magmact_domain;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class HTTPRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Method method;
	private Url url;


	/**
	 * Creates an HttpRequest instance from a method and a url, as strings. OAS spec urls do not contain apostl operations.
	 * @param method  method id string (e.g. POST, PUT, GET, DELETE, PATCH)
	 * @param url     OAS path uri.
	 */
	public HTTPRequest(String method, String url) {
		this.url = new Url(url);
		this.method = new Method(method);
	}

	public HTTPRequest(Method method, Url url) {
		this.method = method;
		this.url = url;
	}
	

	public Method getMethod() {
		return method;
	}


	public Url getUrl() {
		return url;
	}

	public int getPathParameterIndex() {
		return url.getPathParameterIndex();
	}

	public String getUrlQueryParameterName() {
		return url.getUrlQueryParameterName();
	}

	public String getUrlComposedParameterName() {
		return url.getComposedParameterName();
	}

	public boolean hasRequestBody() {
		return url.hasRequestBody();
	}

	public boolean hasResponseBody() {
		return url.hasResponseBody();
	}

	public boolean hasBlockParameter() {
		return url.hasBlockParameter();
	}


	public void setCollectionUrlParameterValue(String name, String value) {
		url.updateBlockParameter(name, value);
	}

	public void setUrl(String url) {
		this.url = new Url(url);
	}


	@Override
	public String toString() {
		return method.getID().toUpperCase() + " " + url.toString();
	}
	
}
