### Question 

Problem Description
 
 

Given a string A, partition A such that every substring of the partition is a palindrome.

Return the minimum cuts needed for a palindrome partitioning of A.



Problem Constraints
1 <= length(A) <= 501



Input Format
The first and the only argument contains the string A.



Output Format
Return an integer, representing the minimum cuts needed.



Example Input
Input 1:

 A = "aba"
Input 2:

 A = "aab"


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 "aba" is already a palindrome, so no cuts are needed.
Explanation 2:

 Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.

### Question Link-> https://www.interviewbit.com/problems/palindrome-partitioning-ii/

## Code(JAVA)
````java
public class Solution {
    public int minCut(String A) {
        int n = A.length();
        
        // dp[i] represents the minimum cuts needed for palindrome partitioning of A[0...i]
        int[] dp = new int[n];
        
        // Initialize dp array with maximum possible cuts
        for (int i = 0; i < n; i++) {
            dp[i] = i;
        }
        
        // Check for palindrome substrings centered at each index
        for (int center = 0; center < n; center++) {
            expandAroundCenter(A, dp, center, center); // Odd length palindrome
            expandAroundCenter(A, dp, center, center + 1); // Even length palindrome
        }
        
        return dp[n - 1];
    }
    
    private void expandAroundCenter(String A, int[] dp, int left, int right) {
        int n = A.length();
        
        // Expand around the center and update the minimum cuts
        while (left >= 0 && right < n && A.charAt(left) == A.charAt(right)) {
            if (left == 0) {
                // If the substring A[0...right] is a palindrome, no cut is needed
                dp[right] = 0;
            } else {
                // Update the minimum cuts needed based on the palindrome substring
                dp[right] = Math.min(dp[right], dp[left - 1] + 1);
            }
            left--;
            right++;
        }
    }
}

```
