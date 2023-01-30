import java.util.*;

public class SortedSquare {
  public static int[] sortedSquaredArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] *= array[i];
        }
        Arrays.sort(array);
        return array;
    }
}