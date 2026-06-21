package com.p1512_number_of_good_pairs;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution3 sol = new Solution3();
		
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.print("Enter array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println(sol.numIdenticalPairs(arr));
		
		sc.close();
	}

}
