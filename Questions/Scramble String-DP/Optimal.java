
public class Solution {
    // Helper function to check if two substrings are anagrams
    private boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }

    // Recursive function to check if B is a scrambled string of A
    private boolean isScrambleUtil(String A, String B) {
        int n = A.length();

        // Base case: If both strings are the same, they are scrambled
        if (A.equals(B)) {
            return true;
        }

        // Base case: If the characters in the two strings are not anagrams, they cannot be scrambled
        if (!isAnagram(A, B)) {
            return false;
        }

        // Try all possible split positions and check recursively
        for (int i = 1; i < n; i++) {
            // Check if the substrings are scrambled for both possibilities
            if ((isScrambleUtil(A.substring(0, i), B.substring(0, i)) && isScrambleUtil(A.substring(i), B.substring(i)))
                    || (isScrambleUtil(A.substring(0, i), B.substring(n - i)) && isScrambleUtil(A.substring(i), B.substring(0, n - i)))) {
                return true;
            }
        }

        return false;
    }

    public int isScramble(final String A, final String B) {
        if (A.length() != B.length()) {
            return 0;
        }

        return isScrambleUtil(A, B) ? 1 : 0;
    }
}
