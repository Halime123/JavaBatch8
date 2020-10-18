package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int numberFromUser;
		int luckyNumber=7;
		
		do {
			System.out.println("Please enter the number");
			numberFromUser=scan.nextInt();
		} while(numberFromUser!=luckyNumber);
		System.out.println("lucky number");
			
		}
	}


