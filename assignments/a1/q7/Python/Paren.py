#Paren:top#
#Paren:import#

# <balancedparen>:Paren ::= <LP> <balancedparen> RP
class Paren(Balancedparen): #Paren:class#

    className = "Paren"
    ruleString = "<balancedparen>:Paren ::= <LP> <balancedparen> RP"
    lp = None
    balancedparen = None

    def __init__(lp, balancedparen):
        #Paren:init#
        self.lp = lp
        self.balancedparen = balancedparen

#Paren#
