package com.syntax.reviewcalss4;

public class NestedForLoop {

	public static void main(String[] args) {
		for(int i=0; i<2;i++) {
			System.out.println("outer loop");
			for(int j=0; j<2; j++) {
				System.out.println("first inner loop");
				for(int k=0; k<2;k++) {
					System.out.println("second inner loop");
				}
			}
		}

	}

}
