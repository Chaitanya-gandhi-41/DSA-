# Question Link-> https://www.interviewbit.com/problems/subsets-ii/

````Java

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        generateSubsets(A, 0, new ArrayList<Integer>(), result);
        return result;
    }
    
    private void generateSubsets(ArrayList<Integer> nums, int start, ArrayList<Integer> subset, ArrayList<ArrayList<Integer>> result) {
        result.add(new ArrayList<>(subset));
        
        for (int i = start; i < nums.size(); i++) {
            // Avoid duplicates
            if (i > start && nums.get(i).equals(nums.get(i - 1))) {
                continue;
            }
            subset.add(nums.get(i));
            generateSubsets(nums, i + 1, subset, result);
            subset.remove(subset.size() - 1);
        }
    }
}

````
