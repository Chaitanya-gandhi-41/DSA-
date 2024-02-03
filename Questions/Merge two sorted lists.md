Question Link->  https://www.interviewbit.com/problems/merge-two-sorted-lists/

```JAVA
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        // Create a dummy node to simplify the code
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (A != null && B != null) {
            if (A.val < B.val) {
                current.next = A;
                A = A.next;
            } else {
                current.next = B;
                B = B.next;
            }
            current = current.next;
        }

        // If one of the lists is not exhausted, append the remaining nodes
        if (A != null) {
            current.next = A;
        } else {
            current.next = B;
        }

        return dummy.next;
    }
}


``````
