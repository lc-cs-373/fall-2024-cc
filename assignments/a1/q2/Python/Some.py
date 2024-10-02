#Some:top#
#Some:import#

# <stuff>:Some ::= TITLE <rule>
class Some(Stuff): #Some:class#

    className = "Some"
    ruleString = "<stuff>:Some ::= TITLE <rule>"
    rule = None

    def __init__(rule):
        #Some:init#
        self.rule = rule

#Some#
