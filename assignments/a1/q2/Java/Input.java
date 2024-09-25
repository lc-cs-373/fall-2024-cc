//Input:top//
//Input:import//
import java.util.*;

// <item>:Input ::= <SPEC>
public class Input extends Item /*Input:class*/ {

    public static final String $className = "Input";
    public static final String $ruleString =
        "<item>:Input ::= <SPEC>";

    public Token spec;

    public Input(Token spec) {
//Input:init//
        this.spec = spec;
    }

    public static Input parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<item>:Input", scn$.lno);
        Token spec = scn$.match(Token.Match.SPEC, trace$);
        return new Input(spec);
    }

//Input//
}
