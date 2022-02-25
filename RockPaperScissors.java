/**
 *
 * @author Alain Fathalla
 * @version 0.1
 * @created 2.24.22
 * @description Week4/RockPaperScissors
 * 
 **/

import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Enter 1 for scissors, 2 for rock, 3 for paper");
		
		int userSelection = input.nextInt();
		
		int pcSelection = rand.nextInt(3)+1;
		
		// If user wins
		if((userSelection == 1 && pcSelection ==3) ||
			(userSelection == 2 && pcSelection == 1) ||
				(userSelection == 3 && pcSelection == 2)) {
			System.out.println("You win!");
			System.out.println("User entered: " + userSelection);
			System.out.println("PC entered: " + pcSelection);
		}
		// If it's a tie
		else if (userSelection == pcSelection) {
			System.out.println("It is a tie!");
			System.out.println("User entered: " + userSelection);
			System.out.println("PC entered: " + pcSelection);
		}
		// If user loses
		else {
			System.out.println("You lose! Computer wins");
			System.out.println("User entered: " + userSelection);
			System.out.println("PC entered: " + pcSelection);
		}
		
	}	
}
