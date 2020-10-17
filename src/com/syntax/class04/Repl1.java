package com.syntax.class04;

import java.util.Scanner;

public class Repl1 {

	public static void main(String[] args) {
	System.out.print("Please enter your age");
	  	
	  	Scanner input=new Scanner(System.in);
	  	
		int num= input.nextInt();
	  	
	  	if(num>=18) {
	  		
			  System.out.println("You are eligible to vote");
			  
			} 
	  	int num1= input.nextInt();
	  	if(num1<=17) {
				
			  System.out.println("You are not eligible to vote");
			} 
	  	
	  	}

	}


