package com.syntax.class04;

import java.util.Scanner;

public class Repl4 {

	public static void main(String[] args) {

		   Scanner inp = new Scanner(System.in);
		   
			System.out.println("Please enter your length and width");
			
			int length=inp.nextInt();
			int width=inp.nextInt();
			if(length==18) {
				if(width==16)
				System.out.println("The shape of your object is rectangle");
			}else if(length==16){
				if(width==16)
				System.out.println("The shape of your object is square");
			}
				

	}

}
