package com.syntax.class05;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your day number");
		
		int day=scan.nextInt();
		if(day==1||day==2||day==3||day==4||day==5) {
			System.out.println("It is a weekday");
		}else if(day==6||day==7) {
			System.out.println("it is a weekend");
		} else {
			System.out.println("invalid day");
		}
			
	}

}
