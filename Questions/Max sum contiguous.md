Question Link-> https://www.interviewbit.com/problems/max-sum-contiguous-subarray/

```Java

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int max_so_far = A[0];
        int max_ending_here = A[0];

        for (int i = 1; i < A.length; i++) {
            max_ending_here = Math.max(A[i], max_ending_here + A[i]);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }

        return max_so_far;
    }

    // Example usage:
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum contiguous sum is: " + solution.maxSubArray(arr));
    }
}

```
