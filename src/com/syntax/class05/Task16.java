package com.syntax.class05;

import java.util.Scanner;

public class Task16 {
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter score");
		int quiz=scan.nextInt();
		int midterm=scan.nextInt();
		int final1=scan.nextInt();
		int ava=(quiz+midterm+final1)/3;
		System.out.println("print the"+ava);
		char grade;
		
		if (ava>=90) {
			grade='A';
		}else if(ava>=70&&ava<90) {
			grade='B';
		}else if (ava>=50&&ava<70) {
			grade='C';
		}else if(ava<50) {
			grade='F';
		}else {System.out.println("invalid number");}
		
		System.out.println("Grade is "+ grade );
	}

}
