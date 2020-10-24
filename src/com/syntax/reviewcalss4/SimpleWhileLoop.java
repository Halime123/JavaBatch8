package com.syntax.reviewcalss4;

import java.util.Scanner;

public class SimpleWhileLoop {

	public static void main(String[] args) {
		int var=0;
		
		while(var<11) {
			System.out.println("Value of var "+var);
			var++;
		}
		int num1;
		int num2;
		int results = 0;
		char operation;
		System.out.println("Please enter two numbers");
		Scanner scan=new Scanner(System.in);
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println("Please enter the operation");
		operation=scan.next().charAt(0);
		switch (operation) {
			case'+':
			results=num1+num2;
			break;
			
			case '-':
			results=num1-num2;
			break;
			
			case'*':
				results=num1*num2;
				break;
				
			case '/':
				results=num1/num2;
				break;	
				default:
					System.out.println(results);
				
				
		}
		System.out.println(results);
	}

}
