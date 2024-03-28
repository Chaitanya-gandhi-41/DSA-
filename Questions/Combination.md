# Question Link -> https://www.interviewbit.com/problems/combinations/

````cpp

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int A, int B) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backtrack(A, B, 1, new ArrayList<Integer>(), result);
        return result;
    }

    private void backtrack(int n, int k, int start, ArrayList<Integer> combination, ArrayList<ArrayList<Integer>> result) {
        if (combination.size() == k) {
            result.add(new ArrayList<>(combination));
            return;
        }
        for (int i = start; i <= n; i++) {
            combination.add(i);
            backtrack(n, k, i + 1, combination, result);
            combination.remove(combination.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 4;
        int k = 2;
        ArrayList<ArrayList<Integer>> combinations = solution.combine(n, k);
        System.out.println(combinations);
    }

}

`````
