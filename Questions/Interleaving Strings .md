Question link-> https://www.interviewbit.com/problems/interleaving-strings/

### JAVA
```Java
public class Solution {
    public int isInterleave(String A, String B, String C) {
        int lenA = A.length();
        int lenB = B.length();
        int lenC = C.length();

       
        if (lenA + lenB != lenC) {
            return 0;
        }

   
        boolean[][] dp = new boolean[lenA + 1][lenB + 1];
        dp[0][0] = true;
        for (int i = 1; i <= lenA; i++) {
            dp[i][0] = dp[i - 1][0] && A.charAt(i - 1) == C.charAt(i - 1);
        }

        for (int j = 1; j <= lenB; j++) {
            dp[0][j] = dp[0][j - 1] && B.charAt(j - 1) == C.charAt(j - 1);
        }
        for (int i = 1; i <= lenA; i++) {
            for (int j = 1; j <= lenB; j++) {
                dp[i][j] = (dp[i - 1][j] && A.charAt(i - 1) == C.charAt(i + j - 1))
                        || (dp[i][j - 1] && B.charAt(j - 1) == C.charAt(i + j - 1));
            }
        }
        return dp[lenA][lenB] ? 1 : 0;
    }
}


```
