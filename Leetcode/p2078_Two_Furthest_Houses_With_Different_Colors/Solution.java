package com.p2078_Two_Furthest_Houses_With_Different_Colors;

public class Solution {
	
	public int maxDistance(int[] colors) {
        int max;
        int i = colors.length - 1;
        while(i>0 && colors[0] == colors[i]){
            i--;
        }
        max = i;
        i = 0;
        while(i<colors.length-1 && colors[colors.length-1] == colors[i]){
            i++;
        }
        max = Math.max(max, colors.length-i-1);
        return max;
    }

}
