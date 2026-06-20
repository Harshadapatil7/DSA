package com.p3467_transform_array_by_parity;

public class Solution {
    public int[] transformArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        if(left == right){
            nums[left] %= 2;
            return nums;
        }
        while(left<=right){
            nums[left] %= 2;
            nums[right] %= 2;
            if(nums[left]==0 && nums[right]==1){
                left++;
                right--;
            }
            else if(nums[left]==1 && nums[right]==0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            else if(nums[left]==1)
                right--;
            else
                left++;
            
        }
        return nums;
    }

}
