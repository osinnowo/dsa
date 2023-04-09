public class BinarySearch {
  public static int binarySearchOne(int[] array, int target) {
    return binarySearchIterative(array, target, 0, array.length - 1);
  }

  public static int binarySearchIterative(int[] array, int target, int start, int end) {
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

  public static int binarySearchTwo(int[] array, int target) {
    return binarySearchRecursive(array, target, 0, array.length - 1);
  }
  
  public static int binarySearchRecursive(int[] array, int target, int left, int right) {
    if(left > right) { return - 1; }
    int middle  = (left + right) / 2;
    int potentialMatch = array[middle];
    if(target == potentialMatch) {
      return middle;
    } else if (target < potentialMatch) {
      return binarySearchRecursive(array, target, left, middle - 1);
    } else {
      return binarySearchRecursive(array, target, middle + 1, right);
    }
  }
}