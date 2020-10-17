package com.syntax.class04;

import java.util.Scanner;

public class Repl2 {

	public static void main(String[] args) {
		/*
		 * The variable "name" holds a String user input 
Write a conditional statement starting on line 9 that 
does the following:
If name is equal to "Chen", print "teacher"
For any other input, print "student"
		 */
		Scanner input = new Scanner(System.in);
	  	System.out.print("In:");
	  	String name = input.nextLine();
	  	if(name.equals("Chen")) {
	  		System.out.println("teacher");
	  	} else if(name!="Chen") {
	  		System.out.println("student");
	  	}
		
	  	
	

}
}