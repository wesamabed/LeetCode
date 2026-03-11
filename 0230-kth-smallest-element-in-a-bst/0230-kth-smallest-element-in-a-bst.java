/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);
        traverse(root, minHeap);
        for(int i = 0; i < k - 1; i++) minHeap.poll();
        return minHeap.poll();
    }
    private void traverse(TreeNode root, PriorityQueue minHeap){
        if(root == null) return;
        minHeap.offer(root.val);
        traverse(root.left, minHeap);
        traverse(root.right, minHeap);
    }
}