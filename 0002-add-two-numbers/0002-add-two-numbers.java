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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1==null && l2==null) return l1;
        int carry=0;
        ListNode first=l1,second=l2,prev=null;
        while(first!=null&&second!=null){
            first.val=first.val+second.val+carry;
            carry=first.val/10;
            first.val=first.val%10;
            prev=first;
            first=first.next;
            second=second.next;
        }
        while(first!=null){
            first.val=first.val+carry;
            carry=first.val/10;
            first.val=first.val%10;
            prev=first;
            first=first.next;
        }
        while(second!=null){
            ListNode newnode=new ListNode(second.val+carry);
            carry=newnode.val/10;
            newnode.val=newnode.val%10;
            prev.next=newnode;
            prev=newnode;
            second=second.next;
        }
        if(carry>0){
            prev.next=new ListNode(carry);
        }
        return l1;
    }
}