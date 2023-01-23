public class MonotonicArray {
    public bool IsMonotonic(int[] array) {
        if(array.Length == 0) return true;
        bool isIncreasing = array[0] < array[array.Length - 1];
        for(int index = 0; index < array.Length - 1; index++) {
            if(isIncreasing && (array[index] > array[index + 1])) return false;
            if(!isIncreasing && (array[index] < array[index + 1])) return false;
        }
        return true;
    }
}