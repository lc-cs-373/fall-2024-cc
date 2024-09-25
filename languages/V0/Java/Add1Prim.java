//Add1Prim:top//
//Add1Prim:import//
import java.util.*;

// <prim>:Add1Prim ::= ADD1OP
public class Add1Prim extends Prim /*Add1Prim:class*/ {

    public static final String $className = "Add1Prim";
    public static final String $ruleString =
        "<prim>:Add1Prim ::= ADD1OP";



    public Add1Prim() {
//Add1Prim:init//

    }

    public static Add1Prim parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<prim>:Add1Prim", scn$.lno);
        scn$.match(Token.Match.ADD1OP, trace$);
        return new Add1Prim();
    }

    public String toString() {
        return "add1";
    }

//Add1Prim//
}
