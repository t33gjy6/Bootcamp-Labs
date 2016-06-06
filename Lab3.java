package com.labs;
import java.util.Scanner;
public class Lab3 {

	public static void main(String[] args){
		
		String q = "Y";
		
		do{
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter an interger: ");
			int num = input.nextInt();
			
			System.out.println("Number \t\tSquared \tCubed");
			System.out.println("====== \t\t======= \t=====");
			
			for(int i = 1; i <= num; i++){
				System.out.printf( i+"\t\t" +i*i + "\t\t" + i*i*i +"\n");
						
			}
			
			System.out.println("Continue?");
			System.out.print("Enter [Y/N]: ");
        	q = input.next();
			q.toLowerCase();
			input.close();
			
		} while (q.equalsIgnoreCase("y"));

		System.out.println("E X P O N E N T I A L");
		
	}
}
