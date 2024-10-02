//Empty:top//
//Empty:import//
import java.util.*;

// <bal_paren>:Empty ::= 
public class Empty extends Bal_paren /*Empty:class*/ {

    public static final String $className = "Empty";
    public static final String $ruleString =
        "<bal_paren>:Empty ::= ";



    public Empty() {
//Empty:init//

    }

    public static Empty parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<bal_paren>:Empty", scn$.lno);
        return new Empty();
    }

//Empty//
}
