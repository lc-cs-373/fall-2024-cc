#TreeNum:top#
#TreeNum:import#

# <tree>:TreeNum ::= <NUM>
class TreeNum(Tree): #TreeNum:class#

    className = "TreeNum"
    ruleString = "<tree>:TreeNum ::= <NUM>"
    num = None

    def __init__(num):
        #TreeNum:init#
        self.num = num

#TreeNum#
