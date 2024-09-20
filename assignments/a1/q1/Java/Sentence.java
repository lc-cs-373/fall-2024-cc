//Sentence:top//
//Sentence:import//
import java.util.*;

// <sentence> ::= <words> WS
public class Sentence extends _Start /*Sentence:class*/ {

    public static final String $className = "Sentence";
    public static final String $ruleString =
        "<sentence> ::= <words> WS";

    public Words words;

    public Sentence(Words words) {
//Sentence:init//
        this.words = words;
    }

    public static Sentence parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<sentence>", scn$.lno);
        Words words = Words.parse(scn$, trace$);
        scn$.match(Token.Match.WS, trace$);
        return new Sentence(words);
    }

//Sentence//
}
