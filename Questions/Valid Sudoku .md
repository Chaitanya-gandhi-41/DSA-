# Question Link -> https://www.interviewbit.com/problems/valid-sudoku/

```Java
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int isValidSudoku(final String[] A) {
        // Check rows
        for (int i = 0; i < 9; i++) {
            if (!isValidUnit(A[i].toCharArray())) {
                return 0;
            }
        }
        
        // Check columns
        for (int j = 0; j < 9; j++) {
            char[] column = new char[9];
            for (int i = 0; i < 9; i++) {
                column[i] = A[i].charAt(j);
            }
            if (!isValidUnit(column)) {
                return 0;
            }
        }
        
        // Check 3x3 subgrids
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                char[] subgrid = new char[9];
                int index = 0;
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        subgrid[index++] = A[x].charAt(y);
                    }
                }
                if (!isValidUnit(subgrid)) {
                    return 0;
                }
            }
        }
        
        return 1;
    }
    
    private boolean isValidUnit(char[] unit) {
        Set<Character> seen = new HashSet<>();
        for (char cell : unit) {
            if (cell != '.') {
                if (seen.contains(cell)) {
                    return false;
                }
                seen.add(cell);
            }
        }
        return true;
    }
}
````
