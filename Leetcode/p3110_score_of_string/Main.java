package com.p3110_score_of_string;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution sol = new Solution();
		
		System.out.println("Score of a String");
		System.out.println("Enter string: ");
		String str = sc.next();
		
		int score = sol.scoreOfString(str);
		System.out.println("Score = "+score);
		sc.close();
	}

}
