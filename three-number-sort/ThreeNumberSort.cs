using System;
using System.Collections.Generic;

public class ThreeNumberSort {
    public static int[] ThreeNumberSort1(int[] array, int[] order) {
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

    public static int[] ThreeNumberSort2(int[] array, int[] order) {
   	    int right = array.Length - 1;
        for(int i = order.Length - 1; i >= 0; i--){
            int left = 0;
            while(left < right) {
                if(array[right] == order[i]) { right--; continue ; }
                while(left < right) {
                    if(array[left] == order[i]) {
                        int temp = array[right];
                        array[right] = array[left];
                        array[left] = temp;
                        right--; break;
                    }
                    left++;
                }
            }
        }
        return array;
    }
}