package com.p0029_Divide_Two_Integers;

public class Solution {

    public int divide(int dividend, int divisor) {
        boolean neg = (dividend < 0) ^ (divisor < 0);
        long num = dividend;
        long div = divisor;
        long quotient = 0;
        long count = 1;
        long temp;

        num = Math.abs(num);
        div = Math.abs(div);

        if(div == 1 && neg && dividend == Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        if(div == 1 && !neg && dividend == Integer.MIN_VALUE){
            return Integer.MAX_VALUE;
        }

        while(div <= num){
            temp = div;
            count = 1;
            while((temp<<1) <= num){
                temp = temp << 1;
                count = count << 1;
            }
            num -= temp;
            quotient += count;
        }
        return neg? (int)-quotient: (int)quotient;
    }
	
}
