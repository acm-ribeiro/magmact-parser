package magmact_domain;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class BooleanValue implements Serializable {

	private static final long serialVersionUID = 1L;

	private boolean value;
	
	public BooleanValue(String value) {
		if (value.equalsIgnoreCase("T") || value.equalsIgnoreCase("True"))
			this.value = true;
		else
			this.value = false;
	}
	
	public boolean getValue() {
		return value;
	}


	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
