//Anthony Urena
//au2172
/*RockPaperScissors - launches a game of rock paper scissors 
that ends when the user or cpu win 10 rounds*/

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static final void main(String[] args) {
		//Creates scanner and random number generator with range 0-2, inclusive
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Rock Paper Scissors Game!");
		System.out.println("Enter 0 for Rock, 1 for Paper, or 2 for Scissors.");
		int userChoice = scan.nextInt();
		//Variables to store scores
		int userScore = 0;
		int cpuScore = 0;
		//RockPaperScissors Game
		while(userScore<=10 && cpuScore<=10) {
			System.out.println("Current USER: "+userScore+" CPU: "+cpuScore);
			int cpuChoice = rand.nextInt(3);
			//Conditional statements for end of game win
			if(userScore==10) {
				System.out.println("USER wins the final round!");
				System.out.println("USER won the game! Congrats!");
				break;
			}else if(cpuScore==10) {
				System.out.println("CPU wins the final round!");
				System.out.println("CPU won the game! Sorry!");
				break;
			//Conditional statement for draws	
			}else if(userChoice==cpuChoice) {
				System.out.println("Draw!");
				userChoice = scan.nextInt();
				cpuChoice = rand.nextInt(3);
			//Conditional statements for each round outcome and score updates		
			}else if(userChoice==0 && cpuChoice==1) {
				System.out.println("USER chose Rock! CPU chose Paper!");
				System.out.println("CPU wins this round. Enter your choice.");
				cpuScore++;
				userChoice = scan.nextInt();
				cpuChoice = rand.nextInt(3);			
			}else if(userChoice==0 && cpuChoice==2) {
				System.out.println("USER chose Rock! CPU chose Scissors!");
				System.out.println("USER wins this round. Enter your choice.");
				userScore++;
				userChoice = scan.nextInt();
				cpuChoice = rand.nextInt(3);		
			}else if(userChoice==1 && cpuChoice==0) {
				System.out.println("You chose Paper! CPU chose Rock!");
				System.out.println("USER wins this round. Enter your choice.");
				userScore++;		
				userChoice = scan.nextInt();
				cpuChoice = rand.nextInt(3);		
			}else if(userChoice==1 && cpuChoice==2) {
				System.out.println("You chose Paper! CPU chose Scissors!");
				System.out.println("CPU wins this round. Enter your choice.");
				cpuScore++;
				userChoice = scan.nextInt();
				cpuChoice = rand.nextInt(3);
			}else if(userChoice==2 && cpuChoice==0) {
				System.out.println("You chose Scissors! CPU chose Rock!");
				System.out.println("CPU wins this round. Enter your choice.");
				cpuScore++;
				userChoice = scan.nextInt();
				cpuChoice = rand.nextInt(3);
			}else if(userChoice==2 && cpuChoice==1) {
				System.out.println("You chose Scissors! CPU chose Paper!");
				System.out.println("USER wins this round. Enter your choice.");
				userScore++;
				userChoice = scan.nextInt();
				cpuChoice = rand.nextInt(3);
			//Accounts for improper input and exits out of the game	
			}else {
				System.out.println("Something went wrong!");
				break;
			}
		}      
	}	
}
