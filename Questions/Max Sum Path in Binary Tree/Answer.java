/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left = null;
 *      right = null;
 *     }
 * }
 */
public class Solution {
    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode A) {
        findMaxSum(A);
        return maxSum;
    }

    private int findMaxSum(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // Recursively calculate the maximum path sum for the left and right subtrees
        int leftSum = Math.max(0, findMaxSum(node.left));
        int rightSum = Math.max(0, findMaxSum(node.right));

        // Update the maximum path sum considering the current node
        maxSum = Math.max(maxSum, leftSum + rightSum + node.val);

        // Return the maximum sum considering the current node and one of its subtrees
        return Math.max(leftSum, rightSum) + node.val;
    }
}
