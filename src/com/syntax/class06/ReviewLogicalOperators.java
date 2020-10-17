package com.syntax.class06;

public class ReviewLogicalOperators {

	public static void main(String[] args) {
		String day="Sunday";
		if(day.equals("Sunday")) {
			System.out.println("Relax its");
		}else if (day.equalsIgnoreCase("Saturday")) {
			System.out.println("Relax its");
		}else {
			System.out.println("Go to work");
		}
		
		if(day.equalsIgnoreCase("Sunday") || day.equalsIgnoreCase("Saturday")) {
			
		} else {
			System.out.println("go to work");
		}
	}

}
