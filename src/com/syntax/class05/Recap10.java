package com.syntax.class05;

import java.util.Scanner;

public class Recap10 {

	public static void main(String[] args) {
		
		Scanner scanner;
		scanner=new Scanner(System.in);
		
		String sentence=scanner.nextLine();
		
		System.out.println("You entered sentence;"+sentence);		
		
		
		int number=scanner.nextInt();
		
		char singleCharacter=scanner.next().charAt(0);
		System.out.println("Enter"+singleCharacter);
		
	}

}
