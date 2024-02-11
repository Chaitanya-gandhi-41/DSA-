/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
````Java
 
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode A) {
        if (A == null || A.next == null) {
            return A;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode prevSorted = dummy;
        ListNode current = A;
        
        while (current != null) {
            ListNode nextNode = current.next;
            if (prevSorted.val >= current.val) {
                prevSorted = dummy;
            }
            while (prevSorted.next != null && prevSorted.next.val < current.val) {
                prevSorted = prevSorted.next;
            }
            current.next = prevSorted.next;
            prevSorted.next = current;
            current = nextNode;
        }
        
        return dummy.next;
    }
}

````
