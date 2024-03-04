# Question Link -> https://www.interviewbit.com/problems/first-missing-integer/

```Java

public class Solution {
    public int firstMissingPositive(int[] A) {
        int n = A.length;

        // Rearrange the array: Place each positive integer at its correct position
        for (int i = 0; i < n; i++) {
            while (A[i] >= 1 && A[i] <= n && A[A[i] - 1] != A[i]) {
                int temp = A[A[i] - 1];
                A[A[i] - 1] = A[i];
                A[i] = temp;
            }
        }

        // Find the first missing positive integer
        for (int i = 0; i < n; i++) {
            if (A[i] != i + 1) {
                return i + 1;
            }
        }

        // If all positive integers are present, return the next positive integer
        return n + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] arr1 = {1, 2, 0};
        System.out.println(solution.firstMissingPositive(arr1)); // Output: 3

        int[] arr2 = {3, 4, -1, 1};
        System.out.println(solution.firstMissingPositive(arr2)); // Output: 2

        int[] arr3 = {-8, -7, -6};
        System.out.println(solution.firstMissingPositive(arr3)); // Output: 1
    }
}
```
