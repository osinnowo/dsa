class LongestOnes:
    def longestOnes(self, nums: List[int], k: int) -> int:
        left = 0  # Left pointer of the sliding window
        max_length = 0  # Variable to track the maximum subarray length
        zero_count = 0  # Variable to count the number of zeros in the current window

        for right in range(len(nums)):
            # Expand the window to the right
            if nums[right] == 0:
                zero_count += 1

            # Shrink the window from the left if zero_count exceeds k
            while zero_count > k:
                if nums[left] == 0:
                    zero_count -= 1
                left += 1

            # Update max_length if the current window size is larger
            max_length = max(max_length, right - left + 1)

        return max_length