#Has:top#
#Has:import#

# <stuff>:Has ::= <rule> <stuff>
class Has(Stuff): #Has:class#

    className = "Has"
    ruleString = "<stuff>:Has ::= <rule> <stuff>"
    rule = None
    stuff = None

    def __init__(rule, stuff):
        #Has:init#
        self.rule = rule
        self.stuff = stuff

#Has#
