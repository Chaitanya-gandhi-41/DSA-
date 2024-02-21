# Question Link-> https://www.interviewbit.com/problems/unique-binary-search-trees-ii/

```cpp

public class Solution {
    public int numTrees(int A) {
        if (A <= 1)
            return 1;
        
        int[] dp = new int[A + 1];
        dp[0] = 1;
        dp[1] = 1;
        
        for (int i = 2; i <= A; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        
        return dp[A];
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test the function with the given example
        int A = 3;
        System.out.println(solution.numTrees(A)); // Output: 5
    }
}

````
