#TreeNode:top#
#TreeNode:import#

# <tree>:TreeNode ::= LPAREN SYMBOL <tree>:leftNode <tree>:rightNode RPAREN
class TreeNode(Tree): #TreeNode:class#

    className = "TreeNode"
    ruleString = "<tree>:TreeNode ::= LPAREN SYMBOL <tree>:leftNode <tree>:rightNode RPAREN"
    leftNode = None
    rightNode = None

    def __init__(leftNode, rightNode):
        #TreeNode:init#
        self.leftNode = leftNode
        self.rightNode = rightNode

#TreeNode#
