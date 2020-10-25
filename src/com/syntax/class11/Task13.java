package com.syntax.class11;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers
		//of Fibonacci series.
		
		int a=0;
		int b=1;
		
		for(int i=0; i<11;i++) {
			 
			int sum=a+b;
			a=b;
			b=sum;
			
			System.out.print(sum + " + ");
				
	}
		
		
		System.out.println();

}
}