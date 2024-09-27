//Scanin:top//
//Scanin:import//
import java.util.*;

// <scanin> ::= <type> TITLE <rule>
public class Scanin extends _Start /*Scanin:class*/ {

    public static final String $className = "Scanin";
    public static final String $ruleString =
        "<scanin> ::= <type> TITLE <rule>";

    public Type type;
    public Rule rule;

    public Scanin(Type type, Rule rule) {
//Scanin:init//
        this.type = type;
        this.rule = rule;
    }

    public static Scanin parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<scanin>", scn$.lno);
        Type type = Type.parse(scn$, trace$);
        scn$.match(Token.Match.TITLE, trace$);
        Rule rule = Rule.parse(scn$, trace$);
        return new Scanin(type, rule);
    }

//Scanin//
}
