package com.p0414_third_max_number;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution sol = new Solution();
		
		System.out.println("Third maximum number of array");
		
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.print("Enter array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(sol.thirdMax(arr));
		
		sc.close();

	}

}
