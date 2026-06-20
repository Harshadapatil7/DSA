package com.p3668_restore_finishing_order;

public class Solution {
	
	public boolean isFriend(int num, int[] friends){
        int low = 0, high = friends.length - 1;
        while(low <= high){
            int mid = low + ((high - low) / 2);
            if(friends[mid] == num)
                return true;
            else if(friends[mid] > num)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }
	
    public int[] recoverOrder(int[] order, int[] friends) {
        int finish[] = new int[friends.length];
        int idx = 0;
        for(int o: order){
            if(isFriend(o, friends))
                finish[idx++] = o;
        }
        return finish;
    }
}
