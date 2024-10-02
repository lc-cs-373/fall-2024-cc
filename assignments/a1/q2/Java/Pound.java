//Pound:top//
//Pound:import//
import java.util.*;

// <type>:Pound ::= COMMENT
public class Pound extends Type /*Pound:class*/ {

    public static final String $className = "Pound";
    public static final String $ruleString =
        "<type>:Pound ::= COMMENT";



    public Pound() {
//Pound:init//

    }

    public static Pound parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<type>:Pound", scn$.lno);
        scn$.match(Token.Match.COMMENT, trace$);
        return new Pound();
    }

//Pound//
}
