package com.p0012_Integer_to_Roman;

public class Solution2 {

	public String intToRoman(int num) {
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String ans = "";
        int i = 0;
        while(num > 0 && i<val.length){
            while(val[i]>num) i++;
            num -= val[i];
            ans += roman[i];
        }
        return ans;
    }

}
