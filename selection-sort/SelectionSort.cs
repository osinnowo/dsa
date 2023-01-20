public class SelectionSort {
    public static int[] SelectionSort1(int[] array) {
        for(int i = 0; i < array.Length; i++) {
            int smallestIndex = i;
            int j = i + 1;
            while(j < array.Length){
                if(array[smallestIndex] > array[j]) { smallestIndex = j; }
                j++;
            }
            int temp = array[smallestIndex];
            array[smallestIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static int[] SelectionSort2(int[] array) {
        for(int i = array.Length - 1; i >= 0; i--) {
            int largestIndex = i;
            int j = i - 1;
            while(j >= 0) {
                if(array[largestIndex] < array[j]) { largestIndex = j; }
                j--;
            }
            int temp = array[largestIndex];
            array[largestIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}