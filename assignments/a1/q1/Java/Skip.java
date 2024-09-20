//Skip:top//
//Skip:import//
import java.util.*;

// <skip> ::= POUND <sentence>
public class Skip /*Skip:class*/ {

    public static final String $className = "Skip";
    public static final String $ruleString =
        "<skip> ::= POUND <sentence>";

    public Sentence sentence;

    public Skip(Sentence sentence) {
//Skip:init//
        this.sentence = sentence;
    }

    public static Skip parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<skip>", scn$.lno);
        scn$.match(Token.Match.POUND, trace$);
        Sentence sentence = Sentence.parse(scn$, trace$);
        return new Skip(sentence);
    }

//Skip//
}
