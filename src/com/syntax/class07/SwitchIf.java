package com.syntax.class07;

public class SwitchIf {

	public static void main(String[] args) {
		String timeOfDay="Morning";
		String day="Saturday";
		switch (timeOfDay) {
		case "Morning":
			System.out.println("hello");
			if (day.equals("Saturday"));
			System.out.println("Hi");
		if(day.equals("Sunday")) {
				System.out.println("take break");
			}
			break;
		case"Evening":
			System.out.println("hello");
			break;
			default:
				System.out.println("nothing");
			
		}
		

	}

}
