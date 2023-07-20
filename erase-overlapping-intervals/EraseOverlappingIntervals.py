from typing import List

class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        # Sort the intervals by their end points (in ascending order)
        intervals.sort(key=lambda x: x[1])
        
        count = 0  # Initialize the count of overlapping intervals
        last_end = float('-inf')  # Initialize the end point of the last processed interval
        
        for start, end in intervals:
            if start >= last_end:
                # If the current interval doesn't overlap with the last one, update last_end
                last_end = end
            else:
                # If the current interval overlaps with the last one, increment count
                count += 1
        
        return count
