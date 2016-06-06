package com.labs;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		String choice;
		int length, width;
		System.out.println("Hello.  This program calculates area and perimeter.");
		
		do{
			System.out.println("Enter Length: ");
			length = in.nextInt();
			
			System.out.println("Enter Width: ");
			width = in.nextInt();
			
			getPerimeter(length, width);
			getArea(length, width);
			
			System.out.println("Enter 'Yes' to calculate a new room.");
			System.out.println("Enter 'No' to exit.");
			choice = in.next();
		}while(choice.equalsIgnoreCase("yes"));
		
		System.out.println("Goodbye.");
		in.close();
	}

	
	public static void getPerimeter(int length, int width){
		int perimeter = (length * 2) + (width * 2);
		System.out.println("The perimeter of the room is: "+ perimeter);
	}
	
	public static void getArea(int length, int width){
		int area = length * width; 
		System.out.println("The area of the room is: "+ area);
	}

}


