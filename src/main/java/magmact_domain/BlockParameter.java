package magmact_domain;

import java.io.Serial;
import java.io.Serializable;


public class BlockParameter implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;
	
	private String parameter;
	
	public BlockParameter(String parameter) {
		this.parameter = parameter;
	}

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String value) {
		parameter = value;
	}
	
	public boolean isString() {
		return parameter != null;
	}

	@Override
	public String toString() {
		// Block parameters always have "{...}" since they weren't replaced by their values yet.
		return "{" + parameter + "}";
	}
}
