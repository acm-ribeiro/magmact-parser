package magmact_domain;

import java.io.Serial;
import java.io.Serializable;

public class Function implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	public Function(String id) {
		this.id = id;
	}
	
	public String getID() {
		return id;
	}

}
