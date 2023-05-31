package magmact_domain;

import java.io.Serial;
import java.io.Serializable;

public class Quantifier implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;
	
	public static final String UNIVERSAL = "for";
	public static final String EXISTENTIAL = "exists";
	
	private String quantifier;
	
	public Quantifier(String quantifier) {
		this.quantifier = quantifier;
	}
	
	public String getQuantifier() {
		return quantifier;
	}
	
	public boolean isUniversal() {
		return quantifier.equalsIgnoreCase(UNIVERSAL);
	}

	public boolean isExistential() {
		return quantifier.equalsIgnoreCase(EXISTENTIAL);
	}

	@Override
	public String toString() {
		return quantifier;
	}
}
