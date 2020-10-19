package com.syntax.class08;

import java.util.Scanner;

public class Task4ForLoop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("What do you want to buy?");
		int cost=scan.nextInt();
		int money=scan.nextInt();
		int result;
		for(money=0;money>=cost;money++) {
			result=money-cost;
			if(money>cost) {
				System.out.println("You paid more: "+result);
			}else if(money!=cost) {
				System.out.println("Thank you for shopping!");
			}
			
		}
		
		

	}

}
