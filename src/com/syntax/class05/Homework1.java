package com.syntax.class05;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your sales amount?");
		int soldPro = scan.nextInt();
		double commissionPercentage=scan.nextDouble();
		
		
		
		if(soldPro>10&&soldPro<100) {
			
			double commission=(commissionPercentage/100)*soldPro;
			
		} else if(soldPro>100&&soldPro<200) {
			double commission=(commissionPercentage/100)*soldPro;
			
		} else if (soldPro>200&&soldPro<500) {
			double commission=(commissionPercentage/100)*soldPro;
				
		} else if(soldPro>500) {
			double commission=(commissionPercentage/100)*soldPro;

	}else { System.out.println("no commision");

}
	
	}	
	
}
