using System;
using System.Collections.Generic;

public class RotateArray {
    public int[] RotateArray1(int[] array, int times) {
        int[] result = new int[array.Length];
        int count = 0;
        for(int i = times; i < array.Length; i++) {
            result[count] = array[i];
            count++;
        }

        for(int j = 0; j < times; j++) {
            result[count] = array[j];
            count++;
        }

        return result;
    }

    public int[] RotateArray2(int[] array, int times) {
        for(int i = 0; i < times; i++) {
            int firstItem = array[0];
            for(int j = 0; j < array.Length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.Length - 1] = firstItem;
        }
        return array;
    }

    public int[] RotateArray3(int[] array, int times) {
        int i = 0;
        while(i < times) {
            int firstItem = array[0];
            for(int j = 0; j < array.Length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.Length - 1] = firstItem;
            i++;
        }
        return array;
    }
}