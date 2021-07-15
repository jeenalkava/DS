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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists==null || lists.length==0)
            return null;
        
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(ListNode list : lists)
        {
            while(list!=null)
            {
                minHeap.add(list.val);
                list=list.next;
            }
        }
        ListNode result=new ListNode(-1);
        ListNode temp=result;
        while(!minHeap.isEmpty())
        {
           temp.next=new ListNode(minHeap.remove());
        
           temp=temp.next;
        }
        
        return result.next;
        
    }
}

mnlog(mn)
mn
