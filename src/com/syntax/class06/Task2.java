package com.syntax.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your grade");
		String grade=scan.nextLine();
		String g=scan.nextLine();
		
		 switch (grade) {
		 case "A":
			 g="Exellent";
			 break;
		 case "B":
			 g="Good";
			 break;
		 case "C":
			 g="Average";
			 break;
		 case "D":
			 g="Bad";
			 break;
			 default:
				 g="Not valid";
				 
		 }
		 System.out.println("Your grade is "+g);
		 
			 
			 
		 
		
		
	
				

	}

}
