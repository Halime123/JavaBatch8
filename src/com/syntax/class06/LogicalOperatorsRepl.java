package com.syntax.class06;

import java.util.Scanner;

public class LogicalOperatorsRepl {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Are you thirsty?");
		boolean th=scan.nextBoolean();
		System.out.println("Are you sleepy?");
		boolean sleepy=scan.nextBoolean();
		String drink;
		
		if (th==true &&!sleepy==true) {
			drink="Water";
				
			} else if(th==true && sleepy==true) {
				drink="Coffee";
			} else if(!th==true && sleepy==true) {
				drink="Tea";
			}
		else {
			drink="Nothing";
		}
		System.out.println("Looks like you need to drink "+drink);
			
			
		
			
		
	
		

	}

}
