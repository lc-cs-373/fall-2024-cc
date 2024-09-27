//Skip:top//
//Skip:import//
import java.util.*;

// <type>:Skip ::= SKIP
public class Skip extends Type /*Skip:class*/ {

    public static final String $className = "Skip";
    public static final String $ruleString =
        "<type>:Skip ::= SKIP";



    public Skip() {
//Skip:init//

    }

    public static Skip parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<type>:Skip", scn$.lno);
        scn$.match(Token.Match.SKIP, trace$);
        return new Skip();
    }

//Skip//
}
