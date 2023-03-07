package magmact_domain;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class PreviousHeader implements Serializable {

	private static final long serialVersionUID = 1L;
	
	String header;
	
	public PreviousHeader(String header) {
		this.header = header;
	}

	public String getHeader() {
		return header;
	}
}
