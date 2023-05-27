import java.util.*;

class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
            if (set.size() > 3) {
                set.remove(Collections.min(set));
            }
        }
        
        if (set.size() == 3) {
            return Collections.min(set);
        }
        
        return Collections.max(set);
    }
}
