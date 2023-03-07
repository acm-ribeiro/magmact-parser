package magmact_domain;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class LeftTerm implements Serializable {

    private static final long serialVersionUID = 1L;

    private Call call;
    private Param param;
    private boolean hasCurls;

    public LeftTerm(Call call, Param param, boolean hasCurls){
        this.call = call;
        this.param = param;
        this.hasCurls = hasCurls;
    }

    public Call getCall() {
        return call;
    }

    public void setCall(Call call) {
        this.call = call;
    }


    public Param getParam() {
        return param;
    }


    public boolean isParam() {
        return param != null;
    }

    public boolean isCall() {
        return call != null;
    }


    public String getQueryParameterName() {
        return call.getQueryParameterName();
    }

    public boolean hasStringParameter() {
        return param != null && param.isStringParameter();
    }

    public String getStringParameterName() {
        return param != null? param.getStringParameterName() : null;
    }


    public int getPathParameterIndex() {
        return call.getPathParameterIndex();
    }


    /**
     * Updates the parameter with the given name.
     * @param name   the name of the parameter to be replaced. In case it is a path parameter replacement, provide the empty string "".
     * @param value  the correct parameter value.
     */
    public void setParam(String name, String value) {
        if(param != null && param.isStringParameter() && param.getStringParam().getParam().contains(name)) {
            Param replacement = new Param(new StringParam(value), null);
            param = replacement;
            call = null;
            hasCurls = false;
        }
    }

    /**
     * Replaces a call (path_param, query_param, etc) for a string parameter.
     * @param value the correct parameter value.
     */
    public void replaceCallForParameter(String value) {
        Param replacement = new Param(new StringParam(value), null);
        param = replacement;
        call = null;
        hasCurls = false;
    }


    public boolean hasPathParameter() {
       return call != null? call.hasPathParameter() : false;
    }


    public boolean hasQueryParameter() {
        return call != null? call.hasQueryParameter() : false;
    }


    public boolean hasThis() {
        return call != null? call.hasThis() : false;
    }

    public boolean hasPrevious () {
        return call != null? call.isPrevious() : false;
    }


    public boolean hasComposedParameters() {
        return call != null? call.hasComposedParameters() : false;
    }

    public boolean hasUrlComposedParameters() {
        return call != null? call.hasUrlComposedParameters() : false;
    }

    @Override
    public String toString() {
        if(param != null)
            return hasCurls? "{" + param.toString() + "}" : param.toString();
        else if (call != null)
            return call.toString();
        else
            return "";
    }
}
