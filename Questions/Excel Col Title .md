# Question Link -> https://www.interviewbit.com/problems/excel-column-title/

````Java

public class Solution {
    public String convertToTitle(int A) {
        StringBuilder result = new StringBuilder();
        while (A > 0) {
            // Convert the remainder to a character and add it to the result
            result.insert(0, (char) ((A - 1) % 26 + 'A'));
            // Update A to the next quotient
            A = (A - 1) / 26;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convertToTitle(1));  // Output: "A"
        System.out.println(solution.convertToTitle(28)); // Output: "AB"
    }
}
````
