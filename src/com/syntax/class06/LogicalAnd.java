package com.syntax.class06;

public class LogicalAnd {

	public static void main(String[] args) {
		int number=0;
		if(number>=0) {
			if(number<=100) {
				System.out.print("Number is between 0 and 100");
			} else {
				System.out.print("Number is between 0 and 100");
				
			}
		}else {
			System.out.print("Number is between 0 and 100");
		}
		System.out.println("---------------------------");
		
		if(number>=0 && number<=100) {
			System.out.println("Number is between 0 and 100");
		}

	}

}
