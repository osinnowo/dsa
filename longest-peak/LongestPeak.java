import java.util.*;

public class LongestPeak { 
    public int longestPeak(int[] array) {
        int longestPeakLength = 0;
        int index = 1;
        while(index < array.length - 1) {
            boolean isOverlap = array[index - 1] < array[index] && array[index] > array[index + 1];
            if(!isOverlap) { index++; continue; }
            
            int leftIndex = index - 2;
            while(leftIndex >= 0 && (array[leftIndex] < array[leftIndex + 1])){
                leftIndex--;
            }

            int rightIndex = index + 2;
            while(rightIndex < array.length && (array[rightIndex] < array[rightIndex - 1])) {
                rightIndex++;
            }

            longestPeakLength = Math.max(longestPeakLength, rightIndex - leftIndex - 1);
            index = rightIndex;
        }
        return longestPeakLength;
    }
}