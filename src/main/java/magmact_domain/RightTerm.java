package magmact_domain;

import java.io.Serial;
import java.io.Serializable;

public class RightTerm implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private LeftTerm leftTerm;
    private String noValue;

    public RightTerm(LeftTerm left, String noValue){
        this.leftTerm = left;
        this.noValue = noValue;
    }


    public String getNoValue() {
        return noValue;
    }

    public LeftTerm getLeftTerm() {
        return leftTerm;
    }

    public void setLeft(LeftTerm t) {
        leftTerm = t;
    }

    public void setParam(String name, String value) {
        if(leftTerm != null && leftTerm.hasStringParameter())
            leftTerm.setParam(name, value);
    }

    public String getQueryParameterName() {
        return leftTerm != null? leftTerm.getQueryParameterName() : null;
    }

    public String getStringParameterName() {
        return leftTerm != null? leftTerm.getStringParameterName() : null;
    }

    public boolean hasStringParameter() {
        return leftTerm != null && leftTerm.hasStringParameter();
    }

    public boolean hasPathParameter() {
        return leftTerm != null && leftTerm.hasPathParameter();
    }

    public boolean hasResponseBody() {
        return leftTerm != null && leftTerm.hasResponseBody();
    }

    public boolean hasQueryParameter() {
        return leftTerm != null && leftTerm.hasQueryParameter();
    }

    public boolean hasThis() {
        return leftTerm != null && leftTerm.hasThis();
    }

    public boolean hasPrevious () {
        return leftTerm != null && leftTerm.hasPrevious();
    }

    public OperationPrevious getOperationPrevious() {
        return leftTerm != null? leftTerm.getOperationPrevious() : null;
    }

    public boolean hasComposedParameters() {
        return leftTerm != null && leftTerm.hasComposedParameters();
    }


    public boolean hasUrlComposedParameters() {
        return leftTerm != null && leftTerm.hasUrlComposedParameters();
    }

    public boolean isLeftTerm() {
        return leftTerm != null;
    }

    @Override
    public String toString() {
        return leftTerm != null? leftTerm.toString() : noValue;
    }
}
