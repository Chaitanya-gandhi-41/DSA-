Question Link-> https://www.interviewbit.com/problems/reverse-linked-list/

### C++

```JAVA

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        
        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse current node's pointer
            
            // Move pointers one position ahead
            prev = current;
            current = next;
        }
        head = prev; // Update head to the last node (prev)
        
        return head;
    }
}

```
