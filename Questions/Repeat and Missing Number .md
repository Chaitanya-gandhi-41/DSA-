# Question Link -> https://www.interviewbit.com/problems/repeat-and-missing-number-array/

```Java
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int n = A.length;
        long xorResult = 0;

        // XOR of all elements from 1 to n
        for (int i = 1; i <= n; i++) {
            xorResult ^= i;
        }

        // XOR of all elements in the array
        for (int num : A) {
            xorResult ^= num;
        }

        // Find the rightmost set bit
        long rightmostSetBit = xorResult & ~(xorResult - 1);

        // Segregate elements based on the rightmost set bit
        long group1 = 0;
        long group2 = 0;
        for (int num : A) {
            if ((num & rightmostSetBit) != 0) {
                group1 ^= num;
            } else {
                group2 ^= num;
            }
        }
        for (int i = 1; i <= n; i++) {
            if ((i & rightmostSetBit) != 0) {
                group1 ^= i;
            } else {
                group2 ^= i;
            }
        }

        // Check which one is the duplicate and which one is missing
        for (int num : A) {
            if (num == group1) {
                return new int[]{(int) group1, (int) group2};
            }
        }
        return new int[]{(int) group2, (int) group1};
    }
}
````
