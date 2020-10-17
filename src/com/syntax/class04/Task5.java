package com.syntax.class04;

public class Task5 {

	public static void main(String[] args) {
		double rate=4.5;
		int price=2000000;
		
		if(rate>4.5) {
			System.out.println("I will not buy a house");
		}else {
			System.out.println("I will be considering to buy");
			if(price>200000) {
				System.out.println("consider to buy a loan");
			} else if(price<=200000) {
				System.out.println("pay cash");
				
			}
		}
			
				

	}

}
