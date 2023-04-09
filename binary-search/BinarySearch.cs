public class BinarySearch {
    
    public int BinarySearchOne(int[] array, int target) {
        return BinarySearchIterative(array, target, 0, array.Length - 1);
    }

    public int BinarySearchIterative(int[] array, int target, int start, int end) {
        while(start <= end) {
            int middle = (start + end) / 2;
            int potentialMatch = array[middle];
            if(target == potentialMatch) {
                return middle;
            } else if (target < potentialMatch) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }

    public int BinarySearchTwo(int[] array, int target) {
        return BinarySearchRecursive(array, target, 0, array.Length - 1);
    }

    public int BinarySearchRecursive(int[] array, int target, int start, int end) {
        if(start > end) { return -1; }
        int middle = (start + end) / 2;
        int potentialMatch = array[middle];
        if(target == potentialMatch) {
            return middle;
        } else if (target < potentialMatch) {
            return SearchRecursive(array, target, start, middle - 1);
        } else {
            return SearchRecursive(array, target, middle + 1, end);
        }
    } 
}