//Bal_paren:top//
//Bal_paren:import//
import java.util.*;

public abstract class Bal_paren /*Bal_paren:class*/ {

    public static final String $className = "Bal_paren";
    public static Bal_paren parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case LP:
            return Yes.parse(scn$,trace$);
        case RP:
        case AT:
            return Empty.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Bal_paren cannot begin with " + t$.errString()
            );
        }
    }

//Bal_paren//
}
