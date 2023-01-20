public class ThreeNumberSort {
    public int[] threeNumberSort(int[] array, int[] order) {
        int left = 0;
        for(int num : order) {
            int right = array.length - 1;
            while(left < right) {
                if(num == array[left]) { left++; continue; }
                while(right > left) {
                    if(array[right] == num) {
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
}
