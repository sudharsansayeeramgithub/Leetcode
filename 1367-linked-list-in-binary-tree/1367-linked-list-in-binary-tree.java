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
    public boolean isSubPath(ListNode head, TreeNode root) {
        return traverse(head,root);
    }
    private boolean traverse(ListNode head,TreeNode curr){
        if(curr==null){
            return false;
        }
        return dfs(head,curr)||traverse(head,curr.left)||traverse(head,curr.right);
    }
    private boolean dfs(ListNode currNode,TreeNode curr){
        if(curr==null||curr.val!=currNode.val){
            return false;
        }
        if(currNode.next == null){
            return true;
        }
        return dfs(currNode.next,curr.left) || dfs(currNode.next,curr.right);
    }
}