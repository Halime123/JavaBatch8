package com.syntax.class06;

public class NotLogicalNumbers {

	public static void main(String[] args) {
		boolean b=!true;
		System.out.println(b);
		
		boolean another=!false;
		System.out.println(another);
		
		boolean isCold=true;
		
		if (!isCold) {
			System.out.println("I am going to the beach");
		}

	}

}
