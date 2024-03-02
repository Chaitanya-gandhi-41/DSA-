 # Question Link-> https://www.interviewbit.com/problems/add-one-to-number/

 ```Java

public class Solution {
    public int[] plusOne(int[] A) {
        int n = A.length;
        int carry = 1;  // Initially, we want to add 1 to the number
        for (int i = n - 1; i >= 0; i--) {  // Traverse from right to left
            int sumDigit = A[i] + carry;
            A[i] = sumDigit % 10;  // Update the digit
            carry = sumDigit / 10;  // Calculate carry for the next digit
        }
        if (carry != 0) {
            // If there's still a carry, create a new array with an additional element
            int[] result = new int[n + 1];
            result[0] = carry;
            // Copy the original array to the new array
            System.arraycopy(A, 0, result, 1, n);
            return result;
        } else {
            // Remove leading zeros if any
            int i = 0;
            while (i < n && A[i] == 0) {
                i++;
            }
            if (i == n) {
                // If all digits are 0, return a single-element array [1]
                return new int[]{1};
            } else {
                // Otherwise, return the array with leading zeros removed
                return Arrays.copyOfRange(A, i, n);
            }
        }
    }
}
```
