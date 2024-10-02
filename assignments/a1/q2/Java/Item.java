//Item:top//
//Item:import//
import java.util.*;

// <input>:Item ::= ITEM
public class Item extends Input /*Item:class*/ {

    public static final String $className = "Item";
    public static final String $ruleString =
        "<input>:Item ::= ITEM";



    public Item() {
//Item:init//

    }

    public static Item parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<input>:Item", scn$.lno);
        scn$.match(Token.Match.ITEM, trace$);
        return new Item();
    }

//Item//
}
