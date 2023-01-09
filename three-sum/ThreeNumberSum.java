import java.util.*;

public class ThreeNumberSum {
    public static List<Integer[]> ThreeNumbersSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> results = new ArrayList<>();
        for(int index = 0; index < array.length; index++) {
            int left = index + 1;
            int right = array.length - 1;
            while(left < right) {
                int sum = array[index] + array[left] + array[right];
                if(sum == targetSum) {
                    results.add(new Integer[] { array[index], array[left], array[right] });
                    left++; right--;
                } else if (sum < targetSum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return results;
    }
}