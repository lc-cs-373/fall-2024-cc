#Sentence:top#
#Sentence:import#

# <sentence> ::= <words> WS
class Sentence(_Start): #Sentence:class#

    className = "Sentence"
    ruleString = "<sentence> ::= <words> WS"
    words = None

    def __init__(words):
        #Sentence:init#
        self.words = words

#Sentence#
