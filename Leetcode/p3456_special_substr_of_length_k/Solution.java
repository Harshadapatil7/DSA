package com.p3456_special_substr_of_length_k;

public class Solution {

    public boolean hasSpecialSubstring(String s, int k) {
        int[] len = new int[26];
        
        if(s.length() == 1 && k==1)
            return true;
        
        for(int i=0; i<s.length(); i++){
            len[s.charAt(i) - 'a'] += 1; 
            
            if(i<s.length()-1 && s.charAt(i) != s.charAt(i+1)){
            	if(len[s.charAt(i) - 'a'] == k)
                    return true;
                else
                    len[s.charAt(i) - 'a'] = 0;
            }                  
        }
        
        for(int i: len){
            if(i==k)
                return true;
        }
        
        return false;
    }

}
