using System;

public class MaxSubArray
{
    public int MaxSubArrays(int[] nums) {
        int MaxSoFar = nums[0];
        int MaxCurrent = nums[0];
        for(int i = 1; i < nums.Length; i++) {
            MaxCurrent = Math.Max(MaxCurrent + nums[i], nums[i]);
            MaxSoFar = Math.Max(MaxCurrent, MaxSoFar);
        }
        return MaxSoFar;
    }
}