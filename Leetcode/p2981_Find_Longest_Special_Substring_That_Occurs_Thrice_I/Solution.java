package com.p2981_Find_Longest_Special_Substring_That_Occurs_Thrice_I;

import java.util.HashMap;

public class Solution {

	public int maximumLength(String s) {
        HashMap<String, Integer> freq = new HashMap<>();
        int maxLen = -1;

        int st = 0, len = s.length() - 2;
        while(len > 0){
            String sp = s.substring(st, st+1).repeat(len);
            String curr = s.substring(st, st+len);
            if(curr.equals(sp))
                freq.put(curr, freq.getOrDefault(curr, 0)+1);

            if(st+len == s.length()){
                len--;
                st = 0;
            }
            else{
                st++;
            }
            
        }
        
        for(String str: freq.keySet()){
            if(freq.get(str) >= 3 && str.length() > maxLen)
                maxLen = str.length();
        }
        return maxLen;
    }
	
}
