#Comma:top#
#Comma:import#

# <com>:Comma ::= COMMA <nums>
class Comma(Com): #Comma:class#

    className = "Comma"
    ruleString = "<com>:Comma ::= COMMA <nums>"
    nums = None

    def __init__(nums):
        #Comma:init#
        self.nums = nums

#Comma#
