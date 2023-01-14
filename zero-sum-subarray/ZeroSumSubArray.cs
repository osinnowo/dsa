using System;

public class ZeroSumSubArray
{
    public static bool ZeroSumSubArray(int[] array) {
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
}