package com.p0002_add_two_numbers;


public class Solution {

	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = null;
        ListNode prev = null, curr = null;
        int carry = 0;

        while(l1 != null || l2 != null){
            prev = curr;
            curr = new ListNode();
            if(ans == null)
                ans = curr;

            curr.val = (l1==null?0:l1.val) + (l2==null?0:l2.val) + carry;
            if(curr.val >= 10){
                carry = 1;
                curr.val %= 10;
            }
            else
                carry = 0;

            if (prev != null)
                prev.next = curr;
            l1 = l1 == null? null: l1.next;
            l2 = l2 == null? null: l2.next;
            // System.out.println((l1==null?0:l1.val)+" "+ (l2==null?0:l2.val)+" "+(prev == null? 0: prev.val)+" "+ (curr==null?0:curr.val)+ " "+carry+" ");
        }
        if(carry == 1){
            prev = curr;
            curr = new ListNode(1);
            prev.next = curr;
        }
        return ans;
    }
    
}
