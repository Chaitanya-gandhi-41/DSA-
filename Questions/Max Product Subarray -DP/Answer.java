public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProduct(final int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        int maxProduct = A[0];
        int minProduct = A[0];
        int result = maxProduct;

        for (int i = 1; i < A.length; i++) {
            if (A[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(A[i], maxProduct * A[i]);
            minProduct = Math.min(A[i], minProduct * A[i]);

            result = Math.max(result, maxProduct);
        }

        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] inputArray = {2, 3, -2, 4};
        int result = solution.maxProduct(inputArray);
        System.out.println(result);
    }
}
