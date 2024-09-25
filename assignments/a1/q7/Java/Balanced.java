//Balanced:top//
//Balanced:import//
import java.util.*;

// <balanced> ::= <balencedparen> AT
public class Balanced extends _Start /*Balanced:class*/ {

    public static final String $className = "Balanced";
    public static final String $ruleString =
        "<balanced> ::= <balencedparen> AT";

    public Balencedparen balencedparen;

    public Balanced(Balencedparen balencedparen) {
//Balanced:init//
        this.balencedparen = balencedparen;
    }

    public static Balanced parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<balanced>", scn$.lno);
        Balencedparen balencedparen = Balencedparen.parse(scn$, trace$);
        scn$.match(Token.Match.AT, trace$);
        return new Balanced(balencedparen);
    }

//Balanced//
}
