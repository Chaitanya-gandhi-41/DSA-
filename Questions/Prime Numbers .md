# Question Link -> https://www.interviewbit.com/problems/prime-numbers/

```Java
public class Solution {
    public int[] sieve(int A) {
        boolean[] isPrime = new boolean[A + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= A; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= A; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count the number of primes
        int count = 0;
        for (int i = 2; i <= A; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        // Create an array to store the primes
        int[] primes = new int[count];
        int index = 0;
        for (int i = 2; i <= A; i++) {
            if (isPrime[i]) {
                primes[index++] = i;
            }
        }

        return primes;
    }
}
```
