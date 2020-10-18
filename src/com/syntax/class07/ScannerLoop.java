package com.syntax.class07;

import java.util.Scanner;

public class ScannerLoop {

	public static void main(String[] args) {
		String name;
		Scanner scan=new Scanner(System.in);
		int num=1;
		while(num<6) {
		System.out.println("Please tell me your name");
		name=scan.nextLine();
		System.out.println("Nice to meet "+name);
		num++;
		
		
		}	
		System.out.println("----------------");
		System.out.println("Please enter the number");
		int num1=scan.nextInt();
		
		
	}

}
