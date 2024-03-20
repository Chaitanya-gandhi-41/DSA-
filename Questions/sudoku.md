# question link ->https://interviewbit.com/problems/sudoku/

```Java
 import java.util.ArrayList;

public class Solution {
    public void solveSudoku(ArrayList<ArrayList<Character>> a) {
        if (a == null || a.size() == 0) {
            return;
        }
        solve(a);
    }

    private boolean solve(ArrayList<ArrayList<Character>> a) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (a.get(row).get(col) == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        if (isValid(a, row, col, num)) {
                            a.get(row).set(col, num);
                            if (solve(a)) {
                                return true;
                            } else {
                                a.get(row).set(col, '.');
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(ArrayList<ArrayList<Character>> a, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            if (a.get(row).get(i) == num || a.get(i).get(col) == num || a.get(3 * (row / 3) + i / 3).get(3 * (col / 3) + i % 3) == num) {
                return false;
            }
        }
        return true;
    }
}

````
