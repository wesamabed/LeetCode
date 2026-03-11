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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        boolean zigZag = false;
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> innerList = new ArrayList<>();
            for(int i = 0; i < level; i++){
                if(zigZag){
                    TreeNode curr = queue.pollLast();
                    if(curr.right != null) queue.offerFirst(curr.right);
                    if(curr.left != null) queue.offerFirst(curr.left);
                    innerList.add(curr.val);
                }
                else{
                    TreeNode curr = queue.pollFirst();
                    if(curr.left != null) queue.offerLast(curr.left);
                    if(curr.right != null) queue.offerLast(curr.right);
                    innerList.add(curr.val);
                }
            }
            list.add(innerList);
            zigZag = !zigZag;
        }
        return list;
    }
}