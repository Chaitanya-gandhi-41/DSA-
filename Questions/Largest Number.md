# Question Link -> https://www.interviewbit.com/problems/largest-number/

```Java

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final int[] A) {
        // Custom Comparator for sorting
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String ab = a + b;
                String ba = b + a;
                return ba.compareTo(ab); // Compare as strings to concatenate properly
            }
        };

        // Convert integers to strings
        String[] AStrings = new String[A.length];
        for (int i = 0; i < A.length; i++) {
            AStrings[i] = String.valueOf(A[i]);
        }

        // Sort the strings using the custom comparator
        Arrays.sort(AStrings, comparator);

        // Concatenate the sorted strings
        StringBuilder result = new StringBuilder();
        for (String str : AStrings) {
            result.append(str);
        }

        // If the result is zero, return "0"
        if (result.charAt(0) == '0') {
            return "0";
        } else {
            return result.toString();
        }
    }

    // Example usage
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {3, 30, 34, 5, 9};
        System.out.println(solution.largestNumber(A)); // Output: 9534330
    }
}


````
