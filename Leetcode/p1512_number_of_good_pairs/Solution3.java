package com.p1512_number_of_good_pairs;

public class Solution3 {
	
	public int numIdenticalPairs(int[] nums) {
		int[] ans = new int[101];
        int count = 0;
        for(int i=0; i<nums.length; i++){
            count += ans[nums[i]]++;
        }
        
		return count;
	}
}