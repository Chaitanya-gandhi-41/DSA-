````Java

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Move slow pointer one step and fast pointer two steps
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If there's a cycle, the pointers will meet
            if (slow == fast) {
                break;
            }
        }

        // If there's no cycle, return null
        if (slow != fast) {
            return null;
        }

        // Move one pointer back to the head
        slow = head;

        // Move both pointers at the same speed until they meet
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Return the node where the cycle begins
        return slow;
    }
}

````
