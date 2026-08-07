package com.p1370_Increasing_Decreasing_String;

import java.util.Arrays;

public class Solution {
	
	public String sortString(String s) {
        char[] str = s.toCharArray();
        Arrays.sort(str);
        StringBuilder sb = new StringBuilder(new String(str));
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(sb.length() != 0){
            if(i >= sb.length()){
                i = 0;
                sb = sb.reverse();
                ans.append(sb.charAt(i));
                sb.deleteCharAt(i);
            }
            if(sb.length() != 0 && (ans.length() == 0 || ans.charAt(ans.length()-1) != sb.charAt(i))){
                ans.append(sb.charAt(i));
                sb.deleteCharAt(i);
            }
            else{
                i++;
            }
        }
        return ans.toString();
    }

}
