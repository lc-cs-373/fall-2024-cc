#Lon:top#
#Lon:import#

# <lon> ::= LEFTBRACKET <nums> RIGHTBRACKET
class Lon(_Start): #Lon:class#

    className = "Lon"
    ruleString = "<lon> ::= LEFTBRACKET <nums> RIGHTBRACKET"
    nums = None

    def __init__(nums):
        #Lon:init#
        self.nums = nums

#Lon#
