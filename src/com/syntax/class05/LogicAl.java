package com.syntax.class05;

import java.util.Scanner;

public class LogicAl {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your day");
		
		String day=scan.nextLine();
		
		
		if(day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday"));
		
				{
			
			System.out.println("Today is "+day);
		}
				

	}

}
