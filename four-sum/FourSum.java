import java.util.*;

public class FourSum {
    public static List<Integer[]> fourSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> results = new ArrayList<>();
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                int left = j + 1;
                int right = array.length - 1;
                while(left < right) {
                    int sum = array[i] + array[j] + array[left] + array[right];
                    if(sum == targetSum) {
                        results.add(new Integer[] { array[i], array[j], array[left], array[right] });
                        left++; right--;
                    } else if (sum < targetSum) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return results;
    }
}