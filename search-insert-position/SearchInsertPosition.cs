using System;

public class SearchInsertPosition {
    public int SearchInsertPositions(int[] nums, int target) 
    {
        int left = 0;
        int right = nums.Length - 1;
        while(left <= right) {
            if(nums[left] == target) {
                return left;
            } else if (nums[left] < target) {
                left += 1;
            } else {
                right -= 1;
            }
        }
        return left;
    }
}