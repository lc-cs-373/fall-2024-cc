#VarExp:top#
#VarExp:import#

# <exp>:VarExp ::= <VAR>
class VarExp(Exp): #VarExp:class#

    className = "VarExp"
    ruleString = "<exp>:VarExp ::= <VAR>"
    var = None

    def __init__(var):
        #VarExp:init#
        self.var = var

#VarExp#
