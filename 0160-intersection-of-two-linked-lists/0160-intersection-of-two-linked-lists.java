/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        int countA = 0; int countB = 0;
        ListNode currA = headA;
        ListNode currB = headB;
        while(currA != null){
            countA ++;
            currA = currA.next;
        }
        while(currB != null){
            countB ++;
            currB = currB.next;
        }
        int diff = Math.abs(countA - countB);
        if(countA > countB){
            for(int i = 0; i < diff; i++) headA = headA.next;
        }
        else if(countB > countA){
            for(int i = 0; i < diff; i++) headB = headB.next;
        }
        while(headA != null && headB != null){
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}