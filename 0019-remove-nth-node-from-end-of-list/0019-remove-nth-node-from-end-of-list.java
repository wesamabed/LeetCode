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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            length ++;
        }
        int i = 0;
        curr = head;
        if (n == length) {
            return head.next;
        }
        while( i < length - n - 1){
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
        return head;
    }
}