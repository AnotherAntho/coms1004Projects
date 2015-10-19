//Anthony Urena
//au2172
//Problem1.java - takes a user input year and calculates the date (day/month) of Easter that year

import java.util.Scanner;

public class Problem1 {

	public static final void main(String[] args) {
	
	//gets scanner and desired year from user
	Scanner scan = new Scanner(System.in);
	System.out.println("What year? Please enter in YYYY format.");
	int y = scan.nextInt();
	
	//codes for the equations necessary to identify the date of Easter for input year
	int a = y % 19;
	int b = y / 100;
	int c = y %  100;
	int d = b / 4;
	int e = b % 4;
	int g = (8*b + 13) / 25;
	int h = (19 * a + b - d - g + 15) % 30;
	int j = c / 4;
	int k = c % 4;
	int m = (h * (a + 11)) / 319;
	int r = (2 * e + 2 * j - k - h + m + 32) % 7;
	
	//stores the day in variable n and the month in variable p
	int n = (h - m + r + 90) / 25;
	int p = (h - m + r + n + 19) % 32;
	
	//prints the month and date of easter for input year in Day/Month format
	System.out.print("The date of easter is: " +n);
	System.out.print("/");
	System.out.println("" +p);	
	}
}
