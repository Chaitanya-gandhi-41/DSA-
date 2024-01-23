Problem Description
 
 

Implement wildcard pattern matching with support for '?' and '*' for strings A and B.
'?' : Matches any single character.
'*' : Matches any sequence of characters (including the empty sequence).
The matching should cover the entire input string (not partial).


Problem Constraints
1 <= |A|, |B| <= 9e4


Input Format
The first argument of input contains a string A.
The second argument of input contains a string B.


Output Format
Return 0 or 1:
=> 0 : If the patterns do not match.
=> 1 : If the patterns match.


Example Input
Input 1:
 A = "aa"
 B = "a"
Input 2:
 A = "aa"
 B = "aa"
Input 3:
 A = "aaa"
 B = "aa"
Input 4:
 A = "aa"
 B = "*"
Input 5:
 A = "aa"
 B = "a*"
Input 6:
 A = "ab"
 B = "?*"
Input 7:
 A = "aab"
 B = "c*a*b"


Example Output
Output 1:
0
Output 2:
1
Output 3:
0
Output 4:
1
Output 5:
1
Output 6:
1
Output 7:
0


Question link -> <a href="https://www.interviewbit.com/problems/regular-expression-match/">Link</a>

![image](https://github.com/Chaitanya-gandhi-41/DSA-/assets/115097449/e14f7d55-9289-46e2-ab84-f79dcd500316)
