package com.syntax.class06;

import java.util.Scanner;

public class Country {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("What country do you live in?");
		String country=input.nextLine();
		int language=input.nextInt();
		String lang;
		
		switch (language) {
			case 1:
				lang="Turkish";
				break;
			case 2:
				lang="English";
				break;
			case 3:
				lang="Arabic";
				break;
			case 4:
				lang="Urdu";
				break;
			case 5:
				lang="Rusian";
				break;
			case 6:
				lang="Japanese";
				break;
				default:
					lang="Invalid";		
				
		}
		System.out.println("I speak "+lang);	
		
		

	}

}
