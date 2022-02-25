/*
 * 
 * @author alainfathalla
 * @version 0.1
 * @created 2.24.22
 * @description Week4/DrinkingAge
 * 
 */

import java.util.Scanner;

public class DrinkingAge {
	
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		// Welcome User and get their age
		System.out.println("Welcome");
		System.out.println("Enter your age: ");
	
		int age;
		
		age = keyboard.nextInt();
	
		
		if (age >= 21)
				System.out.println("You are allowed to drink alcohol.");
		
		else System.out.println("Sorry. You are not allowed to drink alcohol.");
		
	}	
}