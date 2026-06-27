package com.p3379_transformed_array;

public class Solution {

    public int[] constructTransformedArray(int[] nums) {
        int[] res = new int[nums.length];
        int n = nums.length;

        for(int i=0; i<n; i++){
            int idx = ((i + nums[i]) % n + n) % n;
            res[i] = nums[idx];
        }
        
        return res;
    }

}
