# Question link-> https://www.interviewbit.com/problems/anagrams/

```Java
import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        // HashMap to store sorted strings as keys and corresponding indices as values
        HashMap<String, ArrayList<Integer>> anagramMap = new HashMap<>();

        // Iterate through the input list
        for (int i = 0; i < A.size(); i++) {
            String word = A.get(i);
            // Convert the word to char array, sort it, and convert back to string
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // Check if the sorted word is already present in the map
            if (anagramMap.containsKey(sortedWord)) {
                // If yes, add the index to the corresponding list
                anagramMap.get(sortedWord).add(i + 1);
            } else {
                // If not, create a new entry in the map
                ArrayList<Integer> indices = new ArrayList<>();
                indices.add(i + 1);
                anagramMap.put(sortedWord, indices);
            }
        }

        // Convert the values of the map to ArrayList and return
        return new ArrayList<>(anagramMap.values());
    }

    // Sample test cases
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> input1 = Arrays.asList("cat", "dog", "god", "tca");
        List<String> input2 = Arrays.asList("rat", "tar", "art");
        System.out.println(solution.anagrams(input1)); // Output: [[1, 4], [2, 3]]
        System.out.println(solution.anagrams(input2)); // Output: [[1, 2, 3]]
    }
}
````
