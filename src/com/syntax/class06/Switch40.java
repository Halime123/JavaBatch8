package com.syntax.class06;

import java.util.Scanner;

public class Switch40 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter name of the instructor");
		String name=scan.nextLine();
		String assignment=null;
		switch (name){
		
			case "Asghar":
				assignment="Java Assignment";
				break;
			case "Moazam":
				assignment="SDLC Assignment";
				break;
			case "Wegas":
				assignment=" Selenium Assignment";
				break;
			case "Asel":
				assignment="every Assignment";
				break;
				default:
					System.out.println("Invalid instructor selected");
				
			
		} 
		System.out.println("Will take care of "+assignment);
		

	}

}
