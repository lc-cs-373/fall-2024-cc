#Scanin:top#
#Scanin:import#

# <scanin> ::= <type> TITLE <rule>
class Scanin(_Start): #Scanin:class#

    className = "Scanin"
    ruleString = "<scanin> ::= <type> TITLE <rule>"
    type = None
    rule = None

    def __init__(type, rule):
        #Scanin:init#
        self.type = type
        self.rule = rule

#Scanin#
