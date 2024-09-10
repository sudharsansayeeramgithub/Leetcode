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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null || head == null) {
            return head;
        }
        ListNode current = head.next;
        ListNode prev = head;
        while (current != null) {
            ListNode newNode = new ListNode(gcd(prev.val, current.val), current);
            prev.next = newNode;
            prev = current;
            current = current.next;
        }
        return head;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}