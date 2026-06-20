package com.p1512_number_of_good_pairs;
import java.util.*;

public class Solution2 {
	
	public int nC2(int n) {
		return n * (n-1) / 2;
	}
	public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        for (int i : nums) {
			freq.put(i, freq.getOrDefault(i, 0) + 1);
		}
        
        for (int i : freq.values()) {
			count += nC2(i);
		}
		return count; 
	}
}
