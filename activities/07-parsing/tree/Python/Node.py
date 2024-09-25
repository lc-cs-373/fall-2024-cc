#Node:top#
#Node:import#

# <tree>:Node ::= LPAREN SYMBOL <tree>:leftnode <tree>:rightnode RPAREN
class Node(Tree): #Node:class#

    className = "Node"
    ruleString = "<tree>:Node ::= LPAREN SYMBOL <tree>:leftnode <tree>:rightnode RPAREN"
    leftnode = None
    rightnode = None

    def __init__(leftnode, rightnode):
        #Node:init#
        self.leftnode = leftnode
        self.rightnode = rightnode

#Node#
