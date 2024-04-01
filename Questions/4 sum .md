# Question link -> https://www.interviewbit.com/problems/4-sum/

```Java
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> A, int B) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (A == null || A.size() < 4)
            return result;
        
        // Sort the input array
        Collections.sort(A);
        
        // Call the helper method to find four sum
        findNSum(A, B, 4, new ArrayList<>(), result);
        
        return result;
    }
    
    private void findNSum(ArrayList<Integer> nums, int target, int N, ArrayList<Integer> resultSoFar, ArrayList<ArrayList<Integer>> results) {
        if (nums.size() < N || N < 2 || target < nums.get(0) * N || target > nums.get(nums.size() - 1) * N)
            return;

        if (N == 2) {
            int left = 0, right = nums.size() - 1;
            while (left < right) {
                int sum = nums.get(left) + nums.get(right);
                if (sum == target) {
                    ArrayList<Integer> result = new ArrayList<>(resultSoFar);
                    result.add(nums.get(left));
                    result.add(nums.get(right));
                    results.add(result);
                    left++;
                    while (left < right && nums.get(left) == nums.get(left - 1))
                        left++;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        } else {
            for (int i = 0; i < nums.size() - N + 1; i++) {
                if (i == 0 || (i > 0 && !nums.get(i).equals(nums.get(i - 1)))) {
                    ArrayList<Integer> newResult = new ArrayList<>(resultSoFar);
                    newResult.add(nums.get(i));
                    findNSum(new ArrayList<>(nums.subList(i + 1, nums.size())), target - nums.get(i), N - 1, newResult, results);
                }
            }
        }
    }
}
````
