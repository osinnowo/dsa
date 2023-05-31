class ThreeSumSmaller(object):
    def threeSumSmaller(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        nums.sort()  
        index = 0
        count = 0
        while index < len(nums) - 2:
            left = index + 1
            right = len(nums) - 1
            while left < right:  
                if nums[left] + nums[index] + nums[right] < target:
                    count += right - left  
                    left += 1
                else:
                    right -= 1
            index += 1
        return count