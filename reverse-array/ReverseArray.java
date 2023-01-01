import java.util.*;

public class ReverseArray {
    public static int[] reverseArray1(int[] array) {
        int[] result = new int[array.length];
        for(int i = array.length - 1; i >= 0; i--) {
            result[i] = array[array.length - i - 1];
        }
        return result;
    }

    public static int[] reverseArray2(int[] array) {
        for(int i = 0; i < array.length / 2; i++) {
            int lastIndex = array.length - i - 1;
            int temp = array[i];
            array[i] = array[lastIndex];
            array[lastIndex] = temp;
        }
        return array;
    }

    public static int[] reverseArray3(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while(left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++; right--; 
        }
        return array;
    }
}