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
    public ListNode reverseBetween(ListNode A, int B, int C) {
        if (A == null || B == C) {
            return A;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = A;
        ListNode prev = dummy;
        
        // Move prev to the node before the start of the sublist to be reversed
        for (int i = 1; i < B; i++) {
            prev = prev.next;
        }
        
        // Initialize pointers for reversal
        ListNode current = prev.next;
        ListNode nextNode = current.next;
        
        // Perform reversal
        for (int i = 0; i < C - B; i++) {
            current.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
            nextNode = current.next;
        }
        
        return dummy.next;
    }
}

````
