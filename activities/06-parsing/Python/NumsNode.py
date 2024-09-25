#NumsNode:top#
#NumsNode:import#

# <nums>:NumsNode ::= <NUM> <nums>
class NumsNode(Nums): #NumsNode:class#

    className = "NumsNode"
    ruleString = "<nums>:NumsNode ::= <NUM> <nums>"
    num = None
    nums = None

    def __init__(num, nums):
        #NumsNode:init#
        self.num = num
        self.nums = nums

#NumsNode#
