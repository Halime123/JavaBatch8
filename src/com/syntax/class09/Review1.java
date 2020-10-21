package com.syntax.class09;

public class Review1 {

	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			System.out.println("Hello");
			for(int y=0; y<3; y++) {
				System.out.println("Bye");
			}
			System.out.println("------------------");
		}
		for (int i=10; i<=14;i++) {
			System.out.println(i);
			for(int j=1;j<=4;j++) {
				System.out.println(j);
				
			}
			System.out.println("--------");
			for (int a=10; a<=14;a++) {
				
				for(int j=1;j<=4;j++) {
					System.out.println(a+"and"+j);
		}
				System.out.println("--------");
				for(int x=1;x<=9;x++) {
					for(int z=0; z<=9;z++) {
						System.out.println(x+""+z);
					}
				}
				System.out.println("--------");
				for(int x=1;x<24;x++) {
					
					for(int z=0; z<60;z++) {
						if(z<10) {
							System.out.println(x+":0"+z);
						} else {
						System.out.println(x+":"+z);
	}

}
	}
		}
	}
}
}
	
