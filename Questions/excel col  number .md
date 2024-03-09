# Question Link-> https://www.interviewbit.com/problems/excel-column-number/

```Java
public class Solution {
    public int titleToNumber(String A) {
        int result = 0;
        for (int i = 0; i < A.length(); i++) {
            result += (A.charAt(A.length() - 1 - i) - 'A' + 1) * Math.pow(26, i);
        }
        return result;
    }

    // Test cases
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.titleToNumber("A"));  // Output: 1
        System.out.println(solution.titleToNumber("AB")); // Output: 28
    }
}
````
