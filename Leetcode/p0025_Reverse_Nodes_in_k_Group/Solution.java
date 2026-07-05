package com.p0025_Reverse_Nodes_in_k_Group;

import java.util.*;

public class Solution {
	
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode> st = new Stack<>();
        ListNode prev = null, popped = null, curr = head;
        ListNode ans = null;
       
        while(curr != null){
        
        	while(st.size() != k){
        		if(curr == null){
                    if(ans == null)
                        return head;
                    return ans;
                }
                
        		st.push(curr);
                curr = curr.next;
            }
        	
            while(!st.empty()){
                prev = popped;
                popped = st.pop();
            
                if(ans == null)
                    ans = popped;
                
                if(prev != null)
                    prev.next = popped;
            }
            
            popped.next = curr;
        }
        
        return ans;
    }

}
