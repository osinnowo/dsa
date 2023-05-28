import java.util.*;

class MeetingRoom {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // Sort intervals based on the start time
        
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i-1][1]) {
                // There is an overlap between the current interval and the previous one
                return false; // Return false, as the person cannot attend overlapping meetings
            }
        }
        
        return true; // No overlaps found, person can attend all meetings
    }
}
