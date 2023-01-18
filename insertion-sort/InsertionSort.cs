public class InsertionSort {
    public static int[] InsertionSort1(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int j = i;
            while(j > 0 && array[j] < array[j - 1]) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j--;
            }
        }
        return array;
    }

    public static int[] InsertionSort2(int[] array) {
         for(int i = array.length - 2; i >= 0; i--) {
            int j = i;
            while(j <= array.length - 2 && array[j] > array[j + 1]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j++;
            }
        }
        return array;
    }
}