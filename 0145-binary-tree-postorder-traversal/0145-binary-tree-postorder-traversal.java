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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrderHelper(root,result);
        return result;
    }
    public void postOrderHelper(TreeNode root,List<Integer> result){
        if(root == null){
            return;
        }
        result.add(root.val);
        postOrderHelper(root.left,result);
        postOrderHelper(root.right,result);
    }
}