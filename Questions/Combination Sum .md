# Question link -> https://www.interviewbit.com/problems/combination-sum/

````Java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] A, int B) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(A); // Sort the array to maintain non-descending order
        
        backtrack(A, B, 0, new ArrayList<>(), result);
        
        // Convert the list of lists to array of arrays for output
        int[][] resultArray = new int[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            List<Integer> list = result.get(i);
            resultArray[i] = new int[list.size()];
            for (int j = 0; j < list.size(); j++) {
                resultArray[i][j] = list.get(j);
            }
        }
        
        return resultArray;
    }
    
    private void backtrack(int[] A, int target, int start, List<Integer> path, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        
        for (int i = start; i < A.length && A[i] <= target; i++) {
            path.add(A[i]);
            backtrack(A, target - A[i], i, path, result);
            path.remove(path.size() - 1);
        }
    }
}
````
