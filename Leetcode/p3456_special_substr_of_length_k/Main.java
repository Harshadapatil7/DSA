package com.p3456_special_substr_of_length_k;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution2 sol = new Solution2();
		
		System.out.println("Find Special Substring of Length K");
		
		System.out.print("Enter string: ");
		String s = sc.next();
		
		System.out.print("Enter k: ");
		int k = sc.nextInt();
		
		System.out.println(sol.hasSpecialSubstring(s, k));
		
		sc.close();
	}

}
