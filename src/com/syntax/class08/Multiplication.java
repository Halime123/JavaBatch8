package com.syntax.class08;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number");
		int num1=scan.nextInt();
		int mul;
		for(int i=1; i<=10;i++) {
			mul=num1*i;
			System.out.println(num1+"x"+i+"="+mul);
			
		}

	}

}
