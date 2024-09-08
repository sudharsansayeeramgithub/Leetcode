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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] answer=new ListNode[k];
        ListNode current=head;
        int size=0;
        while(current!=null){
            size++;
            current=current.next;
        }
        int splitSize=size/k;
        int remainingsize=size%k;
        current=head;
        ListNode prev=current;
        for(int i=0;i<k;i++){
            ListNode newPart=current;
            int currentsize=splitSize;
            if(remainingsize>0){
                remainingsize--;
                currentsize++;
            }
            int j=0;
            while(j<currentsize){
                prev=current;
                current=current.next;
                j++;
            }
            if(prev!=null){
                prev.next=null;
            }
            answer[i]=newPart;
        }
        return answer;
    }
}