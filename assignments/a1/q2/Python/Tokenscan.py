#Tokenscan:top#
#Tokenscan:import#

# <tokenscan> ::= TOKEN TITLE <rule>
class Tokenscan(_Start): #Tokenscan:class#

    className = "Tokenscan"
    ruleString = "<tokenscan> ::= TOKEN TITLE <rule>"
    rule = None

    def __init__(rule):
        #Tokenscan:init#
        self.rule = rule

#Tokenscan#
