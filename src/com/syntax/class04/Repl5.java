package com.syntax.class04;

import java.util.Scanner;

public class Repl5 {

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		 System.out.println("Please enter first number");
		 int x=inp.nextInt();
		 System.out.println("Please enter second number");
		 int y=inp.nextInt();
		 
		 if(x*y>=0) {
			 System.out.println("true");
		 
		 } else {
			 System.out.println("false");
		 }
	
		 
		 

	}

}
