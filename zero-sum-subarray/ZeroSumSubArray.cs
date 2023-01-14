using System;
using System.Collections.Generic;
public class ZeroSumSubArray
{
    public static bool ZeroSumSubArray1(int[] array) {
        if(array.Length == 1 && array[0] == 0) { return true; }
        int index = 1;
        while(index < array.Length) {
            int leftIndex = index - 1;
            int sum = 0;
            while(leftIndex >= 0) {
                int leftSum = array[leftIndex] + array[index];
                if(leftSum == 0) { return true; }
                sum += leftSum;
                leftIndex--;
            }

            int rightIndex = index + 1;
            while(rightIndex < array.Length) {
                int rightSum = array[rightIndex] + array[index];
                if(rightSum == 0) { return true; }
                sum += rightSum;
                rightIndex++;
            }
            
            if(sum == 0) { return true; }

            index++;
        }
        return false;
    }

    public static bool ZeroSumSubArray2(int[] array) {
        HashSet<int> set = new HashSet<int>();
        int summation = 0;
        foreach(var num in array) {
            summation += num;
            if(num == 0 || summation == 0 || set.Contains(summation)) { return true; }
            set.Add(summation);
        }
        return false;
    }
}