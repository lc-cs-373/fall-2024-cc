#Na:top#
#Na:import#

# <scanin>:Na ::= <comment>
class Na(Scanin): #Na:class#

    className = "Na"
    ruleString = "<scanin>:Na ::= <comment>"
    comment = None

    def __init__(comment):
        #Na:init#
        self.comment = comment

#Na#
