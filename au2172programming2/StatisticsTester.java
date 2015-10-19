//Anthony Urena
//au2172
/*StatisticsTester - class that asks user to define an array of doubles
and prints its statistics using methods from Statistics.java */

import java.util.Scanner;

public class StatisticsTester {
	//Main method that takes user input to define array
	public static final void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers are in the array?");
		int size = scan.nextInt();
		double[] array = new double[size];
		System.out.println("Please enter " + size + " numbers.");
		for(int i=0;i<size;i++) {
			array[i]=scan.nextDouble();
		}	
		//Prints statistics using methods from Statistics.java
		System.out.println("Minimum: "+Statistics.getMin(array));
		System.out.println("Maximum: "+Statistics.getMax(array));
		System.out.println("Mean: "+Statistics.getMean(array));
		System.out.println("Median: "+Statistics.getMedian(array));
		System.out.println("Standard Deviation: "+Statistics.getStdDev(array));
		System.out.println("Mode: "+Statistics.getMode(array));	
	}
}		