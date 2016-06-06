package com.labs;
import java.util.Scanner;

public class Lab2 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = input.next();
		
		System.out.println("Welcome to the day of " + name);
		System.out.println("Enter '1' to begin.");
		
		for(int i = 0; i < 4 ; i++){
			
			int action = choice(input);
			
			switch(action){
			
			case(1):
				one(i, name);
				break;
			case(2):
				two(i, name);
				break;
			default: 
				System.out.println("Invalid input.");
				System.out.println("Enter '1' or '2': ");
				i--;
			}
			
		} System.out.println("Goodbye " + name);
	
	}

	public static int choice (Scanner input){
		
		int option = input.nextInt();
		
		return option;
	}
	
	public static void one (int i, String name){
		switch(i){
			case(0):
				System.out.println("You have awoken, select '1' to get out of bed.");
				System.out.println("Select '2' to remain in bed.");
				break;
			case(1):
				System.out.println("You are eating breakfast, blinking your eyes. It is foggy out.");
				System.out.println("Select '1' to go outside.");
				System.out.println("Select '2' to remain inside.");
				break;
			case(2):
				System.out.println("Moisture is cool on your skin, you breathe in fresh air.");
				System.out.println("Select '1' to move on.");
				System.out.println("Select '2' to dwell on the past.");
				break;
			case(3):
				System.out.println("Life pulses through your veins, " + name+".");
				break;
				
		}
	}
		
		public static void two (int i, String name){
			switch(i){
			case(1):
				System.out.println("You have chosen to remain in bed.");
				System.out.println("You slip back into stage 1 sleep, entering a lucid dream. ");
				System.out.println("Select '1' to explore your conciousness.");
				System.out.println("Select '2' to explore your sub conciouss.");
				break;
			case(2):
				System.out.println("The comfort of home washes over you.");
				System.out.println("Select '1' to breathe.");
				System.out.println("Select '2' to close your eyes and think of another time.");
				break;
			case(3):
				System.out.println("Memories flash across your conciousness. You are filled with the warmth of past comforts," + name+ ".");
				break;
			}
		}	
		
}