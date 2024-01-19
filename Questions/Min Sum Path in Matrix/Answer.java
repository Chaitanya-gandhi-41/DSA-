public class Solution {
    public int minPathSum(int[][] A) {
        if (A == null || A.length == 0 || A[0].length == 0) {
            return 0;
        }

        int m = A.length;
        int n = A[0].length;

        // Create a 2D array to store the minimum path sums
        int[][] dp = new int[m][n];

        // Initialize the top-left corner
        dp[0][0] = A[0][0];

        // Initialize the first row
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + A[i][0];
        }

        // Initialize the first column
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + A[0][j];
        }

        // Fill in the rest of the dp array
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = A[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        // The bottom-right element contains the minimum path sum
        return dp[m - 1][n - 1];
    }
}
