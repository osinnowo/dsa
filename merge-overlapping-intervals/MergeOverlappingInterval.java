import java.util.*;

public class MergeOverlappingInterval {
    public int[][] mergeOverlappingIntervals2(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        final int START_TIME = 0;
        final int END_TIME = 1;
        List<int[]> result = new ArrayList<>(); result.add(intervals[0]);
        for(int i = 1; i < intervals.length; i++) {
            int lastIntervalIndex = result.size() - 1;
            int[] current = intervals[i];
            int[] previous = result.get(lastIntervalIndex);

            boolean isOverlap = previous[END_TIME] >= current[START_TIME];
            if(isOverlap) {
                previous[END_TIME] = Math.max(current[END_TIME], previous[END_TIME]);
                result.set(lastIntervalIndex, previous);
                continue;
            }
            result.add(current);
        }
        return result.toArray(new int[result.size()][]);
    }
}