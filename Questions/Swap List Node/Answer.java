/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
   public ListNode swapPairs(ListNode A) {
        if (A == null || A.next == null) {
            return A;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = A;
        ListNode prev = dummy;
        while (A != null && A.next != null) {
            ListNode first = A;
            ListNode second = A.next;
            prev.next = second;
            first.next = second.next;
            second.next = first;
            prev = first;
            A = first.next;
        }

        return dummy.next;
    }
}
