Problem Description
 
 

A message containing letters from A-Z is being encoded to numbers using the following mapping:

 'A' -> 1
 'B' -> 2
 ...
 'Z' -> 26
Given an encoded message A containing digits, determine the total number of ways to decode it modulo 109 + 7.



Problem Constraints
1 <= |A| <= 105



Input Format
The first and the only argument is a string A.



Output Format
Return a single integer denoting the total number of ways to decode it modulo 109 + 7.



Example Input
Input 1:

 A = "8"
Input 2:

 A = "12"


Example Output
Output 1:

 1
Output 2:

 2


Example Explanation
Explanation 1:

 Given encoded message "8", it could be decoded as only "H" (8).
 The number of ways decoding "8" is 1.
Explanation 2:

 Given encoded message "12", it could be decoded as "AB" (1, 2) or "L" (12).
 The number of ways decoding "12" is 2.![image](https://github.com/Chaitanya-gandhi-41/DSA-/assets/115097449/425602ac-8ff3-4e77-a4c6-33afdeae02b1)

Question link-> https://www.interviewbit.com/problems/ways-to-decode/
