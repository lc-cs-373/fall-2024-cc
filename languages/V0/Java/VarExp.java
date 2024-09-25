//VarExp:top//
//VarExp:import//
import java.util.*;

// <exp>:VarExp ::= <VAR>
public class VarExp extends Exp /*VarExp:class*/ {

    public static final String $className = "VarExp";
    public static final String $ruleString =
        "<exp>:VarExp ::= <VAR>";

    public Token var;

    public VarExp(Token var) {
//VarExp:init//
        this.var = var;
    }

    public static VarExp parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<exp>:VarExp", scn$.lno);
        Token var = scn$.match(Token.Match.VAR, trace$);
        return new VarExp(var);
    }

    public String toString() {
        return var.toString();
    }

//VarExp//
}
