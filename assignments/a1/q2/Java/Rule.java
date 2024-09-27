//Rule:top//
//Rule:import//
import java.util.*;

// <rule> ::= QUOTE <input> QUOTE
public class Rule /*Rule:class*/ {

    public static final String $className = "Rule";
    public static final String $ruleString =
        "<rule> ::= QUOTE <input> QUOTE";

    public Input input;

    public Rule(Input input) {
//Rule:init//
        this.input = input;
    }

    public static Rule parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<rule>", scn$.lno);
        scn$.match(Token.Match.QUOTE, trace$);
        Input input = Input.parse(scn$, trace$);
        scn$.match(Token.Match.QUOTE, trace$);
        return new Rule(input);
    }

//Rule//
}
