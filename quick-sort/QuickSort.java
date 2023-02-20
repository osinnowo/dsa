import java.util.*;

class QuickSort {
  public static int[] quickSort(int[] array) {
      quickSort(array, 0, array.length - 1);
      return array;
  }
  
  public static void quickSort(int[] array, int start, int end) {
      if(start >= end) return ;
      int left = start, right = end;
      int pivot = array[(start + end) / 2];
      while(left <= right) {
          while(array[left] < pivot) {
            left++;
          }
          while(array[right] > pivot) {
            right--;
          }
          if(left <= right) {
            int temp = array[right];
            array[right] = array[left];
            array[left] = temp;
            left++; right--;
         }
      }
      quickSort(array, start, right);
      quickSort(array, left, end);
  }
}
