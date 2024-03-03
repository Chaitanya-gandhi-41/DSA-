 # Question Link -> https://www.interviewbit.com/problems/palindrome-integer/

 ````Java

public class Solution {
    public int isPalindrome(int A) {
        if (A < 0) {  // Negative numbers are not palindromic
            return 0;
        }
        
        int original = A;
        int reversed = 0;
        
        while (A > 0) {
            int digit = A % 10;
            reversed = reversed * 10 + digit;
            A /= 10;
        }
        
        if (original == reversed) {
            return 1;
        } else {
            return 0;
        }
    }
}

````
