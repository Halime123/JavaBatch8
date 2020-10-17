package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Input the boolean value");
		
		boolean value=input.nextBoolean();
		
		if(value) {
			System.out.println("The input value is true");
			
		} else {
			System.out.println("The input value is false");
		}

	}

}
