package magmact_domain;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class OperationHeader implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	
	public OperationHeader(String id) {
		this.id = id;
	}
	
	public String getID() {
		return id;
	}

	public boolean isRequestBody() {
		return id.equalsIgnoreCase("request_body");
	}

	public boolean isResponseBody() {
		return id.equalsIgnoreCase("response_body");
	}

	public boolean isResponseCode() {
		return id.equalsIgnoreCase("response_code");
	}

	@Override
	public String toString() {
		return id;
	}
}
