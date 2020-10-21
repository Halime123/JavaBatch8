package com.syntax.class09;

import java.util.Scanner;

public class Repl66 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int r=scan.nextInt();
		for(int i=r-1;i>=0;i--) {
			for (int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			 System.out.println();
		}
				
	}

}

