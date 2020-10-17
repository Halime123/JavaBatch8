package com.syntax.class06;

import java.util.Scanner;

public class ReplIt {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Do you need a loan?");
		boolean result=scan.nextBoolean();
		String eligibilty;
		if(result==true) {
			System.out.println("What is your credit score?");
			double score=scan.nextDouble();
			if(score<600) {
				eligibilty="Not Eligible";
				System.out.println("The eligibility is "+eligibilty);}
				
			else if(score>=600 && score<700) { 
					eligibilty="Maybe eligible";
					System.out.println("The eligibility is "+eligibilty);}
			else if(score>=700 && score<800) {
				eligibilty="Eligible";
				System.out.println("The eligibility is "+eligibilty);}
			else if(score>=800) {
				eligibilty="Definitely Eligible";
				System.out.println("The eligibility is "+eligibilty);
				}
			
			}
		else {
			System.out.println("Unknown");
			
		}
		
}
}

		
		
	


