public class SelectionSort {
    public int[] selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int j = i + 1;
            int smallestIndex = i;
            while(j < array.length) {
                if(array[smallestIndex] > array[j]) {
                    smallestIndex = j;
                }
                j++;
            }
            int temp = array[smallestIndex];
            array[smallestIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
