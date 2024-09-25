//Sentence:top//
//Sentence:import//
import java.util.*;

// <sentence> ::= <subject> <verb> <noun> PERIOD
public class Sentence extends _Start /*Sentence:class*/ {

    public static final String $className = "Sentence";
    public static final String $ruleString =
        "<sentence> ::= <subject> <verb> <noun> PERIOD";

    public Subject subject;
    public Verb verb;
    public Noun noun;

    public Sentence(Subject subject, Verb verb, Noun noun) {
//Sentence:init//
        this.subject = subject;
        this.verb = verb;
        this.noun = noun;
    }

    public static Sentence parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<sentence>", scn$.lno);
        Subject subject = Subject.parse(scn$, trace$);
        Verb verb = Verb.parse(scn$, trace$);
        Noun noun = Noun.parse(scn$, trace$);
        scn$.match(Token.Match.PERIOD, trace$);
        return new Sentence(subject, verb, noun);
    }

//Sentence//
}
