package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		int num1=19;
		int num2=99;
		if (num1>=num2) {System.out.println("num1 is bigger");
		
		} else if(num1<num2) {
			System.out.println(num1+" is smaller than "+num2);
		} else {
			System.out.println(num1+" is equal to"+ num2);
			
		}
		System.out.println("--------------");
		
		int day=7;
		if (day==1) {
			System.out.println("today is monday");
		} else if (day==2) {
			System.out.println("today is tuesday");
			
		} else if (day==3) {
			System.out.println("today is wednesday");
			
		} else if(day==4) {
			System.out.println("today is thursday");
			
		} else if(day==5) {
			System.out.println("friday");
		} else if(day==6) {
			System.out.println("saturday");
		} else if(day==7) {
			System.out.println("sunday");
		}
		
	}

}
