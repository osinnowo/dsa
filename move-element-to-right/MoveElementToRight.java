public class MoveElementToRight {
    public static int[] moveElementToRight1(int[] array, int elementToMove) {
        int left = 0;
        int right = array.length - 1;
        while(left < right) {
            if(array[left] != elementToMove) { left++; continue; }
            while(left < right) {
                if(array[right] != elementToMove) {
                    int temp = array[left];
                    array[left] = array[right];
                    array[right] = temp;
                    left++;
                    right--;
                    break;
                }
                right--;
            }
        }
        return array;
    }

    public static int[] moveElementToRight2(int[] array, int elementToMove) {
        int left = 0;
        int right = array.length - 1;
        while(left < right) {
            while(left < right && array[left] != elementToMove) { left++; }
            while(left < right && array[right] == elementToMove) { right--; }
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++; right--;
        }
        return array;
    }
}
