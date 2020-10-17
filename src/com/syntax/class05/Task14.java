package com.syntax.class05;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter score");
		int quiz=scan.nextInt();
		int midterm=scan.nextInt();
		int final1=scan.nextInt();
		int ava=(quiz+midterm+final1)/3;
		
		if (ava>=90) {
			System.out.println("GradeA");
		}else if(ava>=70&&ava<90) {
			System.out.println("Grade B");
		}else if (ava>=50&&ava<70) {
			System.out.println("grade c");
		}else if(ava<50) {
			System.out.println("gradeF");
		}else {System.out.println("invalid number");}
		
			
		
		
		
	}

}
