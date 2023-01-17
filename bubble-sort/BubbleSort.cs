public class BubbleSort {
    public static int[] BubbleSort1(int[] array) {
        bool isSorted = false;
        while(!isSorted) {
            isSorted = true;
            int index = 1;
            while(index < array.Length) {
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

    public static int[] BubbleSort2(int[] array) {
        bool isSorted = false;
        while(!isSorted) {
            isSorted = true;
            int index = 0;
            while(index < array.Length - 1) {
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

     public static int[] BubbleSort3(int[] array) {
        bool isSorted = false;
        while(!isSorted) {
            isSorted = true;
            int index = array.Length - 1;
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

