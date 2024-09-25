//Paren:top//
//Paren:import//
import java.util.*;

// <balancedparen>:Paren ::= <LP> <balancedparen> RP
public class Paren extends Balancedparen /*Paren:class*/ {

    public static final String $className = "Paren";
    public static final String $ruleString =
        "<balancedparen>:Paren ::= <LP> <balancedparen> RP";

    public Token lp;
    public Balancedparen balancedparen;

    public Paren(Token lp, Balancedparen balancedparen) {
//Paren:init//
        this.lp = lp;
        this.balancedparen = balancedparen;
    }

    public static Paren parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<balancedparen>:Paren", scn$.lno);
        Token lp = scn$.match(Token.Match.LP, trace$);
        Balancedparen balancedparen = Balancedparen.parse(scn$, trace$);
        scn$.match(Token.Match.RP, trace$);
        return new Paren(lp, balancedparen);
    }

//Paren//
}
