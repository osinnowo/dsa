import java.util.*;

public class ZeroSumSubArray {
    public static boolean zeroSumSubArray1(int[] array) {
        if(array.length == 1 && array[0] == 0) { return true; }
        for(int i = 1; i < array.length; i++) {
            int sum = 0;
            int leftIndex = i - 1;
            while(leftIndex >= 0) {
                int leftSum = array[leftIndex] + array[i];
                if(leftSum == 0) { return true; }
                sum += leftSum;
                leftIndex--;
            }

            int rightIndex = i + 1;
            while(rightIndex < array.length) {
                int rightSum = array[rightIndex] + array[i];
                if(rightSum == 0) { return true; }
                sum += rightSum;
                rightIndex++;
            }

            if(sum == 0) return true;
        }
        return false;
    }    

    public static boolean zeroSumSubArray2(int[] array) {
        Set<Integer> set = new HashSet<>();
        int summation = 0;
        for(var num : array)  {
            summation += num;
            if(num == 0 || summation == 0 || set.contains(summation)) return true;
            set.add(summation);
        }
        return false;
    }
}
