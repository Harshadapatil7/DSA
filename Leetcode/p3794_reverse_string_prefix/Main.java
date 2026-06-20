package com.p3794_reverse_string_prefix;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution3 sol = new Solution3();
		
		System.out.println("Reverse String Prefix");
		
		System.out.println("Enter string: ");
		String s = sc.next();
		
		System.out.println("Enter k: ");
		int k = sc.nextInt();
		
		System.out.println(sol.reversePrefix(s, k));
		sc.close();
	}

}
