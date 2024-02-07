````JAVA

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        if (A == null || B <= 0)
            return null;

        ListNode dummy = new ListNode(0);
        dummy.next = A;
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast pointer B steps ahead
        for (int i = 0; i <= B; i++) {
            if (fast == null)
                return A.next; // B is greater than the size of the list, so remove the first node
            fast = fast.next;
        }

        // Move fast to the end, maintaining the gap of B between fast and slow
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the B-th node from the end
        slow.next = slow.next.next;

        return dummy.next;
    }
}

````
