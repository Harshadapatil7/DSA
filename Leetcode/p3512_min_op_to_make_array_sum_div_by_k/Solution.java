package com.p3512_min_op_to_make_array_sum_div_by_k;

public class Solution {
	
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i=0; i<nums.length; i++)
            sum += nums[i];
        return sum % k;
    }
    
}