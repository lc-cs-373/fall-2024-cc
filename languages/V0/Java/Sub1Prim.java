//Sub1Prim:top//
//Sub1Prim:import//
import java.util.*;

// <prim>:Sub1Prim ::= SUB1OP
public class Sub1Prim extends Prim /*Sub1Prim:class*/ {

    public static final String $className = "Sub1Prim";
    public static final String $ruleString =
        "<prim>:Sub1Prim ::= SUB1OP";



    public Sub1Prim() {
//Sub1Prim:init//

    }

    public static Sub1Prim parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<prim>:Sub1Prim", scn$.lno);
        scn$.match(Token.Match.SUB1OP, trace$);
        return new Sub1Prim();
    }

    public String toString() {
        return "sub1";
    }

//Sub1Prim//
}
