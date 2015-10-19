//Anthony Urena
//au2172
//Problem2.java - calculates and displays the change (including dollar/coin breakdown) a customer should receive after a monetary transaction

import java.util.Scanner;

public class Problem2 {

	public static final void main(String[] args) {
	
	//gets scanner as well as price to be paid and money given by customer. 
	Scanner scan = new Scanner(System.in);
	System.out.println("What is the price to be paid, in pennies?");
	int pri = scan.nextInt();
	System.out.println("How much money did the customer give you, in pennies?");
	int mon = scan.nextInt();
	
	//prints message when not enough money is given to pay the price 	
	if( mon < pri) {
		System.out.println("That's not enough money! Check your wallet and try again!");
		
	//prints message in case of exact change	
	} else if( mon == pri) {
		System.out.println("Exact change! Thanks for being awesome.");
	
	//calculates and prints change due and dollar/coin breakdown for the change	
	} else {
		int cha = mon - pri;
		int dol = cha / 100;
		System.out.print("Please give the customer " +cha);
		System.out.println(" cents back in change, in the following amounts.");
		System.out.println("Dollars: " +dol);
		cha -= dol*100;
		int qua = cha / 25;
		System.out.println("Quarters: " +qua);
		cha -= qua*25;
		int dim = cha / 10;
		System.out.println("Dimes: " +dim);
		cha -= dim*10;
		int nic = cha / 5;
		System.out.println("Nickels: " +nic);
		cha -= nic*5;
		System.out.println("Pennies: " +cha);				
        }
    }
}
