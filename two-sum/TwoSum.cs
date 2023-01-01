using System;
using System.Collections.Generic;

public class TwoSum {
    public static int[] TwoNumberSum1(int[] array, int targetSum) {
        for(int i = 0; i < array.Length; i++) {
            for(int j = 0; j < array.Length; j++) {
                if(i == j) continue; 
                if(array[i] + array[j] == targetSum) { 
                    return new int[] { array[i], array[j] }; 
                }
            }
        }
        return new int[0];                
    }

    public static int[] TwoNumberSum2(int[] array, int targetSum) {
        for(int i = 0; i < array.Length; i++) {
            for(int j = i + 1; j < array.Length; j++) {
                if(array[i] + array[j] == targetSum) { 
                    return new int[] { array[i], array[j] }; 
                }
            }
        }
        return new int[0];
    }

    public static int[] TwoNumberSum3(int[] array, int targetSum) {
        HashSet<int> set = new HashSet<int>();
        int index = 0;
        while(index < array.Length) {
            int difference = targetSum - array[index];
            if(set.Contains(difference)) { return new int[] { array[index], difference }; }
            set.Add(array[index]);
            index++;
        }
        return new int[]{};
    }

    public static int[] TwoNumberSum4(int[] array, int targetSum) {
        Dictionary<int, int> dictionary = new Dictionary<int, int>();
        foreach(int num in array) {
            int difference = targetSum - num;
            if(dictionary.ContainsKey(difference)) {
                return new int[] { difference, num };
            }
            dictionary.Add(num, difference);
        }
        return new int[]{};
    }

    public static int[] TwoNumberSum5(int[] array, int targetSum) {
        Array.Sort(array);
        int left = 0;
        int right = array.Length - 1;
        while(left < right) {
            int sum = array[left] + array[right];
            if(sum == targetSum) {
                return new int[]{ array[left], array[right] };
            } else if (sum < targetSum) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }
}