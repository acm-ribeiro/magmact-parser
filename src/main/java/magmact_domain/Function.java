package magmact_domain;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class Function implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	
	public Function(String id) {
		this.id = id;
	}
	
	public String getID() {
		return id;
	}

}
