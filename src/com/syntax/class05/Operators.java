package com.syntax.class05;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// logical operator &&, ||
		//&& And, || or
//		if (num>0) {
// if(true&&true)==true, if (true$$false)==false, if(false&&false)==false,
		//if
//	}
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
		int num1;
		num1=scan.nextInt();
		
		if(num1>1&&num1<10) {
			System.out.println("Print it");
			
		} else if(num1>10&&num1<100) {
			System.out.println("medium number");
		} else if (num1>100 && num1>1000){
			System.out.println("large number");
		}
		

}
}


