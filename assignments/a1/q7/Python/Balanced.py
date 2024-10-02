#Balanced:top#
#Balanced:import#

# <balanced> ::= <bal_paren> AT
class Balanced(_Start): #Balanced:class#

    className = "Balanced"
    ruleString = "<balanced> ::= <bal_paren> AT"
    bal_paren = None

    def __init__(bal_paren):
        #Balanced:init#
        self.bal_paren = bal_paren

#Balanced#
