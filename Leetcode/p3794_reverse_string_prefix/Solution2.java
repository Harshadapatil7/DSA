package com.p3794_reverse_string_prefix;

public class Solution2 {

    public String reversePrefix(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i=k-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        sb.append(s, k, s.length());
        return sb.toString();
    }
	
}
