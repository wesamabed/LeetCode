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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> list = new ArrayList<>();
       if(root == null) return list;
       Queue<TreeNode> queue = new ArrayDeque<>();
       queue.offer(root);
       while(!queue.isEmpty()){
        int level = queue.size();
        List<Integer> innerList = new ArrayList<>();
        for(int i = 0; i < level; i++){
            TreeNode curr = queue.poll();
            if(curr.left != null) queue.offer(curr.left);
            if(curr.right != null) queue.offer(curr.right);
            innerList.add(curr.val);
        }
        list.add(innerList);
       }
       return list;

    }

}