package com.syntax.class11;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		Scanner scan=new Scanner(System.in);
		System.out.println("Please write your number");
		
		int num=scan.nextInt();
		
		if(num%2==0 || num%3==0) {
			System.out.println("It is not a prime number");
			
		} else if(!(num%2==0)) {
			System.out.println("The number is a prime number " +num);
			
		}
		
		
	}

}
