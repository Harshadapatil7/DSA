package com.p3668_restore_finishing_order;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution2 sol = new Solution2();
		
		System.out.print("Enter size of orders: ");
		int m = sc.nextInt();
		
		System.out.print("Enter orders: ");
		int[] order = new int[m];
		for (int i = 0; i < order.length; i++) {
			order[i] = sc.nextInt();
		}
		
		System.out.print("Enter size of friends: ");
		int n = sc.nextInt();
		
		System.out.print("Enter friends: ");
		int[] friends = new int[n];
		for (int i = 0; i < friends.length; i++) {
			friends[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(sol.recoverOrder(order, friends)));
		
		sc.close();
	}

}
