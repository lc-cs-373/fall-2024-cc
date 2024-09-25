//TreeNum:top//
//TreeNum:import//
import java.util.*;

// <tree>:TreeNum ::= <NUM>
public class TreeNum extends Tree /*TreeNum:class*/ {

    public static final String $className = "TreeNum";
    public static final String $ruleString =
        "<tree>:TreeNum ::= <NUM>";

    public Token num;

    public TreeNum(Token num) {
//TreeNum:init//
        this.num = num;
    }

    public static TreeNum parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<tree>:TreeNum", scn$.lno);
        Token num = scn$.match(Token.Match.NUM, trace$);
        return new TreeNum(num);
    }

//TreeNum//
}
