# Question Link-> https://www.interviewbit.com/problems/merge-intervals/

```Java
import java.util.ArrayList;

public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<>();
        int n = intervals.size();
        int i = 0;

        // Add all intervals that end before the newInterval starts
        while (i < n && intervals.get(i).end < newInterval.start) {
            result.add(intervals.get(i));
            i++;
        }

        // Merge intervals that overlap with newInterval
        while (i < n && intervals.get(i).start <= newInterval.end) {
            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
            newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
            i++;
        }
        result.add(newInterval);

        // Add all remaining intervals
        while (i < n) {
            result.add(intervals.get(i));
            i++;
        }

        return result;
    }
}
```
