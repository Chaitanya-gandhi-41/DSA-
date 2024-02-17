## Question Link-> https://www.interviewbit.com/problems/find-duplicate-in-array/ 

```cpp
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int repeatedNumber(final int[] A) {
        int n = A.length; // Corrected syntax to get the length of array A

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // Starting j from i+1 to avoid unnecessary comparisons
                if (A[i] == A[j]) {
                    System.out.println(A[i]); // Corrected syntax to print the repeated number
                    return A[i]; // Returning the repeated number if found
                }
            }
        }

        return -1; // Returning -1 if no repeated number is found
    }
}

````
