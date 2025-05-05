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
        if (head == null || head.next == null) return;
        ListNode fast = head;
        ListNode slow = head;
        ListNode previousSlow = null;
        ListNode previous = null;
        ListNode next = null;
        ListNode temp = null;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            previousSlow = slow;
            slow = slow.next;
        }

        if (previousSlow != null) previousSlow.next = null;

        while (slow != null) {
            next = slow.next;
            slow.next = previous;
            previous = slow;
            slow = next;
        }
        ListNode l1 = head;
        ListNode l2 = previous;

        while (l1 != null && l2 != null) {
            temp = l1.next;
            l1.next = l2;
            l1 = l1.next;
            l2 = l2.next;
            if (temp == null) break;  
            l1.next = temp;
            l1 = temp;
            

        }
    }
}