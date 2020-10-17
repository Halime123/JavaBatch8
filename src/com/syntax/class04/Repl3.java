package com.syntax.class04;

import java.util.Scanner;

public class Repl3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			   Scanner inp = new Scanner(System.in);
			   
				System.out.print("Please enter your age");
				
				int age1=inp.nextInt();
				if(age1>=18) {
					System.out.println("You are eligible to vote");
				} else {
					System.out.println("You are not eligible to vote");
				}

	}

}
