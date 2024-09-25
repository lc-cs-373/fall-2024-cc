//Balancedparen:top//
//Balancedparen:import//
import java.util.*;

public abstract class Balancedparen /*Balancedparen:class*/ {

    public static final String $className = "Balancedparen";
    public static Balancedparen parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case LP:
            return Paren.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Balancedparen cannot begin with " + t$.errString()
            );
        }
    }

//Balancedparen//
}
