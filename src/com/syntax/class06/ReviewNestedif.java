package com.syntax.class06;

import java.util.Scanner;

public class ReviewNestedif {

	public static void main(String[] args) {
		String pass="pass123";
		double accountBalance=1000;
		Scanner scan= new Scanner(System.in);
		double transferAmount=500;
		System.out.println("Welcome to Syntax Please enter your password");
		pass=scan.nextLine();
		if("pass".equals(pass)) {
			System.out.println("Please enter the amount that you want to trasfer");
			transferAmount=scan.nextDouble();
			if(transferAmount>accountBalance) {
				System.out.println("Not enough funds");
			}else {
				System.out.println("transfered balance"+(accountBalance-transferAmount));
			}
			
		}else {
			System.out.println("invalid");
		}
		

	}

}
