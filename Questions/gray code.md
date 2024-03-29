# Question Link -> https://www.interviewbit.com/problems/gray-code/

```java

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> grayCode(int A) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0); // Add initial value 0
        
        for (int i = 1; i < Math.pow(2, A); i++) {
            int grayCode = i ^ (i >> 1); // Compute Gray code value
            result.add(grayCode); // Add Gray code value to the result list
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // Test cases
        System.out.println(solution.grayCode(2)); // Output: [0, 1, 3, 2]
        System.out.println(solution.grayCode(1)); // Output: [0, 1]
    }
}
````
