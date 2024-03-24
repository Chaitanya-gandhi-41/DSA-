# Question Link -> https://www.interviewbit.com/problems/all-unique-permutations/

```Java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] permute(int[] A) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(A); // Sort the array to handle duplicates easily
        backtrack(result, new ArrayList<>(), A, new boolean[A.length]);
        
        int[][] resArray = new int[result.size()][A.length];
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < A.length; j++) {
                resArray[i][j] = result.get(i).get(j);
            }
        }
        
        return resArray;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] used) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue; // Skip if element is already used or it's a duplicate not in current permutation
            }
            used[i] = true;
            tempList.add(nums[i]);
            backtrack(result, tempList, nums, used);
            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }

    // Example usage:
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A1 = {1, 1, 2};
        int[][] result1 = solution.permute(A1);
        printArray(result1);

        int[] A2 = {1, 2};
        int[][] result2 = solution.permute(A2);
        printArray(result2);
    }
    
    private static void printArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}

`````
