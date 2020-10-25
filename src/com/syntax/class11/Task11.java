package com.syntax.class11;

public class Task11 {

	public static void main(String[] args) {
		//Write a program to swap 2 numbers without a temporary variable?
		//Swap  2 strings without a temporary variable?
		
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is "+a+" b is "+b);
		System.out.println("----------------");
		String x="Gunel";
		String y="Selma";
		 System.out.println("Before swapping the value of word1 is "+x);
		 System.out.println("Before swapping the value of word2 is "+y);
		 x=x+y;
		y=x.substring(0,x.length()-y.length());  // JavaCoding-Coding; word2 has become "Java"
		x = x.substring(y.length());// word1 has become "Coding'
		 System.out.println("______________________________________________________");
		 System.out.println("After swapping the value of word1 is "+x);
		 System.out.println("After swapping the value of word2 is "+y);
		
	}

}
