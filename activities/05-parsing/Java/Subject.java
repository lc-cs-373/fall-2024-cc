//Subject:top//
//Subject:import//
import java.util.*;

// <subject> ::= <noun>
public class Subject /*Subject:class*/ {

    public static final String $className = "Subject";
    public static final String $ruleString =
        "<subject> ::= <noun>";

    public Noun noun;

    public Subject(Noun noun) {
//Subject:init//
        this.noun = noun;
    }

    public static Subject parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<subject>", scn$.lno);
        Noun noun = Noun.parse(scn$, trace$);
        return new Subject(noun);
    }

//Subject//
}
