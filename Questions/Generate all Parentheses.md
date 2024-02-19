# Question Link-> https://www.interviewbit.com/problems/generate-all-parentheses/

````Java

import java.util.Stack;

public class Solution {
    public int isValid(String A) {
        Stack<Character> stack = new Stack<>();
        // Dictionary to store matching brackets
        java.util.HashMap<Character, Character> bracketsMap = new java.util.HashMap<>();
        bracketsMap.put(')', '(');
        bracketsMap.put('}', '{');
        bracketsMap.put(']', '[');

        for (char c : A.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (bracketsMap.containsValue(c)) {
                stack.push(c);
            } else if (bracketsMap.containsKey(c)) {
                
                if (stack.isEmpty() || stack.pop() != bracketsMap.get(c)) {
                    return 0;  
                }
            } else {
                return 0;  
            }
        }

        // If the stack is empty, all brackets were matched
        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String A1 = "()[]{}";
        String A2 = "([)]";

        System.out.println(solution.isValid(A1));  // Output: 1
        System.out.println(solution.isValid(A2));  // Output: 0
    }
}
````
