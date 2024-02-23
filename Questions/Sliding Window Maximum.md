# Question Link-> https://www.interviewbit.com/problems/sliding-window-maximum/

```Java
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int[] slidingMaximum(final int[] A, int B) {
        if (B > A.length) {
            int max = Integer.MIN_VALUE;
            for (int num : A) {
                max = Math.max(max, num);
            }
            return new int[]{max};
        }

        int[] result = new int[A.length - B + 1];
        Deque<Integer> window = new ArrayDeque<>();

        // Populate the deque with the first window
        for (int i = 0; i < B; i++) {
            while (!window.isEmpty() && A[i] >= A[window.peekLast()]) {
                window.removeLast();
            }
            window.addLast(i);
        }

        // Process the rest of the array
        for (int i = B; i < A.length; i++) {
            result[i - B] = A[window.peekFirst()];

            // Remove elements outside of the current window
            while (!window.isEmpty() && window.peekFirst() <= i - B) {
                window.removeFirst();
            }

            // Remove smaller elements from the end of the deque
            while (!window.isEmpty() && A[i] >= A[window.peekLast()]) {
                window.removeLast();
            }

            window.addLast(i);
        }

        // Add the maximum of the last window
        result[A.length - B] = A[window.peekFirst()];

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {1, 3, -1, -3, 5, 3, 6, 7};
        int B = 3;
        int[] result = solution.slidingMaximum(A, B);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 3 3 5 5 6 7
    }
}
```
