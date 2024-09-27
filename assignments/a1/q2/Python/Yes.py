#Yes:top#
#Yes:import#

# <scanin>:Yes ::= <something>
class Yes(Scanin): #Yes:class#

    className = "Yes"
    ruleString = "<scanin>:Yes ::= <something>"
    something = None

    def __init__(something):
        #Yes:init#
        self.something = something

#Yes#
