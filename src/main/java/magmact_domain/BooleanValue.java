package magmact_domain;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class BooleanValue implements Serializable {

	private static final long serialVersionUID = 1L;

	private boolean value;
	
	public BooleanValue(String value) {
		this.value = value.equalsIgnoreCase("T")? true : false;
	}
	
	public boolean getValue() {
		return value;
	}


	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
