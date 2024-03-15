# Question Link -> https://www.interviewbit.com/problems/binary-representation/

```Java

public class Solution {
    public String findDigitsInBinary(int A) {
        if (A == 0) {
            return "0";
        }
        
        StringBuilder binary = new StringBuilder();
        while (A > 0) {
            int remainder = A % 2;
            binary.insert(0, remainder);
            A = A / 2;
        }
        
        return binary.toString();
    }

    // Example usage
    public static void main(String[] args) {
        Solution solution = new Solution();
        int N = 6;
        String binaryRepresentation = solution.findDigitsInBinary(N);
        System.out.println("Binary representation of " + N + " is: " + binaryRepresentation);
    }
}
````
