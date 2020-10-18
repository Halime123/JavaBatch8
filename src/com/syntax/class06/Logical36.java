package com.syntax.class06;

import java.util.Scanner;

public class Logical36 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two strings");
		String word1=scan.nextLine();
		String word2=scan.nextLine();
		System.out.println("Please enter two numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		String output;
		
		if (num1==num2 && (word1.equals(word2))) {
			output="AND";
			
			
		} else if(num1==num2 || (word1.equals(word2))) {
			output="OR";
			
		} else if (!(num1==num2) && ! (word1.equals(word2))) {
			output="NONE";
			
		}
		
		
		
		

	}
		
}
