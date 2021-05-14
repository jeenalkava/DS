/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        boolean flag=false;
        if(head==null || head.next==null)
            return false;
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(true )
        {
            if(slow.next==null || slow.next.next==null)
            {
                return false;
            }
            slow=slow.next.next;
            fast=fast.next;
            if(fast==slow)
            {
                flag=true;
                break;
            }
            
        }
        return flag;
        
    }
}

Time-o(n)
space-o(1)
