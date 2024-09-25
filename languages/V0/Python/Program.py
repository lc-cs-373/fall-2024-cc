#Program:top#
#Program:import#

# <program> ::= <exp>
class Program(_Start): #Program:class#

    className = "Program"
    ruleString = "<program> ::= <exp>"
    exp = None

    def __init__(exp):
        #Program:init#
        self.exp = exp

#Program#
