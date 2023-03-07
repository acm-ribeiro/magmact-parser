package magmact_domain;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class Method implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	
	public Method(String methodID) {
		id = methodID;
	}
	
	public String getID() {
		return id;
	}
}
