package com.syntax.class06;

import java.util.Scanner;

public class Switch41 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the age of the Child");
		int age=scan.nextInt();
		String baby;
		switch(age) {
			case 1:
				baby="Crawl";
				System.out.println("You can "+ baby);
				break;
			case 2:
				baby="Talk";
				System.out.println("You can "+ baby);
				break;
			case 3:
				baby="Dance";
				System.out.println("You can "+ baby);
				break;
			case 4:
				baby="get Trouble";
				System.out.println("You can "+ baby);
				break;
				default:
					System.out.println("I do not know how old you are");
		}
		
		
	
	}

}
