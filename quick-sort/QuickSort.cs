using System;

public class QuickSort {
	public static int[] QuickSort(int[] array) {
        QuickSort(array, 0, array.Length - 1);
        return array;
    }

    public static void QuickSort(int[] array, int start, int end) {
        if(start >= end) { return; }
        int left = start;
        int right = end;
        int pivot = array[(start + end) / 2];
        while(left <= right) {
            while(array[left] < pivot) { left++; }
            while(array[right] > pivot) { right--; }
            if(left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++; right--;
            }  
        }
        QuickSort(array, start, right);
        QuickSort(array, left, end);
    }
}