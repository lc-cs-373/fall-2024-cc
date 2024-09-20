//Words:top//
//Words:import//
import java.util.*;

public abstract class Words /*Words:class*/ {

    public static final String $className = "Words";
    public static Words parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case WS:
            return ListNone.parse(scn$,trace$);
        case WORD:
            return ListSome.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Words cannot begin with " + t$.errString()
            );
        }
    }

//Words//
}
