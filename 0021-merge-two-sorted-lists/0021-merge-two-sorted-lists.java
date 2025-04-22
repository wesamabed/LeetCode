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
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sortedList = new ListNode();
        ListNode head = sortedList;
        if(list1 == null && list2 != null) return list2;
        if(list2 == null && list1 != null) return list1;
        if (list1 == null && list2 == null)
            return list1;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                sortedList.next = list1;
                sortedList = sortedList.next;
                if (list1.next == null) {
                    sortedList.next = list2;
                    break;
                }
                list1 = list1.next;

            } else {
                sortedList.next = list2;
                sortedList = sortedList.next;
                if (list2.next == null) {
                    sortedList.next = list1;
                    break;
                }
                list2 = list2.next;
            }
        }
        return head.next;
    }
}