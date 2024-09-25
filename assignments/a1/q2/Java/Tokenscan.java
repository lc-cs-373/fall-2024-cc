//Tokenscan:top//
//Tokenscan:import//
import java.util.*;

// <tokenscan> ::= TOKEN TITLE <rule>
public class Tokenscan extends _Start /*Tokenscan:class*/ {

    public static final String $className = "Tokenscan";
    public static final String $ruleString =
        "<tokenscan> ::= TOKEN TITLE <rule>";

    public Rule rule;

    public Tokenscan(Rule rule) {
//Tokenscan:init//
        this.rule = rule;
    }

    public static Tokenscan parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<tokenscan>", scn$.lno);
        scn$.match(Token.Match.TOKEN, trace$);
        scn$.match(Token.Match.TITLE, trace$);
        Rule rule = Rule.parse(scn$, trace$);
        return new Tokenscan(rule);
    }

//Tokenscan//
}
