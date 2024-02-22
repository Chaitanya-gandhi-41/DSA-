# Question Link-> https://www.interviewbit.com/problems/min-stack/

```Java
import java.util.Stack;

class Solution {
    // Main stack to store elements
    private Stack<Integer> mainStack;
    // Stack to keep track of minimum elements
    private Stack<Integer> minStack;

    public Solution() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (!mainStack.isEmpty()) {
            int popped = mainStack.pop();
            if (popped == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int top() {
        if (!mainStack.isEmpty()) {
            return mainStack.peek();
        }
        return -1; // or throw an exception
    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        return -1; // or throw an exception
    }
}

````
