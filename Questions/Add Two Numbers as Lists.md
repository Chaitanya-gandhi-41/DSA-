 ### C++

 ````cpp

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (A != null || B != null || carry != 0) {
            // Get values of the current nodes or 0 if the node is null
            int valA = (A != null) ? A.val : 0;
            int valB = (B != null) ? B.val : 0;

            // Calculate the sum and carry
            int totalSum = valA + valB + carry;
            carry = totalSum / 10;
            int digit = totalSum % 10;

            // Create a new node with the calculated digit and move to the next node
            current.next = new ListNode(digit);
            current = current.next;

            // Move to the next nodes in the input lists if available
            if (A != null) {
                A = A.next;
            }
            if (B != null) {
                B = B.next;
            }
        }

        return dummyHead.next;
    }
}
`````
