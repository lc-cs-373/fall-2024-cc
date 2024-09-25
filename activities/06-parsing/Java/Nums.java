//Nums:top//
//Nums:import//
import java.util.*;

// <nums> **= <NUM>
public class Nums /*Nums:class*/ {

    public static final String $className = "Nums";
    public static final String $ruleString =
        "<nums> **= <NUM>";

    public List<Token> numList;

    public Nums(List<Token> numList) {
//Nums:init//
        this.numList = numList;
    }

    public static Nums parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<nums>", scn$.lno);
        List<Token> numList = new ArrayList<Token>();
        while (true) {
            Token t$ = scn$.cur();
            Token.Match match$ = t$.match;
            switch(match$) {
            case NUM:
                numList.add(scn$.match(Token.Match.NUM, trace$));
                continue;
            default:
                return new Nums(numList);
            }
        }

    }

    public String toString() {
        return numList.toString();
    /*
        String s = "";
        for (Token t: this.numList) {
            s += t.toString() + " ";
        }
        return s;
        */
    }

//Nums//
}
