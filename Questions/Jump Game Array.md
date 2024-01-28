### Question link -> https://www.interviewbit.com/problems/jump-game-array/

## (C++)

```c++


public class Solution {
    public int canJump(int[] A) {
        int n = A.length;
        int maxReachable = 0;

        for (int i = 0; i < n; i++) {
            if (i > maxReachable) {
                // If the current index is not reachable, return 0
                return 0;
            }

            // Update the maximum reachable position
            maxReachable = Math.max(maxReachable, i + A[i]);

            // If the last index is reachable, return 1
            if (maxReachable >= n - 1) {
                return 1;
            }
        }

        // If the loop completes without reaching the last index, return 0
        return 0;
    }

    // Example usage:
    public static void main(String[] args) {
        int[] A1 = {2, 3, 1, 1, 4};
        int[] A2 = {3, 2, 1, 0, 4};

        Solution solution = new Solution();
        int result1 = solution.canJump(A1);
        int result2 = solution.canJump(A2);

        // Print the results
        System.out.println("Result 1: " + result1); // Output: 1
        System.out.println("Result 2: " + result2); // Output: 0
    }
}
```
