package com.syntax.class06;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		double num1=scan.nextDouble();
		System.out.println("Enter second number");
		double num2=scan.nextDouble();
		System.out.println("Enter operator");
		char operator=scan.next().charAt(0);
		scan.close();
		double islem=0;
		switch(operator) {
			case'+':
				islem=num1+num2;
				break;
			case'-':
				islem=num1-num2;
				break;
			case '/':
				islem=num1/num2;
				break;
			case'*':
				islem=num1*num2;
				break;
				default:
					System.out.println("invalid");
		
		} 
		System.out.println("The result is "+ islem);
		
		
		
				

	}

}
