package com.p0066_Plus_One;

public class Solution {

    public int[] plusOne(int[] digits) {
        int ans[];
        int carry = 1, sum = 0;
        int isMax = 1;
        for(int i=0; i<digits.length; i++){
            if(digits[i]!=9){
                isMax = 0;
                break;
            }
        }
        if(isMax==1){
            ans = new int[digits.length + 1];
            ans[0] = 1;
        } 
        else{
            ans = new int[digits.length];
        }
        for(int i=digits.length-1; i>=0; i--){
            sum = digits[i] + carry;
            ans[i+isMax] = sum % 10;
            carry = sum / 10;
        }
        return ans;
    }

}
