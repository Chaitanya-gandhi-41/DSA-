# Question Link -> https://www.interviewbit.com/problems/simplify-directory-path/

```Java

import java.util.Stack;

public class Solution {
    public String simplifyPath(String A) {
        Stack<String> stack = new Stack<>();
        String[] components = A.split("/");

        for (String component : components) {
            // Ignore empty or current directory '.'
            if (component.isEmpty() || component.equals(".")) {
                continue;
            }
            // Go up one level for '..'
            else if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            // Push valid directory names onto the stack
            else {
                stack.push(component);
            }
        }

        // Construct the simplified path
        StringBuilder simplifiedPath = new StringBuilder("/");
        while (!stack.isEmpty()) {
            simplifiedPath.insert(1, stack.pop() + "/");
        }
        
        // Remove trailing '/' if exists
        if (simplifiedPath.length() > 1) {
            simplifiedPath.deleteCharAt(simplifiedPath.length() - 1);
        }

        return simplifiedPath.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        String A1 = "/home/";
        String A2 = "/a/./b/../../c/";
        System.out.println(solution.simplifyPath(A1)); // Output: "/home"
        System.out.println(solution.simplifyPath(A2)); // Output: "/c"
    }
}
```
