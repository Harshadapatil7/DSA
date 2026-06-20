package com.p3110_score_of_string;

public class Solution2 {
	public int scoreOfString(String s) {
		int sum = 0;
	    char str[] = s.toCharArray();
        for(int i=0; i<str.length -1; i++){
        	sum += Math.abs(str[i]-str[i+1]);
	    }
	    return sum;
	}
}
