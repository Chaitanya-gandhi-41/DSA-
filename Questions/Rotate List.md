## Question Link->  https://www.interviewbit.com/problems/rotate-list/

### JAVA


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
    public ListNode rotateRight(ListNode A, int B) {
        if (A == null || B == 0) {
            return A;
        }

        // Find the length of the linked list
        int length = 1;
        ListNode current = A;
        while (current.next != null) {
            current = current.next;
            length++;
        }

        // Calculate effective rotation value
        int k = B % length;

        // If k is 0, no rotation is needed
        if (k == 0) {
            return A;
        }

        // Find the new head and tail after rotation
        ListNode newTail = A;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;  // Set the new tail's next to null

        // Connect the old tail to the old head
        current.next = A;

        return newHead;
    }
}

````
