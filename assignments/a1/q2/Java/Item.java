//Item:top//
//Item:import//
import java.util.*;

public abstract class Item /*Item:class*/ {

    public static final String $className = "Item";
    public static Item parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case SPEC:
            return Input.parse(scn$,trace$);
        case SINGLEQUOTE:
            return Null.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Item cannot begin with " + t$.errString()
            );
        }
    }

//Item//
}
