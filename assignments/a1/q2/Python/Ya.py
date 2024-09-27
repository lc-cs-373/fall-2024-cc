#Ya:top#
#Ya:import#

# <scanin>:Ya ::= <scanny>
class Ya(Scanin): #Ya:class#

    className = "Ya"
    ruleString = "<scanin>:Ya ::= <scanny>"
    scanny = None

    def __init__(scanny):
        #Ya:init#
        self.scanny = scanny

#Ya#
