//Program:top//
//Program:import//
import java.util.*;

// <program> ::= <exp>
public class Program extends _Start /*Program:class*/ {

    public static final String $className = "Program";
    public static final String $ruleString =
        "<program> ::= <exp>";

    public Exp exp;

    public Program(Exp exp) {
//Program:init//
        this.exp = exp;
    }

    public static Program parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<program>", scn$.lno);
        Exp exp = Exp.parse(scn$, trace$);
        return new Program(exp);
    }

    public void $run() {
        System.out.println(exp.toString());
    }

//Program//
}
