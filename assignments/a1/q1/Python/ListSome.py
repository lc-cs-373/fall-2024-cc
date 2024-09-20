#ListSome:top#
#ListSome:import#

# <words>:ListSome ::= WORD <words>
class ListSome(Words): #ListSome:class#

    className = "ListSome"
    ruleString = "<words>:ListSome ::= WORD <words>"
    words = None

    def __init__(words):
        #ListSome:init#
        self.words = words

#ListSome#
