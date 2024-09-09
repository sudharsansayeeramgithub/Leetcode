/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] result = new int[m][n];
        for (int[] a : result) {
            Arrays.fill(a, -1);
        }
        if (head == null) {
            return result;
        }
        int top = 0, left = 0, bottom = m - 1, right = n - 1;
        ListNode current = head;
        while (top <= bottom && left <= right && current != null) {

            for (int i = left; i <= right && current != null; i++) {
                result[top][i] = current.val;
                current = current.next;
            }
            top++;
            for (int i = top; i <= bottom && current != null; i++) {
                result[i][right] = current.val;
                current = current.next;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left && current != null; i--) {
                    result[bottom][i] = current.val;
                    current = current.next;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top && current != null; i--) {
                    result[i][left] = current.val;
                    current = current.next;
                }
                left++;
            }
        }
        return result;
    }
}