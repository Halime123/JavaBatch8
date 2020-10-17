package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * lets ask a tester which browser they would like to use 
		 */
		
		Scanner scan;
		String browser;
		String message;
		scan=new Scanner(System.in);
		System.out.println("please enter a browser");
		browser=scan.nextLine();
		switch(browser.toLowerCase()) {
		case "safari":
			message="your code will be exacute";
			break;
		case "chrome":
			message="your code will be exacute";
			break;
		default:
			message="your code will not be supported";//swith can not work with double float long
			
		}
		System.out.println(message);
	}

}
