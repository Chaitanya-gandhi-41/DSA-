### Question -> Word Break

Question link ->https://www.interviewbit.com/problems/word-break/

## MY APPROACH

Set Optimization: Use a set to store both the words and their lengths from the dictionary for faster lookup.

Dynamic Programming Array: Create a boolean array dp to store whether the substring from 0 to i can be segmented.

Length-based Iteration: Iterate through the possible lengths of words in the dictionary and check if the substring of that length can be segmented using dynamic programming.

Final Result: Return 1 if the last element of the dynamic programming array is true, indicating that the entire string can be segmented; otherwise, return 0.

## BRUTE-FORCE APPROACH

## (C++)

```c++



public class Solution {
    public int wordBreak(String A, String[] B) {
        int n = A.length();
       
        Set<String> wordSet = new HashSet<>();
        for (String word : B) {
            wordSet.add(word);
        }
        
   
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;  
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
        
                if (dp[j] && wordSet.contains(A.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        
        
        return dp[n] ? 1 : 0;
    }
}

````


## OPTIMAL APPROACH

## (C++)

```cpp
public class Solution {
    public int wordBreak(String A, String[] B) {
        int n = A.length();
        
        // Create a set for faster word and length lookup
        Set<String> wordSet = new HashSet<>();
        Set<Integer> wordLengths = new HashSet<>();
        for (String word : B) {
            wordSet.add(word);
            wordLengths.add(word.length());
        }
        
        // Create a boolean array to store if the substring from 0 to i can be segmented
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;  // An empty string is always valid
        
        for (int i = 1; i <= n; i++) {
            for (int len : wordLengths) {
                if (i >= len && dp[i - len] && wordSet.contains(A.substring(i - len, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        
        // Return 1 if the whole string can be segmented, 0 otherwise
        return dp[n] ? 1 : 0;
    }
```
