import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
      for(int i = 0; i < array.length; i++) {
        for(int j = 0; j < array.length; j++) {
          if(j == i) continue;
          int sum = array[i] + array[j];
          if(sum == targetSum) { return new int[] { array[i], array[j] } ; }
        }
      }
      return new int[0];
  }

  public static int[] twoNumberSum(int[] array, int targetSum) {
      for(int i = 0; i < array.length; i++) {
        for(int j = i + 1; j < array.length; j++) {
          int sum = array[i] + array[j];
          if(sum == targetSum) {
            return new int[] { array[i], array[j] };
          }
        }
      }
    return new int[] {};
  }

  public static int[] twoNumberSum(int[] array, int targetSum) {
    Set<Integer> set = new HashSet<Integer>();
    int index = 0;
    while(index < array.length) {
      int num = targetSum - array[index];
      if(set.contains(num)) { return new int[] { array[index], num }; }
      set.add(array[index]);
      index++;
    }
    return new int[0];
  }

  public static int[] twoNumberSum(int[] array, int targetSum) {
    Map<Integer, Integer> map = new HashMap<>();
    int index = 0;
    while(index < array.length) {
      int num = targetSum - array[index];
      if(map.containsKey(num)) { return new int[] { num, array[index] }; }
      map.put(array[index], num);
      index++;
    }
    return new int[0];
  }

  public static int[] twoNumberSum(int[] array, int targetSum) {
    Arrays.sort(array);
    int left = 0;
    int right = array.length - 1;
    while(left < right){
      int sum  = array[left] + array[right];
      if(sum == targetSum) {
        return new int[] { array[left], array[right] } ;
      } else if (sum < targetSum) {
        left++;
      } else {
        right--;
      }
    }
    return new int[]{};
  }
}