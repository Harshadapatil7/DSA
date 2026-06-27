package com.p0028_First_occurrence_index_in_str;

public class Solution2 {

    public int strStr(String haystack, String needle) {
		for(int i=0; i<=haystack.length() - needle.length(); i++) {
			int idx = 0;
			if(haystack.charAt(i) == needle.charAt(idx)) {
				while(idx < needle.length() && haystack.charAt(i+idx) == needle.charAt(idx))
                    idx++;
				if(idx == needle.length()) return i;
			}
		}
		return -1;
	}

}
