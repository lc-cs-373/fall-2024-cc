#Yes:top#
#Yes:import#

# <bal_paren>:Yes ::= LP <bal_paren>inner RP <bal_paren>outer
class Yes(Bal_paren): #Yes:class#

    className = "Yes"
    ruleString = "<bal_paren>:Yes ::= LP <bal_paren>inner RP <bal_paren>outer"
    inner = None
    outer = None

    def __init__(inner, outer):
        #Yes:init#
        self.inner = inner
        self.outer = outer

#Yes#
