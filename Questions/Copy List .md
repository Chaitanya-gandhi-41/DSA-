# Question Link -> https://www.interviewbit.com/problems/copy-list/

```java
import java.util.HashMap;

public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null)
            return null;

        // Create a mapping of original nodes to their corresponding copies
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();

        // Create a new head node for the copied list
        RandomListNode newHead = new RandomListNode(head.label);
        RandomListNode current = head;
        RandomListNode newCurrent = newHead;

        // Map the original head to the new head
        map.put(head, newHead);

        // Iterate through the original list to create the copied list
        while (current != null) {
            if (current.next != null) {
                if (!map.containsKey(current.next))
                    map.put(current.next, new RandomListNode(current.next.label));
                newCurrent.next = map.get(current.next);
            }

            if (current.random != null) {
                if (!map.containsKey(current.random))
                    map.put(current.random, new RandomListNode(current.random.label));
                newCurrent.random = map.get(current.random);
            }

            current = current.next;
            newCurrent = newCurrent.next;
        }

        return newHead;
    }
}

````
