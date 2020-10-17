package com.syntax.class05;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your Height");
		int h=scan.nextInt();
		
		if(h<60) {
			System.out.println("short");
		}else if(h>=61&&h<=72) {
			System.out.println("medium");
		}else if(h>72) {
			System.out.println("tall");
		}
		

	} 
	}


