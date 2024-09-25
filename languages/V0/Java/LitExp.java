//LitExp:top//
//LitExp:import//
import java.util.*;

// <exp>:LitExp ::= <LIT>
public class LitExp extends Exp /*LitExp:class*/ {

    public static final String $className = "LitExp";
    public static final String $ruleString =
        "<exp>:LitExp ::= <LIT>";

    public Token lit;

    public LitExp(Token lit) {
//LitExp:init//
        this.lit = lit;
    }

    public static LitExp parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<exp>:LitExp", scn$.lno);
        Token lit = scn$.match(Token.Match.LIT, trace$);
        return new LitExp(lit);
    }

    public String toString() {
        return lit.toString();
    }

//LitExp//
}
