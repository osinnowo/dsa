from typing import List

class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_area = 0
        left = 0
        right = len(height) - 1

        while left < right:
            # Calculate the current area between the two lines
            current_area = min(height[left], height[right]) * (right - left)

            # Update the max_area if the current area is greater
            max_area = max(max_area, current_area)

            # Move the pointers inward based on the shorter line
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        return max_area
