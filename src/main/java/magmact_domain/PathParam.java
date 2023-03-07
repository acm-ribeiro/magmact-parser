package magmact_domain;


import java.io.Serializable;

public class PathParam implements Serializable {

    private static final long serialVersionUID = 1L;

    private String THIS;
    private int num;

    public PathParam(String THIS,  int num) {
        this.THIS = THIS;
        this.num = num;
    }


    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "path_param(" + THIS + "[" + num + "])";
    }
}
