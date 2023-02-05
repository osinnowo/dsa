using System;

public class LongestPeak {
    public int LongestPeakLength(int[] array) 
    {
      	int longestPeak = 0;
        int index = 1;
        while (index < array.Length - 1) {
            bool isOverlap = array[index - 1] < array[index] && array[index] > array[index + 1];
            if(!isOverlap) {
                index++;
                continue;   
            }

            int leftIndex = index - 2;
            while(leftIndex >= 0 && (array[leftIndex] < array[leftIndex + 1])) {
                leftIndex--;
            }

            int rightIndex = index + 2;
            while(rightIndex < array.Length && (array[rightIndex] < array[rightIndex - 1])) {
                rightIndex++;
            }
            longestPeak = Math.Max(longestPeak, rightIndex - leftIndex - 1);
            index = rightIndex;
        }
        return longestPeak;
    }
}