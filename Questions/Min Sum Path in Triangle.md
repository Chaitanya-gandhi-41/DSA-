Question Link->   https://www.interviewbit.com/problems/min-sum-path-in-triangle/

### JAVA

````java
import java.util.ArrayList;

public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();
        
        // Convert ArrayList<ArrayList<Integer>> to 2D array for easier access
        int[][] dp = new int[n][n];
        
        // Copy the last row of the triangle to dp
        for (int i = 0; i < n; i++) {
            dp[n - 1][i] = a.get(n - 1).get(i);
        }
        
        // Iterate from the second last row to the first row
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                // Update each element to be the sum of itself and the minimum of its two adjacent elements in the row below it
                dp[i][j] = a.get(i).get(j) + Math.min(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }
        
        // The value at dp[0][0] will be the minimum path sum
        return dp[0][0];
    }
}

````
