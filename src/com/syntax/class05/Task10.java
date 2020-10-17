package com.syntax.class05;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String answer;
		double balance;
		
		System.out.println("please enter if you have a credit card");
		
		
		
		answer=scan.nextLine();
		
		if (answer.equalsIgnoreCase("yes"))
		{
			System.out.println("has a credit card");
			balance=scan.nextDouble();
			
			if(balance>1000) {
				System.out.println("payoff");
			} else {
				System.out.println("they can spend more");
			}		
				
		}else {
			System.out.println("Would you like to have a credit card");
		
		}
		
		
		
		

	}

}
