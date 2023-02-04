using System;

public class MergeOverlappingInterval{
     public readonly int START_TIME = 0;
    public readonly int END_TIME = 1;
	public int[][] MergeOverlappingIntervals(int[][] intervals) {
        Array.Sort(intervals, (a, b) => a[0] - b[0]);
		List<int[]> overlaps = new List<int[]>();
        overlaps.Add(intervals[0]);
        for(int index = 1; index < intervals.Length; index++){
            int lastIndex = overlaps.Count - 1;
            int[] previous = overlaps[lastIndex];
            int[] current = intervals[index];
            bool isOverLap = previous[END_TIME] >= current[START_TIME];
            if(isOverLap){
                previous[END_TIME] = Math.Max(previous[END_TIME], current[END_TIME]);
                overlaps[lastIndex] = previous;
                continue;
            }
            overlaps.Add(current);
        }
		return overlaps.ToArray();
	}
}