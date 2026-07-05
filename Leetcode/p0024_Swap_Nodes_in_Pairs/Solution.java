package com.p0024_Swap_Nodes_in_Pairs;

public class Solution {
	
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

    public ListNode swapPairs(ListNode head) {
        ListNode prev = null;
        ListNode n1 = head, n2;
        
        if(head == null)
            return null;

        while(n1 != null){
            if(n1.next==null)
                return head;

            n2=n1.next;
            n1.next = n2.next;
            n2.next = n1;
            
            if(prev != null) 
                prev.next = n2;
            
            if(head==n1)
                head = n2;
            
            prev = n1;
            n1 = n1.next;
        }
        return head;
    }

}
