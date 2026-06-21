package com.p3512_min_op_to_make_array_sum_div_by_k;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution sol = new Solution();
		
		System.out.println("Minimum Operations to Make Array Sum Divisible by K");
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		
		System.out.print("Enter array: ");
		int nums[] = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		System.out.print("Enter k: ");
		int k = sc.nextInt();
		
		int ans = sol.minOperations(nums, k);
		System.out.println("Min Operation = " + ans);
		
		sc.close();
		
	}

}
