package magmact_domain;

import java.io.Serial;
import java.io.Serializable;

public class BooleanOperator implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;
	
	private String op;
	
	public BooleanOperator(String op) {
		this.op = op;
	}
	
	public String getBooleanOperator() {
		return op;
	}

	@Override
	public String toString() {
		return " " + op + " ";
	}
}
