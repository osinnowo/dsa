from typing import List

class MoveZeroesInPosition:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        left = 0
        size = len(nums) 

        while left < size:
            while left < size and nums[left] != 0:
                left += 1
            
            right = left + 1
            while right < size - 1 and nums[right] == 0:
                right += 1
            
            if right < size:
                nums[left], nums[right] = nums[right], nums[left]
            
            left += 1