package com.syntax.class07;

import java.util.Scanner;

public class LoopTask3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println(" please enter start point number");
		int startPoint=input.nextInt();
		System.out.println(" Please enter end point number ");
		int endPoint=input.nextInt();
		int sumE=0, sumO=0;
		
		for (int i =startPoint; i<=endPoint; i++) {
		    if (i%2 == 0) {
		        sumE += i;
		    }
		    if (i%2 != 0) {
		        sumO += i;
		    }
		}
		System.out.println( "sumE is "+ sumE);
		System.out.println( "sumO is "+ sumO);

	}

}
