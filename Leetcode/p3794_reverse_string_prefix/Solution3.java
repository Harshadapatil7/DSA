package com.p3794_reverse_string_prefix;

public class Solution3 {
	
    public String reversePrefix(String s, int k) {
        StringBuilder sb = new StringBuilder(s.substring(0,k));
        sb.reverse();
        sb.append(s, k, s.length());
        return sb.toString();
    }
    
}
