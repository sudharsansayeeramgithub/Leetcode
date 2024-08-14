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
    int sum=0;
    public int sumNumbers(TreeNode root) {
        calculatesum(root,0);
        return sum;
    }
    public void calculatesum(TreeNode root,int currentsum){
        if(root.left==null&&root.right==null){
            sum+=currentsum*10+root.val;
            return;
        }
        if(root.left!=null){
            calculatesum(root.left,currentsum*10+root.val);
        }
        if(root.right!=null){
            calculatesum(root.right,currentsum*10+root.val);
        }
    }
}