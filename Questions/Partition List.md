Link-> https://www.interviewbit.com/problems/partition-list/

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
    public ListNode partition(ListNode A, int B) {
        ListNode smallerHead = new ListNode(0); // Dummy head for smaller values
        ListNode smallerTail = smallerHead;
        ListNode greaterOrEqualHead = new ListNode(0); // Dummy head for greater or equal values
        ListNode greaterOrEqualTail = greaterOrEqualHead;
        
        ListNode current = A;
        
        while (current != null) {
            if (current.val < B) {
                smallerTail.next = current;
                smallerTail = smallerTail.next;
            } else {
                greaterOrEqualTail.next = current;
                greaterOrEqualTail = greaterOrEqualTail.next;
            }
            current = current.next;
        }
        
        // Connect the two partitions
        greaterOrEqualTail.next = null; // To avoid cycle in the linked list
        smallerTail.next = greaterOrEqualHead.next;
        
        return smallerHead.next;
    }
}

`````
``
