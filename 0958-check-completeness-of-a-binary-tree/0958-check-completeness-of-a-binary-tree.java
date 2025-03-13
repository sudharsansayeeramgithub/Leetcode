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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null) return true;
        boolean seen=false;
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode current=queue.poll();
            if(current==null){
                seen=true;
            }
            else{
                if(seen) return false;
                queue.offer(current.left);
                queue.offer(current.right);
            }
        }
        return true;
    }
}