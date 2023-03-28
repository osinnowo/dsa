import java.util.*;

class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        int[] result = new int[arr1.length];
        int i = 0;
        
        for (int num : arr2) {
            int freq = freqMap.get(num);
            for (int j = 0; j < freq; j++) {
                result[i++] = num;
            }
            freqMap.remove(num);
        }
        
        List<Integer> remaining = new ArrayList<>(freqMap.keySet());
        Collections.sort(remaining);
        for (int num : remaining) {
            int freq = freqMap.get(num);
            for (int j = 0; j < freq; j++) {
                result[i++] = num;
            }
        }
        return result;
    }
}