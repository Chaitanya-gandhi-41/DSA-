public class Solution {
    public int jump(int[] A) {
        int n = A.length;
        
        if (n == 1) {
            return 0; // Already at the last index
        }
        
        int jumps = 0;
        int currentEnd = 0; // The current end of the reachable range
        int farthest = 0;   // The farthest index we can reach
        
        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + A[i]);
            
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
                
                if (currentEnd >= n - 1) {
                    break; // Reached the last index
                }
            }
        }
        
        return (currentEnd >= n - 1) ? jumps : -1;
    }
}
