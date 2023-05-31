package magmact_domain;

import java.io.Serial;
import java.io.Serializable;

public class Method implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	public Method(String methodID) {
		id = methodID;
	}
	
	public String getID() {
		return id;
	}

	@Override
	public String toString() {
		return id;
	}
}
