# Question Link -> https://www.interviewbit.com/problems/kth-permutation-sequence/

````Java
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String getPermutation(int A, int B) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= A; i++) {
            numbers.add(i);
        }

        // Calculate factorial of A
        int[] factorial = new int[A + 1];
        factorial[0] = 1;
        for (int i = 1; i <= A; i++) {
            factorial[i] = factorial[i - 1] * i;
        }

        B--; // Adjust B to start from 0 index

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= A; i++) {
            int index = B / factorial[A - i];
            sb.append(numbers.get(index));
            numbers.remove(index);
            B -= index * factorial[A - i];
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3;
        int k = 4;
        System.out.println("Result for n = " + n + " and k = " + k + ": " + solution.getPermutation(n, k));
    }
}

````
