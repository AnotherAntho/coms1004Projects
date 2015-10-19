//Anthony Urena
//au2172
//DegreeConverter.java - takes a user input temperature and converts it to Fahrenheit or Celsius depending on desired value

import java.util.Scanner;
import java.text.DecimalFormat;

public class DegreeConverter {

	public static final void main(String[] args) {
	
	//gets scanner and desired conversion from user, also formats output for one decimal place
	Scanner scan = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("#.0");
	System.out.println("Welcome to the Degree Converter! Enter 1 for Fahrenheit to Celsius. Enter 2 for Celsius to Fahrenheit");
	int temp = scan.nextInt();
	
	//gets temperature from user, codes for Fahrenheit to Celsius conversion, and prints Celsius value. checks for vald input.
	if( temp == 1) {
		System.out.println("Please enter the numerical Fahrenheit temperature to convert into Celsius");
		if( scan.hasNextDouble() == false) {
			System.out.println("That is not a valid entry!");
		} else {
			double x = scan.nextDouble();	
			double a = (x - 32.0)*(0.56);
			System.out.print("The result is: ");
			System.out.print(" " +df.format(a));
			System.out.println(" Degrees Celsius");			
			}
			
	//gets temperature from user, codes for Celsius to Fahrenheit conversion, and prints Fahrenheit value. checks for valid input.
	} else if( temp == 2) {
		System.out.println("Please enter the numerical Celsius temperature you would like to convert into Fahrenheit");
		if( scan.hasNextDouble() == false) {
			System.out.println("That is not a valid entry!");
		} else {
			double y = scan.nextDouble();	
			double b = (y * (1.80) + 32.0);
			System.out.print("The result is: ");
			System.out.print(" " +df.format(b));
			System.out.println(" Degrees Fahrenheit");
			}
	
	//prints error message for invalid input
	} else {
		System.out.println("That is an invalid entry!");
		}			
	}	
}
