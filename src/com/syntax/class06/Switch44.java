package com.syntax.class06;

import java.util.Scanner;

public class Switch44 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your favorite car make");
		String name=scan.nextLine();
		String carOrigin;
		switch(name) {
			case "BMW":
				carOrigin="german car";
				System.out.println("Your favorite car is  "+ carOrigin);
				break;
			case "Toyota":
				carOrigin="japanese car";
				System.out.println("Your favorite car is  "+ carOrigin);
				break;
				
			case "Maserati":
				carOrigin="italian car";
				System.out.println("Your favorite car is  "+ carOrigin);
				break;
			
				default:
					System.out.println("unknown");
		}

	}

	}


