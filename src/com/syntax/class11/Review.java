package com.syntax.class11;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
String[] animals = {"Cow", "Pig", "Goat", "Chicken", "Mouse", "Dog"};
		
		for (String animalTypes : animals) {
			System.out.print(animalTypes + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		Scanner scan;
		double[] num;
		double sum = 0;
		int size;
		scan = new Scanner(System.in);
		System.out.println("How many numbers would you like to add up?");
		size = scan.nextInt();
		num = new double[size];
		for (int i = 0; i < size; i++) {
		System.out.println("Please enter double numbers");
		num[i] = scan.nextDouble();
		}
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println(sum);
		for(double number:num) {
			sum+=number;
		}
		System.out.println(sum);
		
		String[] countries = { "USA", "Ukraine", "Canada" };
		String[] capitals = { "DC", "Kyiv", "Ottawa" };
		for (int v = 0; v < countries.length; v++) {
			System.out.println("The capital of " + countries[v] + " is " + capitals[v]);
			
			System.out.println("------------------");
			String capital = null;
			for(String country:countries) {
				switch(country) {
				case "USA":
					capital="DC";
					break;
				case "Ukraine":
				capital="Kyiv";
				break;
				case "Canada":
					capital="Ottawa";
					break;
					default:
						System.out.println("No info");
					
				}
				System.out.println(country+"="+capital);
			}
		}
	}

}
