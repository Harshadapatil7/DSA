package com.p1015_smallest_integer_divisible_by_K;

public class Solution {

    public int smallestRepunitDivByK(int k) {
        long n = 0;
        int len = 0;
        if(k % 2 == 0 || k % 5 == 0) return -1;
        do {
            n = (n * 10 + 1) % k;
            len++;
        }
        while(n % k != 0);
        return len;
    }

}
