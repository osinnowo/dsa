import java.util.*;

class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> permutations = new ArrayList<>();
        boolean[] storage = new boolean[nums.length];
        permute(nums, result, permutations, storage);
        return result;
    }

    public void permute(int[] nums, List<List<Integer>> result, List<Integer> permutations, boolean[] storage) {
        if(permutations.size() == nums.length) {
            result.add(new ArrayList<>(permutations));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(!storage[i]) {
                storage[i] = true;
                permutations.add(nums[i]);
                permute(nums, result, permutations, storage);
                permutations.remove(permutations.size() - 1);
                storage[i] = false;
            }
        }
    }
}