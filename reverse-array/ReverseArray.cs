using System;
using System.Collections.Generic;

public class ReverseArray{
    public static int[] ReverseAnArray1(int[] array) {
        int[] result = new int[array.Length];
        for(int i = array.Length - 1; i >= 0; i--) {
           result[i] = array[array.Length - i - 1];
        }
        return result;
    }

    public static int[] ReverseAnArray2(int[] array) {
        for(int i = 0; i < array.Length / 2; i++) {
            int lastIndex = array.Length - i - 1;
            int temp = array[lastIndex];
            array[lastIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static int[] ReverseAnArray3(int[] array) {
        int left = 0;
        int right = array.Length - 1;
        while(left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++; right--;
        }
        return array;
    }
}