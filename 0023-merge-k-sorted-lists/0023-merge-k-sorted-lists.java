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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        for(ListNode node: lists){
            while(node != null){
                minHeap.offer(node);
                node = node.next;
            }
        }
        if(minHeap.isEmpty()) return null;
            ListNode result = minHeap.poll(); 
            ListNode curr = result;
            while (!minHeap.isEmpty()) {
                curr.next = minHeap.poll(); 
                curr = curr.next;           
            }
            curr.next = null; 
        return result;
    }
}