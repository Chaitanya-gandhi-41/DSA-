public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {
        if (A == null || A.length < 2) {
            return 0;
        }

        int n = A.length;
        int maxTransactions = 2;
        int[][] dp = new int[maxTransactions + 1][n];

        for (int i = 1; i <= maxTransactions; i++) {
            int maxDiff = Integer.MIN_VALUE;

            for (int j = 1; j < n; j++) {
                maxDiff = Math.max(maxDiff, dp[i - 1][j - 1] - A[j - 1]);
                dp[i][j] = Math.max(dp[i][j - 1], A[j] + maxDiff);
            }
        }

        return dp[maxTransactions][n - 1];
    }
}
