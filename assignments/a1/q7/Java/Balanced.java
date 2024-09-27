//Balanced:top//
//Balanced:import//
import java.util.*;

// <balanced> ::= <bal_paren> AT
public class Balanced extends _Start /*Balanced:class*/ {

    public static final String $className = "Balanced";
    public static final String $ruleString =
        "<balanced> ::= <bal_paren> AT";

    public Bal_paren bal_paren;

    public Balanced(Bal_paren bal_paren) {
//Balanced:init//
        this.bal_paren = bal_paren;
    }

    public static Balanced parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<balanced>", scn$.lno);
        Bal_paren bal_paren = Bal_paren.parse(scn$, trace$);
        scn$.match(Token.Match.AT, trace$);
        return new Balanced(bal_paren);
    }

//Balanced//
}
