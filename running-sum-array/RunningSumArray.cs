public class RunningSumArray {
    public int[] RunningSum(int[] nums) {
        int[] result = new int[nums.Length];
        result[0] = nums[0];
        int index = 1;
        while(index < nums.Length) {
            result[index] = result[index - 1] + nums[index];
            index++;
        }
        return result;
    }
}