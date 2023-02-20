/**
 * QuickSort - Algorithm:
 * This algorithm uses Lomuto Partioning Scheme, where a pivot is picked at the 
 * middle of the input array. This algorithm is a divide & conquer implementation, 
 * where two partitions are made from the left and right and continue to sort each 
 * of them recursively until all the items of the array are sorted in their right 
 * positions.                                                
 *
 *
 * MIT License
 *
 * Copyright (c) 2023 Osinnowo Emmanuel
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of 
 * this software and associated documentation files (the "Software"), to deal in 
 * the Software without restriction, including without limitation the rights to 
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies 
 * of the Software, and to permit persons to whom the Software is furnished to do 
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all 
 * copies or substantial portions of the Software.                                
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS 
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER 
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN 
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.      
 */

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
