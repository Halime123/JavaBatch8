package com.syntax.class05;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int workedYears=scan.nextInt();
		
		
		if(workedYears>=5) {
			System.out.println("Eligible to for bonus");
			int annualSalary=scan.nextInt();
			if(annualSalary>50000) {
				System.out.println("bonus=5000");
				
			}else {
				System.out.println("bonus=3000");
			}
			
		}else {
			System.out.println("Not eligible for bonus");
		}
		

	}

}
