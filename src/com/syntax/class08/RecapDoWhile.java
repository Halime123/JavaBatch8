package com.syntax.class08;

import java.util.Scanner;

public class RecapDoWhile {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		int money;
		int waterPrice=5;
		System.out.println("Please pay for water!");
		
		do {
			money=scan.nextInt();
			if(money>waterPrice) {
				System.out.println("This is too much!");
			} else if(money<waterPrice) {
				System.out.println("water is expensive!");
			}
			

	} while (money!=waterPrice);
		System.out.println("Enjoy your water");

}
}