public class Solution {
    public int MaxOperations(int[] nums, int k) {
        Dictionary<int, int> freqMap = new Dictionary<int, int>();
        int maxOps = 0;
        
        foreach (int num in nums) {
            int complement = k - num;
            
            if (freqMap.ContainsKey(complement) && freqMap[complement] > 0) {
                maxOps++;
                freqMap[complement]--;
            } else {
                if (!freqMap.ContainsKey(num))
                    freqMap[num] = 0;
                
                freqMap[num]++;
            }
        }
        
        return maxOps;
    }
}