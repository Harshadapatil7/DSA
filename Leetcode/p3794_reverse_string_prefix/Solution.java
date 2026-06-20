package com.p3794_reverse_string_prefix;

public class Solution {

    public String reversePrefix(String s, int k) {
        char[] str = s.substring(0,k).toCharArray();
        for(int i=0; i<k/2; i++){
            char temp = str[i];
            str[i] = str[k-i-1];
            str[k-i-1] = temp;
        }
        return new String(str) + s.substring(k);
    }

}
