#Balanced:top#
#Balanced:import#

# <balanced> ::= <balencedparen> AT
class Balanced(_Start): #Balanced:class#

    className = "Balanced"
    ruleString = "<balanced> ::= <balencedparen> AT"
    balencedparen = None

    def __init__(balencedparen):
        #Balanced:init#
        self.balencedparen = balencedparen

#Balanced#
