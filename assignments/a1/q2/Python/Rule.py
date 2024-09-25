#Rule:top#
#Rule:import#

# <rule> ::= SINGLEQUOTE <item> SINGLEQUOTE
class Rule(): #Rule:class#

    className = "Rule"
    ruleString = "<rule> ::= SINGLEQUOTE <item> SINGLEQUOTE"
    item = None

    def __init__(item):
        #Rule:init#
        self.item = item

#Rule#
