//TreeNode:top//
//TreeNode:import//
import java.util.*;

// <tree>:TreeNode ::= LPAREN SYMBOL <tree>:leftNode <tree>:rightNode RPAREN
public class TreeNode extends Tree /*TreeNode:class*/ {

    public static final String $className = "TreeNode";
    public static final String $ruleString =
        "<tree>:TreeNode ::= LPAREN SYMBOL <tree>:leftNode <tree>:rightNode RPAREN";

    public Tree leftNode;
    public Tree rightNode;

    public TreeNode(Tree leftNode, Tree rightNode) {
//TreeNode:init//
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public static TreeNode parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<tree>:TreeNode", scn$.lno);
        scn$.match(Token.Match.LPAREN, trace$);
        scn$.match(Token.Match.SYMBOL, trace$);
        Tree leftNode = Tree.parse(scn$, trace$);
        Tree rightNode = Tree.parse(scn$, trace$);
        scn$.match(Token.Match.RPAREN, trace$);
        return new TreeNode(leftNode, rightNode);
    }

//TreeNode//
}
