//Skipline:top//
//Skipline:import//
import java.util.*;

// <skipline> ::= COMMENT
public class Skipline /*Skipline:class*/ {

    public static final String $className = "Skipline";
    public static final String $ruleString =
        "<skipline> ::= COMMENT";



    public Skipline() {
//Skipline:init//

    }

    public static Skipline parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<skipline>", scn$.lno);
        scn$.match(Token.Match.COMMENT, trace$);
        return new Skipline();
    }

//Skipline//
}
