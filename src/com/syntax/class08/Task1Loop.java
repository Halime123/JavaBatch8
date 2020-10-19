package com.syntax.class08;

public class Task1Loop {

	public static void main(String[] args) {
		int result = 1;
		for (int i = 1; i <= 50; i++) {
			result = result + i;
			if (i % 2 == 0) {
				System.out.println("Odd results " + result);
			} else if (i % 2 == 1) {
				System.out.println("Even results " + result);
			}
		}
		
		}

	}


