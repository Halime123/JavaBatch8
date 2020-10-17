package com.syntax.class07;

public class Task1 {

	public static void main(String[] args) {
		boolean workDay=true;
		int time=1;
		
		while(workDay) {
			
			System.out.println("I need to day off");
			time++;
			
			if(time==6) {
				System.out.println("No need break");
				break;
			}
		}
		

	}

}
