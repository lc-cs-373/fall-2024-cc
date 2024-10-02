//Tokenin:top//
//Tokenin:import//
import java.util.*;

// <type>:Tokenin ::= TOKEN
public class Tokenin extends Type /*Tokenin:class*/ {

    public static final String $className = "Tokenin";
    public static final String $ruleString =
        "<type>:Tokenin ::= TOKEN";



    public Tokenin() {
//Tokenin:init//

    }

    public static Tokenin parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<type>:Tokenin", scn$.lno);
        scn$.match(Token.Match.TOKEN, trace$);
        return new Tokenin();
    }

//Tokenin//
}
