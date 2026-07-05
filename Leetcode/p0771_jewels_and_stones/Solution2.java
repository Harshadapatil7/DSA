package com.p0771_jewels_and_stones;

public class Solution2 {

	public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i=0; i<stones.length(); i++){
            if(jewels.contains(stones.charAt(i)+""))
                count++;            
        }
        return count;
    }
	
}
