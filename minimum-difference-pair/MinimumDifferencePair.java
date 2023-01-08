import java.util.*;

public class MinimumDifferencePair {
    public static List<Integer[]> minimumDifferencePair(Integer[] array) {
        Arrays.sort(array);
        int minimumDifference = array[1] - array[0];
        List<Integer[]> results = new ArrayList<>();
        for(int i = 2; i < array.length; i++) {
            minimumDifference = Math.min(minimumDifference, array[i] - array[i - 1]);
        }
        for(int i = 1; i < array.length; i++) {
            if((array[i] - array[i - 1]) == minimumDifference) {
                results.add(new Integer[] { array[i - 1], array[i] });
            }
        }
        return results;
    }
}
