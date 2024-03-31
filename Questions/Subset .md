# Question Link -> https://www.interviewbit.com/problems/subset/

````Java
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        // Sort the input list to ensure non-descending order
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backtrack(A, 0, new ArrayList<Integer>(), result);
        return result;
    }

    private void backtrack(ArrayList<Integer> A, int start, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> result) {
        result.add(new ArrayList<>(path));
        for (int i = start; i < A.size(); i++) {
            // Avoid duplicates by skipping elements that are the same as the previous element
            if (i > start && A.get(i).equals(A.get(i - 1))) {
                continue;
            }
            path.add(A.get(i));
            backtrack(A, i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }
}
````
