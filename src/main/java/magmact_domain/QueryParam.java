package magmact_domain;

import java.io.Serializable;

public class QueryParam implements Serializable {

    private static final long serialVersionUID = 1L;

    private String THIS;
    private String parameterName;

    public QueryParam(String THIS, String parameterName) {
        this.THIS = THIS;
        this.parameterName = parameterName;
    }

    public String getParameterName() {return parameterName;}

    @Override
    public String toString() {
        // query_param(this){name}
        return "query_param(" + THIS + ")" + "{" + parameterName + "}";
    }


}
