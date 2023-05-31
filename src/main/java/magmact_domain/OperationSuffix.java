package magmact_domain;

import java.io.Serial;
import java.io.Serializable;

public class OperationSuffix implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private Function function;
    private StringParam stringParam;

    public OperationSuffix(Function function, StringParam stringParam){
        this.function = function;
        this.stringParam = stringParam;
    }

    public Function getFunction () {
        return function;
    }

    public StringParam getStringParam () {
        return stringParam;
    }

    public String getQueryParameterName() {
        return stringParam != null? stringParam.getParam() : null;
    }

    public boolean isStringParam() {
        return stringParam != null;
    }

    @Override
    public String toString() {
        String f = function != null? "." + function.getID() : "";
        String p = stringParam != null? "{" + stringParam + "}" : "";

        return f + p;
    }
}
