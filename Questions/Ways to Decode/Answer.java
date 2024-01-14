public class Solution {
    public int numDecodings(String A) {
        final int MOD = 1000000007;

        int n = A.length();

       
        long[] dp = new long[n + 1];
        dp[0] = 1; 

        for (int i = 1; i <= n; i++) {
            
            if (A.charAt(i - 1) != '0') {
                dp[i] = dp[i - 1];
            }
            if (i > 1 && A.substring(i - 2, i).compareTo("10") >= 0 && A.substring(i - 2, i).compareTo("26") <= 0) {
                dp[i] = (dp[i] + dp[i - 2]) % MOD;
            }
        }

        return (int) (dp[n] % MOD);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numDecodings("8"));  
        System.out.println(solution.numDecodings("12")); 
    }
}
