class Solution:
    def nthUglyNumber(self, n: int) -> int:
        ugly_nums = [1]  # Start with the first ugly number

        # Initialize pointers for each prime factor
        p2, p3, p5 = 0, 0, 0

        while len(ugly_nums) < n:
            # Compute the next ugly number
            next_num = min(ugly_nums[p2] * 2, ugly_nums[p3] * 3, ugly_nums[p5] * 5)
            ugly_nums.append(next_num)

            # Update the pointers based on the next ugly number
            if next_num == ugly_nums[p2] * 2:
                p2 += 1
            if next_num == ugly_nums[p3] * 3:
                p3 += 1
            if next_num == ugly_nums[p5] * 5:
                p5 += 1

        return ugly_nums[-1]
