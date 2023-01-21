public class ThreeNumberSort {
    public int[] threeNumberSort1(int[] array, int[] order) {
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

    public int[] threeNumberSort2(int[] array, int[] order) {
        int right = array.length - 1;
        for(int i = order.length - 1; i >= 0; i--){
            int left = 0;
            while(left < right) {
                if(array[right] == order[i]) { right--; continue; }
                while(left < right) {
                    if(array[left] == order[i]) {
                        int temp = array[left];
                        array[left] = array[right];
                        array[right] = temp;
                        right--; break;
                    }
                    left++;
                }
            }
        }
        return array;
    }
}
