//Input:top//
//Input:import//
import java.util.*;

public abstract class Input /*Input:class*/ {

    public static final String $className = "Input";
    public static Input parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case QUOTE:
            return Null.parse(scn$,trace$);
        case ITEM:
            return Item.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Input cannot begin with " + t$.errString()
            );
        }
    }

//Input//
}
