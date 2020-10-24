package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many names do you like to store?");
		int size=scan.nextInt();
		String[] names=new String[size];
		
		for(int i=0; i<size;i++) {
			System.out.println("Please enter names");
			names[i]=scan.next();
		}
		
		
		
			

	}

}
