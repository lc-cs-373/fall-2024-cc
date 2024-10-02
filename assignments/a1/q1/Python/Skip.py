#Skip:top#
#Skip:import#

# <skip> ::= POUND <sentence>
class Skip(): #Skip:class#

    className = "Skip"
    ruleString = "<skip> ::= POUND <sentence>"
    sentence = None

    def __init__(sentence):
        #Skip:init#
        self.sentence = sentence

#Skip#
