# Question Link->https://www.interviewbit.com/problems/rain-water-trapped/

````Java
public class Solution {
    public int trap(final int[] A) {
        int n = A.length;
        if (n <= 2)
            return 0;

        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int waterTrapped = 0;

        while (left < right) {
            if (A[left] < A[right]) {
                if (A[left] >= leftMax) {
                    leftMax = A[left];
                } else {
                    waterTrapped += leftMax - A[left];
                }
                left++;
            } else {
                if (A[right] >= rightMax) {
                    rightMax = A[right];
                } else {
                    waterTrapped += rightMax - A[right];
                }
                right--;
            }
        }

        return waterTrapped;
    }
}
````
