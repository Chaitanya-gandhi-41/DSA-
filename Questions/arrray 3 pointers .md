# Question link-> https://www.interviewbit.com/problems/array-3-pointers/

```Java
import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int minimize(final List<Integer> A, final List<Integer> B, final List<Integer> C) {
        int i = 0, j = 0, k = 0;
        int minMaxDiff = Integer.MAX_VALUE;

        while (i < A.size() && j < B.size() && k < C.size()) {
            int maxVal = Math.max(Math.abs(A.get(i) - B.get(j)), Math.max(Math.abs(B.get(j) - C.get(k)), Math.abs(C.get(k) - A.get(i))));
            minMaxDiff = Math.min(minMaxDiff, maxVal);

            // Move the pointer of the list with the smallest element
            if (A.get(i) <= B.get(j) && A.get(i) <= C.get(k)) {
                i++;
            } else if (B.get(j) <= A.get(i) && B.get(j) <= C.get(k)) {
                j++;
            } else {
                k++;
            }
        }

        return minMaxDiff;
    }
}
```
