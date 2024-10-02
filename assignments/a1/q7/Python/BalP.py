#BalP:top#
#BalP:import#

# <balancedparen>:BalP ::= LP <balancedparen> RP
class BalP(Balancedparen): #BalP:class#

    className = "BalP"
    ruleString = "<balancedparen>:BalP ::= LP <balancedparen> RP"
    balancedparen = None

    def __init__(balancedparen):
        #BalP:init#
        self.balancedparen = balancedparen

#BalP#
