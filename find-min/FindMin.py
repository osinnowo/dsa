from typing import List

class Solution:
    def findMin(self, nums: List[int]) -> int:
        # Check if the list is empty
        if not nums:
            raise ValueError("Input list is empty")

        # Initialize variables to keep track of the minimum element
        # and the left and right pointers for binary search
        left = 0
        right = len(nums) - 1
        min_element = float('inf')  # Initialize with positive infinity

        # Perform binary search to find the minimum element
        while left <= right:
            mid = left + (right - left) // 2

            # Update the minimum element if a smaller element is found
            min_element = min(min_element, nums[mid])

            # Adjust the pointers based on the binary search conditions
            if nums[mid] < nums[right]:
                right = mid - 1
            else:
                left = mid + 1

        return min_element
