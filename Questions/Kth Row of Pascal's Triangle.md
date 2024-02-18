## Question Link ->  https://www.interviewbit.com/problems/kth-row-of-pascals-triangle/

```Java
public class Solution {
    public int[] getRow(int A) {
        int[] result = new int[A + 1];
        
        result[0] = 1;
        
        for (int i = 1; i <= A; i++) {
            for (int j = i; j > 0; j--) {
                result[j] += result[j - 1];
            }
        }
        
        return result;
    }
}


````
