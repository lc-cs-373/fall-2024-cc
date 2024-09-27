#Scanskip:top#
#Scanskip:import#

# <scanskip> ::= SKIP TITLE <rule>
class Scanskip(_Start): #Scanskip:class#

    className = "Scanskip"
    ruleString = "<scanskip> ::= SKIP TITLE <rule>"
    rule = None

    def __init__(rule):
        #Scanskip:init#
        self.rule = rule

#Scanskip#
