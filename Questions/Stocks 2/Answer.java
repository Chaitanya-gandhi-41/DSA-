public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {
        int n = A.length;
        if (n <= 1) {
            return 0;
        }

        int totalProfit = 0;
        for (int i = 1; i < n; i++) {
            if (A[i] > A[i - 1]) {
                totalProfit += A[i] - A[i - 1];
            }
        }

        return totalProfit;
    }

    // Example usage:
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] A1 = {1, 2, 3};
        int[] A2 = {5, 2, 10};

        System.out.println(solution.maxProfit(A1));  // Output: 2
        System.out.println(solution.maxProfit(A2));  // Output: 8
    }
}
