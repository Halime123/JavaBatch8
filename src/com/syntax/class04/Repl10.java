package com.syntax.class04;

import java.util.Scanner;

public class Repl10 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");
		 int num1=inp.nextInt();
		 int num2=inp.nextInt();
		 int num3=inp.nextInt();
		 
		 if (num3 > num1)
			   if (num3 > num2)
			    System.out.println("The largest number is " + num3);
			 }
	}


