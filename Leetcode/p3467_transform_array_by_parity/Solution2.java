package com.p3467_transform_array_by_parity;

public class Solution2 {
	
	public int[] transformArray(int[] nums) {
        int evenCount = 0;
        int parity[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 == 0)
                evenCount++;
        }
        for(int i=0; i<evenCount; i++)
            parity[i] = 0;
        for(int i=evenCount; i<nums.length; i++)
            parity[i] = 1;
        return parity;
    }

}
