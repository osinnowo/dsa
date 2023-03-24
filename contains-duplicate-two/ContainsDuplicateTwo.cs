using System.Collections.Generic;

public class ContainsDuplicateTwo{
    public bool ContainDuplicateTwo(int[] nums, int k) {
        HashSet<int> set = new HashSet<int>();
        for(int i = 0; i < nums.Length; i++) {
            if(set.Contains(nums[i])) { 
                return true; 
            }
            set.Add(nums[i]);
            if(set.Count > k) {
                set.Remove(nums[i - k]);
            }
        }
        return false;   
    }
}