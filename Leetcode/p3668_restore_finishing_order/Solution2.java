package com.p3668_restore_finishing_order;
import java.util.*;

public class Solution2 {
	public int[] recoverOrder(int[] order, int[] friends) {
        HashMap<Integer, Integer> pos = new HashMap<>();
        for(int i=0; i<order.length; i++)
            pos.put(order[i], i);

        Integer[] ans = new Integer[friends.length];
        for (int i = 0; i < ans.length; i++) {
			ans[i] = friends[i];
		}
        Arrays.sort(ans, (a, b) -> pos.get(a) - pos.get(b));
        int[] res = new int[ans.length];
        for (int i = 0; i < res.length; i++) {
			res[i] = ans[i];
		}
        return res;
    }
}
