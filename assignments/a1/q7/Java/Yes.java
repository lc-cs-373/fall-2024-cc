//Yes:top//
//Yes:import//
import java.util.*;

// <bal_paren>:Yes ::= LP <bal_paren>inner RP <bal_paren>outer
public class Yes extends Bal_paren /*Yes:class*/ {

    public static final String $className = "Yes";
    public static final String $ruleString =
        "<bal_paren>:Yes ::= LP <bal_paren>inner RP <bal_paren>outer";

    public Bal_paren inner;
    public Bal_paren outer;

    public Yes(Bal_paren inner, Bal_paren outer) {
//Yes:init//
        this.inner = inner;
        this.outer = outer;
    }

    public static Yes parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<bal_paren>:Yes", scn$.lno);
        scn$.match(Token.Match.LP, trace$);
        Bal_paren inner = Bal_paren.parse(scn$, trace$);
        scn$.match(Token.Match.RP, trace$);
        Bal_paren outer = Bal_paren.parse(scn$, trace$);
        return new Yes(inner, outer);
    }

//Yes//
}
