# Question Link -> https://www.interviewbit.com/problems/letter-phone/

```Java
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public ArrayList<String> letterCombinations(String A) {
        ArrayList<String> result = new ArrayList<>();
        if (A == null || A.length() == 0)
            return result;

        HashMap<Character, String> digitMap = new HashMap<>();
        digitMap.put('0', "0");
        digitMap.put('1', "1");
        digitMap.put('2', "abc");
        digitMap.put('3', "def");
        digitMap.put('4', "ghi");
        digitMap.put('5', "jkl");
        digitMap.put('6', "mno");
        digitMap.put('7', "pqrs");
        digitMap.put('8', "tuv");
        digitMap.put('9', "wxyz");

        backtrack("", A, digitMap, result);
        return result;
    }

    private void backtrack(String combination, String nextDigits, HashMap<Character, String> digitMap, ArrayList<String> result) {
        if (nextDigits.length() == 0) {
            result.add(combination);
        } else {
            char digit = nextDigits.charAt(0);
            String letters = digitMap.get(digit);
            for (int i = 0; i < letters.length(); i++) {
                backtrack(combination + letters.charAt(i), nextDigits.substring(1), digitMap, result);
            }
        }
    }
}
````
