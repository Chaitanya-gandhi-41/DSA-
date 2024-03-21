# Question Link -> https://www.interviewbit.com/problems/next-permutation/

```Java

public class Solution {
    public int[] nextPermutation(int[] A) {
        int n = A.length;
        int k = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                k = i;
                break;
            }
        }

        if (k == -1) {
            reverse(A, 0, n - 1);
            return A;
        }

        int l = -1;
        for (int i = n - 1; i > k; i--) {
            if (A[i] > A[k]) {
                l = i;
                break;
            }
        }

        swap(A, k, l);
        reverse(A, k + 1, n - 1);

        return A;
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    private void reverse(int[] A, int start, int end) {
        while (start < end) {
            swap(A, start, end);
            start++;
            end--;
        }
    }
}
```
