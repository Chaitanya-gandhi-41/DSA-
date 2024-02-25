# Question Link-> https://www.interviewbit.com/problems/rotate-matrix/

```Java

import java.util.ArrayList;

public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();
        
        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = a.get(i).get(j);
                a.get(i).set(j, a.get(j).get(i));
                a.get(j).set(i, temp);
            }
        }
        
        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
                int temp = a.get(i).get(start);
                a.get(i).set(start, a.get(i).get(end));
                a.get(i).set(end, temp);
                start++;
                end--;
            }
        }
    }

    // Test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(3);
        row2.add(4);
        matrix1.add(row1);
        matrix1.add(row2);
        
        System.out.println("Input Matrix 1:");
        for (ArrayList<Integer> row : matrix1) {
            System.out.println(row);
        }

        solution.rotate(matrix1);

        System.out.println("\nRotated Matrix 1:");
        for (ArrayList<Integer> row : matrix1) {
            System.out.println(row);
        }

        // Example 2
        ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<>();
        ArrayList<Integer> singleRow = new ArrayList<>();
        singleRow.add(1);
        matrix2.add(singleRow);
        
        System.out.println("\nInput Matrix 2:");
        for (ArrayList<Integer> row : matrix2) {
            System.out.println(row);
        }

        solution.rotate(matrix2);

        System.out.println("\nRotated Matrix 2:");
        for (ArrayList<Integer> row : matrix2) {
            System.out.println(row);
        }
    }
}

````
