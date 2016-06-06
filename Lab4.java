package com.labs;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
			
		String q = "Y";

		do{
			System.out.println("Enter an interger between 1-10: ");
			int n = input.nextInt();
			int num = n;
			
			for(int i=1; i<n; i++){
				num = num * i;				
			}
			
			System.out.println("The factorial of "+n +" is: " + num);
			
			System.out.println("Continue? (y/n): ");
			q = input.next();
			
			q.toLowerCase();
		
		}while (q.equalsIgnoreCase("y"));
		
		System.out.println("Fin.");
		
		input.close();	
	}
	

		

}
