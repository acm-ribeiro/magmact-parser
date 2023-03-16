package magmact_domain;

import java.io.Serializable;
import java.util.Map;

@SuppressWarnings("ALL")
public class RightTerm implements Serializable {

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
        return leftTerm != null? leftTerm.hasStringParameter() : false;
    }

    public boolean hasPathParameter() {
        return leftTerm != null? leftTerm.hasPathParameter() : false;
    }

    public boolean hasQueryParameter() {
        return leftTerm != null? leftTerm.hasQueryParameter() : false;
    }

    public boolean hasThis() {
        return leftTerm != null? leftTerm.hasThis() : false;
    }

    public boolean hasPrevious () {
        return leftTerm != null? leftTerm.hasPrevious() : false;
    }

    public OperationPrevious getOperationPrevious() {
        return leftTerm != null? leftTerm.getOperationPrevious() : null;
    }

    public boolean hasComposedParameters() {
        return leftTerm != null? leftTerm.hasComposedParameters() : false;
    }


    public boolean hasUrlComposedParameters() {
        return leftTerm != null? leftTerm.hasUrlComposedParameters() : false;
    }

    public boolean isLeftTerm() {
        return leftTerm != null;
    }

    @Override
    public String toString() {
        return leftTerm != null? leftTerm.toString() : noValue;
    }
}
