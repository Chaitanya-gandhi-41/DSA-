# Question Link ->https://www.interviewbit.com/problems/window-string/

````java
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String minWindow(String A, String B) {
        if (A == null || B == null || A.length() == 0 || B.length() == 0 || A.length() < B.length())
            return "";

        // Count characters in B
        Map<Character, Integer> targetCounts = new HashMap<>();
        for (char c : B.toCharArray()) {
            targetCounts.put(c, targetCounts.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int minWindowStart = 0, minWindowLength = Integer.MAX_VALUE;
        int found = 0;

        while (right < A.length()) {
            char currentChar = A.charAt(right);
            if (targetCounts.containsKey(currentChar)) {
                if (targetCounts.get(currentChar) > 0)
                    found++;
                targetCounts.put(currentChar, targetCounts.get(currentChar) - 1);
            }

            while (found == B.length()) {
                if (right - left + 1 < minWindowLength) {
                    minWindowLength = right - left + 1;
                    minWindowStart = left;
                }

                char leftChar = A.charAt(left);
                if (targetCounts.containsKey(leftChar)) {
                    targetCounts.put(leftChar, targetCounts.get(leftChar) + 1);
                    if (targetCounts.get(leftChar) > 0)
                        found--;
                }

                left++;
            }

            right++;
        }

        if (minWindowLength == Integer.MAX_VALUE)
            return "";

        return A.substring(minWindowStart, minWindowStart + minWindowLength);
    }
}
````
  
