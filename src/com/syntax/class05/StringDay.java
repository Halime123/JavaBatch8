package com.syntax.class05;

import java.util.Scanner;

public class StringDay {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter todays day by using nember");
		
		int day=scan.nextInt();
		if(day==1||day==5)
			System.out.println("I am of today");
		else if(day==2 || day==3)
			System.out.println("git ");
		else if(day==6)
			System.out.println("java");
		else
			System.out.println("invalid day");
			
			

	}

}
