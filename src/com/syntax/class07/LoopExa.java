package com.syntax.class07;

public class LoopExa {

	public static void main(String[] args) {
		int b=99;
		while(b>0) {
			if(b%2==1) {
				System.out.print(b+", ");
				
			}
			b-=2;
		
		}
		boolean breakTime=true;
		while(breakTime) {
			System.out.println("tea");
			breakTime=false;
		}
		
		
	}

}
