# Question Link -> https://www.interviewbit.com/problems/integer-to-roman/

````cpp
/*
Given an integer, convert it to a roman numeral, and return a string corresponding to its roman numeral version

Input is guaranteed to be within the range from 1 to 3999.

Example :

Input : 5
Return : "V"

Input : 14
Return : "XIV"
Note : This question has a lot of scope of clarification from the interviewer. Please take a moment to think of all the needed clarifications and see the expected response using “See Expected Output” For the purpose of this question, https://projecteuler.net/about=roman_numerals has very detailed explanations. 

https://www.interviewbit.com/problems/integer-to-roman/
*/


string Solution::intToRoman(int A) { //Brute force simple approach to solve; limited to 3999.
    int n[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};   
    string r[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    auto i = 0;
    string result = "";
    
    while (A!=0)
    {
        while (A>=n[i])
        {
            result += r[i];
            A -= n[i];
        }
        ++i;
    }
    return result;
}
````
