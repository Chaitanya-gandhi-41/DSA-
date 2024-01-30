### Question Link->https://www.interviewbit.com/problems/longest-valid-parentheses/

### JAVA


```JAVA
import java.util.Stack;

public class Solution {
    public int longestValidParentheses(String A) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Initialize stack with -1 to handle cases where valid parentheses start from the beginning
        int max_length = 0;

        for (int i = 0; i < A.length(); i++) {
            char currentChar = A.charAt(i);

            if (currentChar == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    max_length = Math.max(max_length, i - stack.peek());
                }
            }
        }

        return max_length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage:
        String A1 = "(()";
        String A2 = ")()())";

        System.out.println(solution.longestValidParentheses(A1)); // Output: 2
        System.out.println(solution.longestValidParentheses(A2)); // Output: 4
    }
}



```
