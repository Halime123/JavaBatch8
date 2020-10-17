package com.syntax.class06;

import java.util.Scanner;

public class Switch43 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Input a number between 1-12");
		int num=scan.nextInt();
		String month;
		switch(num) {
			case 1:
				month="January";
				System.out.println(month);
				break;
			case 2:
				month="February";
				System.out.println(month);
				break;
			case 3:
				month="March";
				System.out.println(month);
				break;
			case 4:
				month="April";
				System.out.println(month);
				break;
			case 5:
				month="May";
				System.out.println(month);
				break;
			case 6:
				month="June";
				System.out.println(month);
				break;
			case 7:
				month="July";
				System.out.println(month);
				break;
			case 8:
				month="August";
				System.out.println(month);
				break;
			case 9:
				month="September";
				System.out.println(month);
				break;
			case 10:
				month="October";
				System.out.println(month);
				break;
			case 11:
				month="November";
				System.out.println(month);
				break;
			case 12:
				month="December";
				System.out.println(month);
				break;
			
				default:
					System.out.println("Invalid");
		}

	}
	}


