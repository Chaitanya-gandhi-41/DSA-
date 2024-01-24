**QUESTION**

Given two strings A and B, find the minimum number of steps required to convert A to B. (each operation is counted as 1 step.)

You have the following 3 operations permitted on a word:

Insert a character
Delete a character
Replace a character


Input Format:

The first argument of input contains a string, A.
The second argument of input contains a string, B.
Output Format:

Return an integer, representing the minimum number of steps required.
Constraints:

1 <= length(A), length(B) <= 450
Examples:

Input 1:
    A = "abad"
    B = "abac"

Output 1:
    1

Explanation 1:
    Operation 1: Replace d with c.

Input 2:
    A = "Anshuman"
    B = "Antihuman"

Output 2:
    2

Explanation 2:
    => Operation 1: Replace s with t.
    => Operation 2: Insert i.

Question link-> https://www.interviewbit.com/problems/edit-distance/


````java
public class Solution {
    public int minDistance(String A, String B) {
        int m = A.length();
        int n = B.length();

        // Create a 2D array to store the minimum steps
        int[][] dp = new int[m + 1][n + 1];

        // Initialize the first row and column
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        // Fill the dp array using the three possible operations
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j],          // Delete
                                           Math.min(dp[i][j - 1],  // Insert
                                                    dp[i - 1][j - 1])); // Replace
                }
            }
        }

        // Return the minimum steps required
        return dp[m][n];
    }

    // Example usage:
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String A1 = "abad";
        String B1 = "abac";
        System.out.println(solution.minDistance(A1, B1));  // Output: 1

        String A2 = "Anshuman";
        String B2 = "Antihuman";
        System.out.println(solution.minDistance(A2, B2));  // Output: 2
    }
}


````
