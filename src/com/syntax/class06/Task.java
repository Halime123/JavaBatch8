package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean sales=true;
		double discount=0;
		
		
		if(sales) {
			System.out.println("please enter your price");
			double price=scan.nextDouble();
		scan.close();
			
			if(price<50) {
				
				discount=(price * 10)/100;
				System.out.println(discount);
			}
			else if(price>=50&&price<100) {
				discount=(price * 20)/100;
				System.out.println(discount);
			}else if(price>=100&&price<500 ) {
				discount=(price * 30)/100;
				System.out.println(discount);
			}else if(price>=500) {
				discount=(price * 50)/100;
				System.out.println(discount);
				
			
			
		}else {
			System.out.println("no shopping");
		}
	
		}
	} 
	
}

