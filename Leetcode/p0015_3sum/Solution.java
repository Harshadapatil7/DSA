package com.p0015_3sum;

import java.util.*;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int sum;
        int i=0, left, right;
        Arrays.sort(nums);
        while(i < nums.length - 2){
            left = i+1;
            right = nums.length -1;
            while(left < right){
                sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> arr = new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[left]);
                    arr.add(nums[right]);
                    res.add(arr);
                    left++;
                    right--;
                    while(left < right && nums[left]==nums[left-1]) left++;
                    while(left < right && nums[right]==nums[right+1]) right--;
                }
                else if(sum < 0)
                    left++;
                else
                    right--;
            }
            while(i < nums.length -1 && nums[i]==nums[i+1])
                i++;
            i++;
        }
        return res;
    }

}
