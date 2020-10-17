package com.syntax.class06;

import java.util.Scanner;

public class LaergestNumber {

	public static void main(String[] args) {
		// input and output should be the same variable double =double;int=int
		//if (x!=y&&y!=z)
		//nested if(following equation is nested if
		//reverse if(!(num1==num2&&num2==num3))(converting to the false
		Scanner scanner = new Scanner(System.in);
		double x, y, z, max;
		x = scanner.nextDouble();
		y = scanner.nextDouble();
		z = scanner.nextDouble();
		scanner.close();
		// 1st way
		if (x > y && x > z) {
			max =x;
		} else if (y > z) {
			max = y;
		} else {
			max = z;
		}
		System.out.println(max);
		// 2nd way
		if (x > y) {
			if (x > z) {
				max = x;
			} else {
				max = z;
			}
		} else if (y > z) {
			max = y;
		} else {
			max = z;
		}
		System.out.println(max);
	}
	}


