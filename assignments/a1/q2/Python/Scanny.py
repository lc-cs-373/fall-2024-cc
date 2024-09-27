#Scanny:top#
#Scanny:import#

# <scanny> ::= <type> TITLE <rule>
class Scanny(): #Scanny:class#

    className = "Scanny"
    ruleString = "<scanny> ::= <type> TITLE <rule>"
    type = None
    rule = None

    def __init__(type, rule):
        #Scanny:init#
        self.type = type
        self.rule = rule

#Scanny#
