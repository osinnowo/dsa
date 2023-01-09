using System;

public class ThreeNumberSums {
    public static List<int[]> ThreeNumbersSum(int[] array, int targetSum) {
        List<int[]> results = new List<int[]>();
        Array.Sort(array);
        for(int i = 0; i < array.Length; i++){
            int left = i  + 1;
            int right = array.Length - 1;
            while(left < right) {
                int sum = array[i] + array[left] + array[right];
                if(sum.Equals(targetSum)) {
                    results.Add(new int[] { array[i], array[left], array[right] });
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