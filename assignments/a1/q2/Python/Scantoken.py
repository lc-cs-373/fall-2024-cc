#Scantoken:top#
#Scantoken:import#

# <scantoken> ::= TOKEN TITLE <rule>
class Scantoken(): #Scantoken:class#

    className = "Scantoken"
    ruleString = "<scantoken> ::= TOKEN TITLE <rule>"
    rule = None

    def __init__(rule):
        #Scantoken:init#
        self.rule = rule

#Scantoken#
