//Null:top//
//Null:import//
import java.util.*;

// <input>:Null ::= 
public class Null extends Input /*Null:class*/ {

    public static final String $className = "Null";
    public static final String $ruleString =
        "<input>:Null ::= ";



    public Null() {
//Null:init//

    }

    public static Null parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<input>:Null", scn$.lno);
        return new Null();
    }

//Null//
}
