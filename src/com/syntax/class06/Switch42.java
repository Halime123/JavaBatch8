package com.syntax.class06;

import java.util.Scanner;

public class Switch42 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the roll number of the Child");
		int num=scan.nextInt();
		String enroll;
		switch(num) {
			case 101:
				enroll="Ramesh";
				System.out.println("Student name: "+ enroll);
				break;
			case 102:
				enroll="Mahesh";
				System.out.println("Student name: "+ enroll);
				break;
			case 103:
				enroll="Mukesh";
				System.out.println("Student name: "+ enroll);
				break;
			
				default:
					System.out.println("Not found student name: in Class");
		}

	}

}
