package com.hackerrank.class01;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
	        int N = scanner.nextInt();
	        

	        scanner.close();
	        
	        if (N%2==1){
	            System.out.println("Weird");
	        }if (N%2==0){
	            if(N>=2&&N<=5){
	                System.out.println("Not weird");
	            }if(N>=6 && N<=20){
	                System.out.println("weird");

	        } if(N>20){
	            System.out.println("Not weird");
	        }
	            
	        }

	    }
	

	}


