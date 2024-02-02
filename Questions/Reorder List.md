Question Link-> https://www.interviewbit.com/problems/reorder-list/

### JAVA

```` JAVA
public class Solution {
    public ListNode reorderList(ListNode A) {
        if (A == null || A.next == null) {
            return A;
        }

        // Step 1: Find the middle of the linked list
        ListNode slow = A, fast = A;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        ListNode secondHalf = reverseLinkedList(slow.next);
        slow.next = null; // Cut off the connection between the first and second halves

        // Step 3: Merge the first half and the reversed second half
        mergeLinkedLists(A, secondHalf);

        return A;
    }

    private ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null, current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    private void mergeLinkedLists(ListNode list1, ListNode list2) {
        while (list1 != null && list2 != null) {
            ListNode temp1 = list1.next;
            ListNode temp2 = list2.next;

            list1.next = list2;
            list2.next = temp1;

            list1 = temp1;
            list2 = temp2;
        }
    }
}





````
