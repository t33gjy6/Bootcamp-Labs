package com.labs;

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String q = "Y";
		
		do {
			System.out.println("Enter number of sides: ");
			int nSides = input.nextInt();

			System.out.println("Ready to Roll?! (y/n): ");
			q = input.next();
			q.toLowerCase();

			switch (q) {
			case ("y"):
				roll(nSides);
				break;
			case ("n"):
				break;
			}

			System.out.println("Roll Again?");
			q = input.next();
			q.toLowerCase();
		} while (q.equalsIgnoreCase("y"));
		
		System.out.println("GoodBye");

		input.close();

	}

	public static void roll(int nSides) {

		int rollOne = (int) ((Math.random() * nSides)+1);
		int rollTwo = (int) ((Math.random() * nSides)+1);

		System.out.println(rollOne);
		System.out.println(rollTwo);

		switch(rollOne){
		case(1):
			if(rollTwo == 1)
				System.out.println("Snake Eyes!");
			break;
		case(6):
			if(rollTwo == 6)
				System.out.println("Box Car!");
			break;
		default: break;
		}
	}
}