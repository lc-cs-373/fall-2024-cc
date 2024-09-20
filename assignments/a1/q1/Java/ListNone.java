//ListNone:top//
//ListNone:import//
import java.util.*;

// <words>:ListNone ::= 
public class ListNone extends Words /*ListNone:class*/ {

    public static final String $className = "ListNone";
    public static final String $ruleString =
        "<words>:ListNone ::= ";



    public ListNone() {
//ListNone:init//

    }

    public static ListNone parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<words>:ListNone", scn$.lno);
        return new ListNone();
    }

//ListNone//
}
