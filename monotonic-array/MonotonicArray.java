public class MonotonicArray {
    public boolean isMonotonic(int[] array) {
        if(array.length == 0) return true;
        boolean isIncreasing = array[0] < array[array.length - 1];
        for(int index = 0; index < array.length - 1; index++) {
            if(isIncreasing && (array[index]) > array[index + 1]) return false;
            if(!isIncreasing && (array[index]) < array[index + 1]) return false;
        }
        return true;
    }
}
