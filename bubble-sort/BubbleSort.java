public class BubbleSort {
    public static int[] bubbleSort1(int[] array) {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            int index = 1;
            while(index < array.length) {
                if(array[index - 1] > array[index]) {
                    isSorted = false;
                    int temp = array[index - 1];
                    array[index - 1] = array[index];
                    array[index] = temp;
                }
                index++;
            }
        }
        return array;
    }

    public static int[] bubbleSort2(int[] array) {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            int index = 0;
            while(index < array.length - 1) {
                if(array[index] > array[index + 1]) {
                    isSorted = false;
                    int temp = array[index + 1];
                    array[index + 1] = array[index];
                    array[index] = temp;
                }
                index++;
            }
        }
        return array;
    }

    public static int[] bubbleSort3(int[] array) {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            int index = array.length - 1;
            while(index > 0) {
                if(array[index] < array[index - 1]) {
                    isSorted = false;
                    int temp = array[index - 1];
                    array[index - 1] = array[index];
                    array[index] = temp;
                }
                index--;
            }
        }
        return array;
    }
}
