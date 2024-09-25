//Noun:top//
//Noun:import//
import java.util.*;

// <noun> ::= WORD
public class Noun /*Noun:class*/ {

    public static final String $className = "Noun";
    public static final String $ruleString =
        "<noun> ::= WORD";



    public Noun() {
//Noun:init//

    }

    public static Noun parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<noun>", scn$.lno);
        scn$.match(Token.Match.WORD, trace$);
        return new Noun();
    }

//Noun//
}
