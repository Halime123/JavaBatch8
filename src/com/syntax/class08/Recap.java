package com.syntax.class08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		/*
		 * ask user to pay for a water
		 * water price is 5once users enters money
		 * tell if we need more money or less
		 * once gives 5 dolar say enjoy
		 */
		Scanner scan=new Scanner(System.in);

		int money;
		int waterPrice=5;
		System.out.println("Please pay for water!");
		money=scan.nextInt();
		while(money!=waterPrice) {
			if(money>waterPrice) {
				System.out.println("You need to enter less money");
				money=scan.nextInt();
			}else {
				System.out.println("please pay more");
				money=scan.nextInt();
			}
			
		System.out.println("Enjoy your water");
				
		
	}
	}
}
