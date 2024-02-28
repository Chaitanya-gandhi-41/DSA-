# Question -> https://www.interviewbit.com/problems/spiral-order-matrix-i/

```Java

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] spiralOrder(final int[][] A) {
        if (A == null || A.length == 0) {
            return new int[0];
        }
        
        int m = A.length;
        int n = A[0].length;
        int[] result = new int[m * n];
        
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        int index = 0;
        
        while (top <= bottom && left <= right) {
            // Traverse top row
            for (int i = left; i <= right; i++) {
                result[index++] = A[top][i];
            }
            top++;
            
            // Traverse right column
            for (int i = top; i <= bottom; i++) {
                result[index++] = A[i][right];
            }
            right--;
            
            // Traverse bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[index++] = A[bottom][i];
                }
                bottom--;
            }
            
            // Traverse left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[index++] = A[i][left];
                }
                left++;
            }
        }
        
        return result;
    }
}
```
