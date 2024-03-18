# Question Link -> https://www.interviewbit.com/problems/large-factorial/

```Java
import java.math.BigInteger;

public class Solution {
    public String solve(int A) {
        if (A == 0 || A == 1) {
            return "1";
        } else {
            return factorial(A).toString();
        }
    }

    // Helper method to calculate factorial recursively
    private BigInteger factorial(int A) {
        if (A == 0 || A == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(A).multiply(factorial(A - 1));
        }
    }
}
````
