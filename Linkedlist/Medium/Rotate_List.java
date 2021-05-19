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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
            return head;
       
        ListNode tail=head;
        
        int n;
        for(n=1;tail.next!=null;n++)
            tail=tail.next;
        
        tail.next=head;
        
        k%=n;
        
        ListNode new_tail=head;
        ListNode new_head=head;
        
        for(int i=1;i<n-k;i++)
        {
            new_tail=new_tail.next;
        }
        new_head=new_tail.next;
        new_tail.next=null;
        return new_head;
    }
}

Time : o(n)
  Space : o(1)
