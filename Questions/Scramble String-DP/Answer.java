public class Solution {
    
    private boolean isAnagram(String s1, String s2) {
        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }


    private boolean isScrambleUtil(String A, String B) {
        int n = A.length();

  
        if (A.equals(B)) {
            return true;
        }


        if (!isAnagram(A, B)) {
            return false;
        }

       
        for (int i = 1; i < n; i++) {
   
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
