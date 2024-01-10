public class Solution {
    public int numDistinct(String A, String B) {
        int m = A.length();
        int n = B.length();

        
        int[][] dp = new int[m + 1][n + 1];

   
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }

    
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String A1 = "abc";
        String B1 = "abc";
        System.out.println(solution.numDistinct(A1, B1)); // Output: 1

        String A2 = "rabbbit";
        String B2 = "rabbit";
        System.out.println(solution.numDistinct(A2, B2)); // Output: 3
    }
}
