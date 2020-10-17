package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		boolean allergy=false;
		
		if(allergy) { 
			System.out.println("I have peanut allergy");
		} if (allergy) {
			System.out.println("pet");
		} if (allergy) {
			System.out.println("pollen");
		} else {
			System.out.println("no allergy");
			System.out.println("-------------");
		}
		boolean isfriday=false;
		int date=4;
		if (isfriday) {
			if (date==13) {
				System.out.println("scary movie");
			}
			
		} else {
			System.out.println("study");
		}
		System.out.println("-------");
		
		boolean compAssign=true;
		int score=80;
		
		if(compAssign) {
			
			if(score>=80) {
				System.out.println("good job");
			}
			
		}
		else {
			if(score<=80) {
				System.out.println("redo");
			}
		}
		
			

	}

}
