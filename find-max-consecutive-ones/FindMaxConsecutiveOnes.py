class FindMaxConsecutiveOnes(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_ones = 0  # Variable to store the maximum consecutive ones count
        current_ones = 0  # Variable to keep track of the current consecutive ones count
        
        for num in nums:
            if num == 1:
                current_ones += 1
                max_ones = max(max_ones, current_ones)
            else:
                current_ones = 0
        
        return max_ones
