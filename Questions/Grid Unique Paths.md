# Question Link -> https://www.interviewbit.com/problems/grid-unique-paths/

```Java

public class Solution {
    public int uniquePaths(int A, int B) {
        // Initialize a 2D grid to store the number of paths to each cell
        int[][] grid = new int[A][B];
        
        // Fill the first row and first column with 1 since there is only one way to reach those cells
        for (int i = 0; i < A; i++) {
            grid[i][0] = 1;
        }
        for (int j = 0; j < B; j++) {
            grid[0][j] = 1;
        }
        
        // Fill the rest of the grid using dynamic programming
        for (int i = 1; i < A; i++) {
            for (int j = 1; j < B; j++) {
                grid[i][j] = grid[i-1][j] + grid[i][j-1];
            }
        }
        
        // The bottom-right corner contains the total number of unique paths
        return grid[A-1][B-1];
    }
}

````
