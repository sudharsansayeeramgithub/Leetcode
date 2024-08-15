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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftheight=countleftheight(root);
        int rightheight=countrightheight(root);
        if(leftheight==rightheight){
            return (int)Math.pow(2,leftheight)-1;
        }
        return countNodes(root.left)+countNodes(root.right)+1;
    }
    public int countleftheight(TreeNode root){
        if(root==null){
            return 0;
        }
        return countleftheight(root.left)+1;
    }
    public int countrightheight(TreeNode root){
        if(root==null){
            return 0;
        }
        return countrightheight(root.right)+1;
    }
}