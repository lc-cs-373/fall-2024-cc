#Something:top#
#Something:import#

# <something> ::= <type> TITLE <rule>
class Something(): #Something:class#

    className = "Something"
    ruleString = "<something> ::= <type> TITLE <rule>"
    type = None
    rule = None

    def __init__(type, rule):
        #Something:init#
        self.type = type
        self.rule = rule

#Something#
