//SubPrim:top//
//SubPrim:import//
import java.util.*;

// <prim>:SubPrim ::= SUBOP
public class SubPrim extends Prim /*SubPrim:class*/ {

    public static final String $className = "SubPrim";
    public static final String $ruleString =
        "<prim>:SubPrim ::= SUBOP";



    public SubPrim() {
//SubPrim:init//

    }

    public static SubPrim parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<prim>:SubPrim", scn$.lno);
        scn$.match(Token.Match.SUBOP, trace$);
        return new SubPrim();
    }

    public String toString() {
        return "-";
    }

//SubPrim//
}
