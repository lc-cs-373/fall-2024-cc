//Verb:top//
//Verb:import//
import java.util.*;

// <verb> ::= WORD
public class Verb /*Verb:class*/ {

    public static final String $className = "Verb";
    public static final String $ruleString =
        "<verb> ::= WORD";



    public Verb() {
//Verb:init//

    }

    public static Verb parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<verb>", scn$.lno);
        scn$.match(Token.Match.WORD, trace$);
        return new Verb();
    }

//Verb//
}
