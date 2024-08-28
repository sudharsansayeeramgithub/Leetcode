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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode current=head.next,prev=head;
        while(current!=null){
            if(prev.val==current.val){
                prev.next=current.next;
            }else{
                prev=current;
            }
            current=current.next;
        }
        return head;
    }
}