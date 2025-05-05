/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;

        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        if (prev != null)
            prev.next = null;

        ListNode reversed = null, next = null;
        while (slow != null) {
            next = slow.next;
            slow.next = reversed;
            reversed = slow;
            slow = next;
        }

        ListNode l1 = head;
        ListNode l2 = reversed;
        while (l1 != null && l2 != null) {
            ListNode temp = l1.next;
            l1.next = l2;
            l1 = l1.next;
            l2 = l2.next;

            if (temp == null)
                break;
            l1.next = temp;
            l1 = temp;
        }
    }
}