# Question Link -> https://www.interviewbit.com/problems/combination-sum-ii/

```Java
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Collections.sort(a); // Sort the array list to maintain non-descending order
        
        backtrack(a, b, 0, new ArrayList<>(), result);
        
        return result;
    }
    
    private void backtrack(ArrayList<Integer> a, int target, int start, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        
        for (int i = start; i < a.size() && a.get(i) <= target; i++) {
            if (i > start && a.get(i).equals(a.get(i - 1))) // Skip duplicates
                continue;
            path.add(a.get(i));
            backtrack(a, target - a.get(i), i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }
}
`````
