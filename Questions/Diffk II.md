# Question Link-> https://www.interviewbit.com/problems/diffk-ii/

```Java
import java.util.HashSet;
import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int diffPossible(final List<Integer> A, int B) {
        HashSet<Integer> elementsSet = new HashSet<>();
        
        // Iterate through the list
        for (int num : A) {
            // Check if num - B or num + B exists in the set
            if (elementsSet.contains(num - B) || elementsSet.contains(num + B)) {
                return 1; // Pair found
            }
            
            // Add the current element to the set
            elementsSet.add(num);
        }
        
        // No pair found
        return 0;
    }
}
````
