# Question Link-> https://www.interviewbit.com/problems/n3-repeat-number/

```Java
import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {
        int n = a.size();
        // Initialize candidates and their counts
        int count1 = 0, count2 = 0;
        Integer candidate1 = null, candidate2 = null;

        // Count the occurrences of candidates
        for (int num : a) {
            if (candidate1 != null && candidate1 == num) {
                count1++;
            } else if (candidate2 != null && candidate2 == num) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Check if candidates occur more than N/3 times
        count1 = 0;
        count2 = 0;
        for (int num : a) {
            if (candidate1 != null && num == candidate1) {
                count1++;
            }
            if (candidate2 != null && num == candidate2) {
                count2++;
            }
        }

        if (count1 > n / 3) {
            return candidate1;
        } else if (count2 > n / 3) {
            return candidate2;
        } else {
            return -1;
        }
    }
}
````
