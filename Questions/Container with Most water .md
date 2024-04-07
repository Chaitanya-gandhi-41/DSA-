# Question Link -> https://www.interviewbit.com/problems/container-with-most-water/

```Java
import java.util.ArrayList;

public class Solution {
    public int maxArea(ArrayList<Integer> A) {
        int left = 0;
        int right = A.size() - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate the current area
            int currentArea = Math.min(A.get(left), A.get(right)) * (right - left);
            // Update maxArea if currentArea is greater
            maxArea = Math.max(maxArea, currentArea);
            // Move the pointer pointing to the shorter line towards the other pointer
            if (A.get(left) < A.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        ArrayList<Integer> heights = new ArrayList<>();
        heights.add(1);
        heights.add(5);
        heights.add(4);
        heights.add(3);

        Solution solution = new Solution();
        System.out.println(solution.maxArea(heights)); // Output: 6
    }
}
````
``
