using System;
using System.Collections.Generic;

public class ThreeNumberSort {
    public int[] ThreeNumberSort1(int[] array, int[] order) {
        int left = 0;
        for(int index = 0; index < order.Length; index++) {
            int right = array.Length - 1;
            while(left < right) {
                if(array[left] == order[index]) { left++; continue; }
                while(right > left) {
                    if(array[right] == order[index]) {
                        int temp = array[left];
                        array[left] = array[right];
                        array[right] = temp;
                        left++; break;
                    }
                    right--;
                }
            }
        }
        return array;
    }
}