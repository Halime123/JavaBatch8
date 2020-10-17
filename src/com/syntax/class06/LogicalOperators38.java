package com.syntax.class06;

import java.util.Scanner;

public class LogicalOperators38 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Is it weekned?");
		boolean weekend=scan.nextBoolean();
		String subject;
		if(!weekend==true) {
			subject="Manual testing";
		} else {
			subject="Java";
		}
		System.out.println("Today you will be learning "+subject);

	}

}
