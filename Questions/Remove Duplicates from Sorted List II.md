### JAVA

```Java

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode dummy = new ListNode(0);
        dummy.next = A;
        ListNode prev = dummy;
        ListNode current = A;

        while (current != null) {
            // Check if there are duplicates
            if (current.next != null && current.val == current.next.val) {
                // Move until the end of duplicates
                while (current.next != null && current.val == current.next.val) {
                    current = current.next;
                }
                // Skip all duplicates
                prev.next = current.next;
            } else {
                prev = prev.next;
            }
            current = current.next;
        }

        return dummy.next;
    }
}
````
