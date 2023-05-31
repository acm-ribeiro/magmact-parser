package magmact_domain;

import java.io.Serial;
import java.io.Serializable;

public class PreviousHeader implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;
	
	String header;
	
	public PreviousHeader(String header) {
		this.header = header;
	}

	public String getHeader() {
		return header;
	}
}
