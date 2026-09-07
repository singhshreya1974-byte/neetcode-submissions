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
       /* ListNode curr=l1;
        ListNode pre=null;
        while(curr!=null){
            ListNode nxt=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nxt;
        }
        curr=l2;
        ListNode prev=null;
        while(curr!=null){
            ListNode nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }*/
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        int carry=0;
        ListNode h1=l1;
        ListNode h2=l2;

        while(h1!=null || h2!=null || carry!=0){
            int x = (h1 != null) ? h1.val : 0;
            int y = (h2 != null) ? h2.val : 0;

            int s=x+y+carry;
            temp.next=  new ListNode(s%10);
            carry=s/10;
            if(h1!=null) h1=h1.next;
            if(h2!=null)  h2=h2.next;
            temp=temp.next;

        }/*
        ListNode curr=dummy.next;
        ListNode prev=null;
        while(curr!=null){
            ListNode nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }*/
        return dummy.next;
    }
}
