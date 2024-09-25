#LitExp:top#
#LitExp:import#

# <exp>:LitExp ::= <LIT>
class LitExp(Exp): #LitExp:class#

    className = "LitExp"
    ruleString = "<exp>:LitExp ::= <LIT>"
    lit = None

    def __init__(lit):
        #LitExp:init#
        self.lit = lit

#LitExp#
