package com.syntax.class08;

public class Continue {

	public static void main(String[] args) {
		
	
		for(int i=1; i<=5; i++) {
			
			if(i==3) {
				continue;
			}
			System.out.println(i);

	}
		System.out.println("endof the loop");
		
	
	for(int i=1; i<=10; i++) {
			
			if(i==3||i==7) {
				continue;

}
			System.out.print(i);
	}
	
}
}