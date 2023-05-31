package magmact_domain;

import java.io.Serial;
import java.io.Serializable;


public class BooleanValue implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	private boolean value;
	
	public BooleanValue(String value) {
		this.value = value.equalsIgnoreCase("T") || value.equalsIgnoreCase("True");
	}
	
	public boolean getValue() {
		return value;
	}


	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
