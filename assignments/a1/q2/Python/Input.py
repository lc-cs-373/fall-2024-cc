#Input:top#
#Input:import#

# <item>:Input ::= <SPEC>
class Input(Item): #Input:class#

    className = "Input"
    ruleString = "<item>:Input ::= <SPEC>"
    spec = None

    def __init__(spec):
        #Input:init#
        self.spec = spec

#Input#
