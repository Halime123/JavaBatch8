package com.syntax.class06;

import java.util.Scanner;

public class Switch45 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		System.out.println("Input a number between 1-7");
		int num=scan.nextInt();
		String day;
		switch(num) {
			case 1:
				day="Monday";
				System.out.println(day);
				break;
			case 2:
				day="Tuesday";
				System.out.println(day);
				break;
			case 3:
				day="Wednesday";
				System.out.println(day);
				break;
			case 4:
				day="Thursday";
				System.out.println(day);
				break;
			case 5:
				day="Friday";
				System.out.println(day);
				break;
			case 6:
				day="Saturday";
				System.out.println(day);
				break;
			case 7:
				day="Sunday";
				System.out.println(day);
				break;
			
				default:
					System.out.println("Invalid");
		}

	}

	}


