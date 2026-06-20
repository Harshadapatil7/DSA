package com.p3467_transform_array_by_parity;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution2 sol = new Solution2();
		
		System.out.println("Transform array by Parity");
		
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int ans[] = sol.transformArray(arr);
		System.out.println("Parity array -> " + Arrays.toString(ans));
		sc.close();
	}

}
