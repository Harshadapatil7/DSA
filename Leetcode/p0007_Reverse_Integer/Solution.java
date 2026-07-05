package com.p0007_Reverse_Integer;

public class Solution {

    public int reverse(int x) {
        long ans = 0;
        while(x != 0){
            ans = ans * 10 + x % 10;
            x /= 10;
            if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) return 0;
        }
        return (int) ans;
    }

}
