package com.hackerrank.class01;

import java.util.Scanner;

public class Stdin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		
		 	String s=scan.nextLine();
		 	double d=scan.nextDouble();
	        int i = scan.nextInt();
	        scan.close();
	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	}

}
