### REGULAR EXPRESSION II

### QUESTION LINK->https://www.interviewbit.com/problems/regular-expression-ii/

## Approach used 


-Initialize DP Table: 
Create a 2D DP table dp with dimensions (len(A) + 1) x (len(B) + 1) to represent whether the first i characters of string A match the first j characters of string B.

-Base Cases:

-Set dp[0][0] to 1 since an empty pattern matches an empty string.
For the first row (i=0), handle cases where '*' in pattern matches zero characters by updating dp[0][j] based on dp[0][j-2].
Fill DP Table:

Iterate through each character in A and B using nested loops.
If the current characters match or if the pattern includes '*', update the table based on the matching conditions.
Final Result:

The result is stored in dp[len(A)][len(B)], indicating whether the entire strings A and B match.
Return Result:

Return dp[len(A)][len(B)] as the final result (0 for false, 1 for true).
Time Complexity:

The time complexity of the solution is O(len(A) * len(B)), as the DP table is filled in a nested loop.


## C++

```C++
int Solution::isMatch(const string A, const string B) {
    int m = A.length();
    int n = B.length();
    vector<vector<int>> dp(m + 1, vector<int>(n + 1, 0));
    dp[0][0] = 1;

    for (int j = 1; j <= n; j++) {
        if (B[j - 1] == '*') {
            dp[0][j] = dp[0][j - 2];
        }
    }
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (B[j - 1] == A[i - 1] || B[j - 1] == '.') {
                dp[i][j] = dp[i - 1][j - 1];
            } else if (B[j - 1] == '*') {
                dp[i][j] = dp[i][j - 2] || (dp[i - 1][j] && (A[i - 1] == B[j - 2] || B[j - 2] == '.'));
            }
        }
    }
    return dp[m][n];
}
```
