//Rule:top//
//Rule:import//
import java.util.*;

// <rule> ::= SINGLEQUOTE <item> SINGLEQUOTE
public class Rule /*Rule:class*/ {

    public static final String $className = "Rule";
    public static final String $ruleString =
        "<rule> ::= SINGLEQUOTE <item> SINGLEQUOTE";

    public Item item;

    public Rule(Item item) {
//Rule:init//
        this.item = item;
    }

    public static Rule parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<rule>", scn$.lno);
        scn$.match(Token.Match.SINGLEQUOTE, trace$);
        Item item = Item.parse(scn$, trace$);
        scn$.match(Token.Match.SINGLEQUOTE, trace$);
        return new Rule(item);
    }

//Rule//
}
