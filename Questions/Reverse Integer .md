# Question Link -> https://www.interviewbit.com/problems/reverse-integer/

```Java
public class Solution {
    public int reverse(int A) {
        // Extract sign
        int sign = A < 0 ? -1 : 1;
        
        // Convert absolute value to string and reverse
        String reversedStr = new StringBuilder(String.valueOf(Math.abs((long)A))).reverse().toString();
        
        // Convert back to integer and apply sign
        long reversedInt = Long.parseLong(reversedStr) * sign;
        
        // Check for overflow
        if (reversedInt < Integer.MIN_VALUE || reversedInt > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)reversedInt;
        }
    }
}
````
