package com.p3456_special_substr_of_length_k;

public class Solution2 {

    public boolean hasSpecialSubstring(String s, int k) {
        char prev = s.charAt(0);
        int len = 1;

        if(s.length() == 1 && k==1)
            return true;
        
        for(int i=1; i<s.length(); i++){
        
        	if(s.charAt(i) != prev){
                if(len == k)
                    return true;
                len = 1;
            }
        	else{
                len++;
            }
            prev = s.charAt(i);
        }
        
        return len == k;
    }

}
