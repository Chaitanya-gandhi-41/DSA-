import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String fractionToDecimal(int A, int B) {
        if (A == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        // If either one is negative (not both)
        if ((A < 0) ^ (B < 0)) {
            result.append("-");
        }

        // Take absolute values
        long numerator = Math.abs((long) A);
        long denominator = Math.abs((long) B);

        // Integer part
        result.append(numerator / denominator);

        long remainder = numerator % denominator;
        if (remainder == 0) {
            return result.toString();
        }

        result.append(".");

        // Remainder to position map
        Map<Long, Integer> remainderMap = new HashMap<>();
        while (remainder != 0) {
            // If remainder repeats, we found a recurring decimal
            if (remainderMap.containsKey(remainder)) {
                // Insert "(" at the position where the recurring part starts
                int index = remainderMap.get(remainder);
                result.insert(index, "(");
                result.append(")");
                break;
            }

            // Store the current remainder and its position
            remainderMap.put(remainder, result.length());

            // Continue dividing
            remainder *= 10;
            result.append(remainder / denominator);
            remainder %= denominator;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fractionToDecimal(1, 2));  // Output: "0.5"
        System.out.println(solution.fractionToDecimal(2, 1));  // Output: "2"
        System.out.println(solution.fractionToDecimal(2, 3));  // Output: "0.(6)"
    }
}
