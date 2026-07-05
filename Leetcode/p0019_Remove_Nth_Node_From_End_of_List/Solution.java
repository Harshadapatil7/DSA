package com.p0019_Remove_Nth_Node_From_End_of_List;

public class Solution {
	
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode end = head;
        ListNode prev = null, curr = head;
        while(n > 0){
            end = end.next;
            n--;
        }
        while(end != null){
            prev = curr;
            curr = curr.next;
            end = end.next;
        }
        if(end==null && curr == head){
            return head.next;
        }
        if(prev != null)
            prev.next = curr.next;
        return head;
    }

}
