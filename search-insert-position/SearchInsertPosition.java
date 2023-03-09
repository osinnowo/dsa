
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            if(nums[left] == target) {
                return left;
            } else if(nums[left] < target) {
                left++;
            } else {
                right--;
            }
        }
        return left;
    }
}
