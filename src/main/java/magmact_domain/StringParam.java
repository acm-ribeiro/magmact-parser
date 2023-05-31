package magmact_domain;

import java.io.Serial;
import java.io.Serializable;

public class StringParam implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String param;

    public StringParam(String param) {
        this.param = param;
    }

    public String getParam() {
        return param;
    }

    public String getParameterName() {
        if (param.contains(".")) {
            String[] parts = param.split("\\.");
            return parts[1];
        } else
            return param;
    }

    public void setParam (String value) {
        param = value;
    }

    @Override
    public String toString() {
        return param;
    }
}
