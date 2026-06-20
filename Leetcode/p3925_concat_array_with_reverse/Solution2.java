package com.p3925_concat_array_with_reverse;
public class Solution2 {
	
    public int[] concatWithReverse(int[] nums) {
    
    	int []ans = new int[nums.length * 2];
        for(int i = 0, j = nums.length; i<j; i++, j--){
            ans[i] = nums[i];
            ans[j] = nums[i];
        }
        return ans;
    }
    
}