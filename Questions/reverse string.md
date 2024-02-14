public class Solution {
    public String reverseString(String A) {
        // Convert the string to a character array
        char[] charArray = A.toCharArray();
        
        // Initialize pointers for the start and end of the array
        int start = 0;
        int end = charArray.length - 1;
        
        // Swap characters from the beginning and end until the pointers meet
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        
        // Convert the character array back to a string
        return new String(charArray);
    }
}
