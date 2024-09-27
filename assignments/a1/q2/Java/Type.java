//Type:top//
//Type:import//
import java.util.*;

public abstract class Type /*Type:class*/ {

    public static final String $className = "Type";
    public static Type parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case TOKEN:
            return Tokenin.parse(scn$,trace$);
        case SKIP:
            return Skip.parse(scn$,trace$);
        case COMMENT:
            return Pound.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Type cannot begin with " + t$.errString()
            );
        }
    }

//Type//
}
