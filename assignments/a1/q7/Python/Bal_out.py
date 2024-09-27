#Bal_out:top#
#Bal_out:import#

# <bal_out> ::= <bal_paren>
class Bal_out(): #Bal_out:class#

    className = "Bal_out"
    ruleString = "<bal_out> ::= <bal_paren>"
    bal_paren = None

    def __init__(bal_paren):
        #Bal_out:init#
        self.bal_paren = bal_paren

#Bal_out#
