//Balencedparen:top//
//Balencedparen:import//
import java.util.*;

public abstract class Balencedparen /*Balencedparen:class*/ {

    public static final String $className = "Balencedparen";
    public static Balencedparen parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case AT:
            return None.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Balencedparen cannot begin with " + t$.errString()
            );
        }
    }

//Balencedparen//
}
