# Question Link-> https://www.interviewbit.com/problems/largest-rectangle-in-histogram/

```Java

import java.util.Stack;

public class Solution {
    public int largestRectangleArea(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;
        
        while (i < A.length) {
            if (stack.isEmpty() || A[i] >= A[stack.peek()]) {
                stack.push(i);
                i++;
            } else {
                int topIndex = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                int area = A[topIndex] * width;
                maxArea = Math.max(maxArea, area);
            }
        }
        
        while (!stack.isEmpty()) {
            int topIndex = stack.pop();
            int width = stack.isEmpty() ? i : A.length - stack.peek() - 1;
            int area = A[topIndex] * width;
            maxArea = Math.max(maxArea, area);
        }
        
        return maxArea;
    }
}
````
