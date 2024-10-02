#Bal_in:top#
#Bal_in:import#

# <bal_in> ::= <bal_paren>
class Bal_in(): #Bal_in:class#

    className = "Bal_in"
    ruleString = "<bal_in> ::= <bal_paren>"
    bal_paren = None

    def __init__(bal_paren):
        #Bal_in:init#
        self.bal_paren = bal_paren

#Bal_in#
