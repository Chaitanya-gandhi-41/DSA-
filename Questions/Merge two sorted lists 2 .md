# Question Link -> https://www.interviewbit.com/problems/merge-two-sorted-lists-ii/

```Java
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        // Get sizes of ArrayLists a and b
        int m = a.size();
        int n = b.size();
        
        // Ensure capacity of ArrayList a
        a.ensureCapacity(m + n);
        
        // Initialize pointers for a and b
        int i = 0;
        int j = 0;
        
        // Merge ArrayLists a and b into a
        while (i < m && j < n) {
            if (a.get(i) <= b.get(j)) {
                i++;
            } else {
                a.add(i, b.get(j));
                j++;
                m++;
            }
        }
        
        // Add remaining elements of b to the end of a
        while (j < n) {
            a.add(b.get(j));
            j++;
        }
    }

    // Example usage
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-4, 3));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(-2, -2));
        
        Solution solution = new Solution();
        solution.merge(A, B);
        
        System.out.println("Modified A: " + A);
    }
}
````
