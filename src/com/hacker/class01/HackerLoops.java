package com.hacker.class01;

import java.util.Scanner;

public class HackerLoops {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your number");
		
		for(int x=4; x<10; x++) {
			int y=scan.nextInt();
			switch(y) {
			case 1:
				x=y*2;
				break;
			
			}
		}
		
		

	}

}
