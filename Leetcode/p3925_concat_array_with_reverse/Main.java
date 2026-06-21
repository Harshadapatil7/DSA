package com.p3925_concat_array_with_reverse;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution sol = new Solution();
		
		System.out.println("Concatenate Array With Reverse");
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		
		System.out.print("Enter array: ");
		int nums[] = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		int ans[] = sol.concatWithReverse(nums);
		System.out.println("Final array: " + Arrays.toString(ans));
		
		sc.close();
	}

}
