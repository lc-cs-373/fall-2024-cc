#Rule:top#
#Rule:import#

# <rule> ::= QUOTE <input> QUOTE
class Rule(): #Rule:class#

    className = "Rule"
    ruleString = "<rule> ::= QUOTE <input> QUOTE"
    input = None

    def __init__(input):
        #Rule:init#
        self.input = input

#Rule#
