import sys

class FindPeakElement:
    def findPeakElement(self, nums: List[int]) -> int:
        if len(nums) <= 1:
            return 0

        MIN_LENGTH = -sys.maxsize - 1
        peakIndex = 0
        while peakIndex < len(nums):
            left = MIN_LENGTH if peakIndex - 1 < 0 else nums[peakIndex - 1]
            right = MIN_LENGTH if peakIndex >= len(nums) - 1 else nums[peakIndex + 1]
            isPeak = left < nums[peakIndex] & nums[peakIndex] > right
            if(isPeak):
                break
            peakIndex = peakIndex + 1