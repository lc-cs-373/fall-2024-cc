//None:top//
//None:import//
import java.util.*;

// <balencedparen>:None ::= 
public class None extends Balencedparen /*None:class*/ {

    public static final String $className = "None";
    public static final String $ruleString =
        "<balencedparen>:None ::= ";



    public None() {
//None:init//

    }

    public static None parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<balencedparen>:None", scn$.lno);
        return new None();
    }

//None//
}
