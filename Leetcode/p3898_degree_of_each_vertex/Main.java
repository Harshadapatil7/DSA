package com.p3898_degree_of_each_vertex;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution sol = new Solution();
		
		System.out.println("Degree of each vertex");
		System.out.println("Enter no. of nodes: ");
		int n = sc.nextInt();
	
		int arr[][] = new int[n][n];
		
		System.out.println("Enter array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int ans[] = sol.findDegrees(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.println("Node " + i + " -> " + ans[i]);
			
		sc.close();
		}
		
	}

}
