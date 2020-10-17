package com.syntax.class05;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter birth month");
		int month=scan.nextInt();
		if (month==1||month==2||month==3)
			System.out.println("it is winter");
		else if(month==4||month==5||month==6)
			System.out.println("spring");
		else if(month==7||month==8||month==9)
			System.out.println("summer");
		else if(month==10||month==11||month==12)
			System.out.println("winter");
		else {
			System.out.println("invalid number");
		}

	}

}
