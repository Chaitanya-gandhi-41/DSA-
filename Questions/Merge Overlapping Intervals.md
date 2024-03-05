# Question Link -> https://www.interviewbit.com/problems/merge-overlapping-intervals/

```Java

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }
        
        // Sort intervals based on start times
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval a, Interval b) {
                return Integer.compare(a.start, b.start);
            }
        });
        
        ArrayList<Interval> merged = new ArrayList<>();
        Interval prev = intervals.get(0);
        
        for (int i = 1; i < intervals.size(); i++) {
            Interval curr = intervals.get(i);
            if (prev.end >= curr.start) { // Overlapping intervals
                prev.end = Math.max(prev.end, curr.end);
            } else { // Non-overlapping intervals
                merged.add(prev);
                prev = curr;
            }
        }
        
        merged.add(prev); // Add the last merged interval
        
        return merged;
    }
}

````
