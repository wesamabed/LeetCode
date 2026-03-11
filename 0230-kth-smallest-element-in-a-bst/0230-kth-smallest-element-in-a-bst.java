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
        int[] track = {0, -1};
        traverse(root, track, k);
        return track[1];
    }
    private void traverse(TreeNode root, int[] track, int k){
        if(root == null || track[0] >= k) return;
        traverse(root.left, track, k);
        track[0]++;
        if(k == track[0]){
            track[1] = root.val;
            return;
        }
        if(track[0] < k) traverse(root.right, track, k);
    }
}