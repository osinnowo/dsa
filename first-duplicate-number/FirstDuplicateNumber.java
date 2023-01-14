import java.util.*;

public class FirstDuplicateNumber {
    public static int firstDuplicateNumber1(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            int current = map.getOrDefault(array[i], 0);
            if(current == 1) { return array[i]; }
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        return -1;
    }

    public static int firstDuplicateNumber2(int[] array) {
        Set<Integer> set = new HashSet<>();
        for(int arr: array) {
            if(set.contains(arr)) { return arr; }
            set.add(arr);
        }
        return -1;
    }
}
