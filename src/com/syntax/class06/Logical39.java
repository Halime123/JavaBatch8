package com.syntax.class06;

import java.util.Scanner;

public class Logical39 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your mark");
		double grade=scan.nextDouble();
		String gr;
		
		if(grade>=1&&grade<25) {
		gr="F";
		}else if(grade>=25 && grade<45) {
			gr="E";
			
		}else if(grade>45 && grade<50) {
			gr="D";
			System.out.println("Your grade is "+gr);
		}else if(grade>=50 && grade<60) {
			gr="C";
			System.out.println("Your grade is "+gr);
		}else if(grade>=60 && grade<80) {
			gr="B";
			System.out.println("Your grade is "+gr);
		}else if(grade>=80 && grade<=100) {
			gr="A";	
		
			System.out.println("Your grade is "+gr);
		}else {
			System.out.println("Please enter valid mark");
			
		}
		
		
		
		

	}

}
