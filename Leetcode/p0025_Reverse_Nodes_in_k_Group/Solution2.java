package com.p0025_Reverse_Nodes_in_k_Group;

public class Solution2 {
	
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;

        while(curr != null){
            curr = curr.next;
            count++;
        }

        if(count < k)
            return head;

        ListNode prev = null, next = null;
        curr = head;
        count = 0;

        while(curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        head.next = reverseKGroup(curr, k);

        return prev;
    }

}
