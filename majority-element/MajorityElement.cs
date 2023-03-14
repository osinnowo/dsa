public class MajorityElement {
    public int MajorityElement(int[] nums) {
        int count = 0;
        int majorityElement = 0;

        for (int i = 0; i < nums.Length; i++) {
            if (count == 0) {
                majorityElement = nums[i];
            }
            count += (majorityElement == nums[i]) ? 1 : -1;
        }

        return majorityElement;
    }
}
