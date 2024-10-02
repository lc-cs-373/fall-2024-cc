#Ye:top#
#Ye:import#

# <scanin>:Ye ::= <scanny>
class Ye(Scanin): #Ye:class#

    className = "Ye"
    ruleString = "<scanin>:Ye ::= <scanny>"
    scanny = None

    def __init__(scanny):
        #Ye:init#
        self.scanny = scanny

#Ye#
