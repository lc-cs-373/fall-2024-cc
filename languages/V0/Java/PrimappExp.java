//PrimappExp:top//
//PrimappExp:import//
import java.util.*;

// <exp>:PrimappExp ::= <prim> LPAREN <rands> RPAREN
public class PrimappExp extends Exp /*PrimappExp:class*/ {

    public static final String $className = "PrimappExp";
    public static final String $ruleString =
        "<exp>:PrimappExp ::= <prim> LPAREN <rands> RPAREN";

    public Prim prim;
    public Rands rands;

    public PrimappExp(Prim prim, Rands rands) {
//PrimappExp:init//
        this.prim = prim;
        this.rands = rands;
    }

    public static PrimappExp parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<exp>:PrimappExp", scn$.lno);
        Prim prim = Prim.parse(scn$, trace$);
        scn$.match(Token.Match.LPAREN, trace$);
        Rands rands = Rands.parse(scn$, trace$);
        scn$.match(Token.Match.RPAREN, trace$);
        return new PrimappExp(prim, rands);
    }

    public String toString() {
        return prim + "(" + rands + ")";
    }

//PrimappExp//
}
