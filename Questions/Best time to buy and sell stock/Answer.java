public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        int minPrice = A[0];
        int maxProfit = 0;

        for (int i = 1; i < A.length; i++) {
            maxProfit = Math.max(maxProfit, A[i] - minPrice);
            minPrice = Math.min(minPrice, A[i]);
        }

        return maxProfit;
    }

    // Example Usage:
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A1 = {1, 2};
        int[] A2 = {1, 4, 5, 2, 4};

        System.out.println(solution.maxProfit(A1));  // Output: 1
        System.out.println(solution.maxProfit(A2));  // Output: 4
    }
}
