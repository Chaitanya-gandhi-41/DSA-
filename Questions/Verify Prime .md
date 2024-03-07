# Question Link -> https://www.interviewbit.com/problems/verify-prime/

```Java
public class Solution {
    public int isPrime(int A) {
        if (A <= 1) {
            return 0; // Not prime
        } else if (A <= 3) {
            return 1; // Prime (2 and 3 are prime)
        } else if (A % 2 == 0 || A % 3 == 0) {
            return 0; // Not prime (divisible by 2 or 3)
        }
        
        int i = 5;
        while (i * i <= A) {
            if (A % i == 0 || A % (i + 2) == 0) {
                return 0; // Not prime
            }
            i += 6;
        }
        
        return 1; // Prime
    }
}

````
