#PrimappExp:top#
#PrimappExp:import#

# <exp>:PrimappExp ::= <prim> LPAREN <rands> RPAREN
class PrimappExp(Exp): #PrimappExp:class#

    className = "PrimappExp"
    ruleString = "<exp>:PrimappExp ::= <prim> LPAREN <rands> RPAREN"
    prim = None
    rands = None

    def __init__(prim, rands):
        #PrimappExp:init#
        self.prim = prim
        self.rands = rands

#PrimappExp#
