#ListSome:top#
#ListSome:import#

# <nums>:ListSome ::= NUM <com>
class ListSome(Nums): #ListSome:class#

    className = "ListSome"
    ruleString = "<nums>:ListSome ::= NUM <com>"
    com = None

    def __init__(com):
        #ListSome:init#
        self.com = com

#ListSome#
