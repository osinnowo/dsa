import java.util.*;

public class NonDuplicateArray {
    public static Integer[] nonDuplicateArray(Integer[] array) {
        Arrays.sort(array);
        List<Integer> results = new ArrayList<>();
        for(int i = 0; i < array.length; i++) {
            int distinctIndex = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j]) {
                    distinctIndex = j;
                }
            }
            results.add(array[distinctIndex]);
            i = distinctIndex;
        }
        return results.toArray(new Integer[0]);
    }
}
