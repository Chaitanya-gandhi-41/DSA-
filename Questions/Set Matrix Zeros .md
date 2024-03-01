# Question Link-> https://www.interviewbit.com/problems/set-matrix-zeros/

````Java


import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int rows = a.size();
        int cols = a.get(0).size();

        // Arrays to store whether a row or column needs to be set to zero
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        // Iterate through the matrix and mark rows and columns to be set to zero
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (a.get(i).get(j) == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // Set rows to zero
        for (int i = 0; i < rows; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < cols; j++) {
                    a.get(i).set(j, 0);
                }
            }
        }

        // Set columns to zero
        for (int j = 0; j < cols; j++) {
            if (zeroCols[j]) {
                for (int i = 0; i < rows; i++) {
                    a.get(i).set(j, 0);
                }
            }
        }
    }

    // Example usage:
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<>();
        matrix1.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix1.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix1.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        new Solution().setZeroes(matrix1);
        System.out.println(matrix1); // Output: [[0, 0, 0], [1, 0, 1], [1, 0, 1]]

        ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<>();
        matrix2.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix2.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix2.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        new Solution().setZeroes(matrix2);
        System.out.println(matrix2); // Output: [[0, 0, 0], [1, 0, 1], [0, 0, 0]]
    }
}




````
