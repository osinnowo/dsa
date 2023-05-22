import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        
        if (nums == null || nums.length == 0) {
            return result;
        }
        
        int n = nums.length;
        int start = nums[0];
        
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || nums[i] + 1 != nums[i + 1]) {
                if (nums[i] == start) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i]);
                }
                
                if (i != n - 1) {
                    start = nums[i + 1];
                }
            }
        }
        
        return result;
    }
}
