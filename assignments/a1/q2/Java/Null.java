//Null:top//
//Null:import//
import java.util.*;

// <item>:Null ::= 
public class Null extends Item /*Null:class*/ {

    public static final String $className = "Null";
    public static final String $ruleString =
        "<item>:Null ::= ";



    public Null() {
//Null:init//

    }

    public static Null parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<item>:Null", scn$.lno);
        return new Null();
    }

//Null//
}
