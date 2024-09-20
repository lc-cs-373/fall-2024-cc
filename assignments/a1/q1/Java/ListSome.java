//ListSome:top//
//ListSome:import//
import java.util.*;

// <words>:ListSome ::= WORD <words>
public class ListSome extends Words /*ListSome:class*/ {

    public static final String $className = "ListSome";
    public static final String $ruleString =
        "<words>:ListSome ::= WORD <words>";

    public Words words;

    public ListSome(Words words) {
//ListSome:init//
        this.words = words;
    }

    public static ListSome parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<words>:ListSome", scn$.lno);
        scn$.match(Token.Match.WORD, trace$);
        Words words = Words.parse(scn$, trace$);
        return new ListSome(words);
    }

//ListSome//
}
