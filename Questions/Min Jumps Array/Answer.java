public class Solution {
    public int jump(int[] A) {
        int n = A.length;

        // If there is only one element or the last index is already reachable
        if (n == 1 || A[0] >= n - 1) {
            return 0;
        }

        int jumps = 0;
        int currentPos = 0;

        while (currentPos < n - 1) {
            jumps++;

            int maxJump = 0;
            int maxJumpIndex = 0;

            // Iterate through possible jumps from the current position
            for (int i = 1; i <= A[currentPos]; i++) {
                if (currentPos + i >= n - 1) {
                    // If the jump takes us to or beyond the last index, return the total number of jumps
                    return jumps;
                }

                // Update the maximum jump and its index
                if (A[currentPos + i] + currentPos + i > maxJump) {
                    maxJump = A[currentPos + i] + currentPos + i;
                    maxJumpIndex = currentPos + i;
                }
            }

            // Update the current position to the end of the selected jump
            currentPos = maxJumpIndex;
        }

        return -1; // If it's not possible to reach the last index
    }
}
