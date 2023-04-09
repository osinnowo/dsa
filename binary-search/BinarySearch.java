public class BinarySearch {
  public static int binarySearch(int[] array, int target) {
    return binarySearch(array, target, 0, array.length - 1);
  }
  public static int binarySearch(int[] array, int target, int left, int right) {
    if(left > right) { return - 1; }
    int middle  = (left + right) / 2;
    int potentialMatch = array[middle];
    if(target == potentialMatch) {
      return middle;
    } else if (target < potentialMatch) {
      return binarySearch(array, target, left, middle - 1);
    } else {
      return binarySearch(array, target, middle + 1, right);
    }
  }

  public static int binarySearchTwo(int[] array, int target) {
    return binarySearchTwo(array, target, 0, array.length - 1);
  }

  public static int binarySearchTwo(int[] array, int target, int start, int end) {
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
}