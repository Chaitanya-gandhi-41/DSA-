# Question Link -> https://www.interviewbit.com/problems/all-factors/

````Java

import java.util.ArrayList;

public class Solution {
    public int[] allFactors(int A) {
        ArrayList<Integer> factors = new ArrayList<>();
        
        for (int i = 1; i <= Math.sqrt(A); i++) {
            if (A % i == 0) {
                factors.add(i);
                if (i != A / i) {
                    factors.add(A / i);
                }
            }
        }
        
        int[] result = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            result[i] = factors.get(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int A = 6;
        int[] factors = solution.allFactors(A);
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        // Output: 1 2 3 6
    }
}
````
