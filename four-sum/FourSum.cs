using System;
using System.Collections.Generic;

public class FourSum {
    public static List<int[]> FourSums(int[] array, int targetSum) {
        Array.Sort(array);
        List<int[]> results = new List<int[]>();
        for(int i = 0; i < array.Length; i++) {
            for(int j = i + 1; j < array.Length; j++) {
                int left = j + 1;
                int right = array.Length - 1;
                while(left < right) {
                    int sum = array[i] + array[j] + array[left] + array[right];
                    if(sum == targetSum) {
                        results.Add(new int[] { array[i], array[j], array[left], array[right] });
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