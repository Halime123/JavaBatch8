package com.syntax.class04;

public class Asghar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Asghar";
		String pass="pass123";
		double accountBalance=10.25;
		double transferAmount=8.12;
		boolean transAllowed=true;
		
		if(pass.equals("pass123")) {
			System.out.println("Welcome to Syntax bank");
			if(transAllowed) {
				if(transferAmount>accountBalance) {
					System.out.println("insufficient amount");
				} else {
					System.out.println("transfer complete");
				}
				System.out.println("Initiating transfer");
			} else {
				System.out.println("not allowed");
			}
		}else {
			System.out.println("Invalid password");
		}
		

	}

}
