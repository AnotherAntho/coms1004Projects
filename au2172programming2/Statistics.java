//Anthony Urena
//au2172
/*Statistics.java - a class containing static methods that can
be used for statistics calculations on an array of doubles*/

import java.util.Scanner;
import java.util.Arrays;

public class Statistics {
	//calculates minimum value of an array of doubles
	public static double getMin(double[] array) {
		double minSoFar = array[0];
		for(int i=1; i < array.length; i++) {
			if(array[i] < minSoFar) {
				minSoFar = array[i];
			}
		}
		return minSoFar;
	}
	//calculates maximum value of an array of doubles
	public static double getMax(double[] array) {
		double maxSoFar = array[0];
		for(int i=1;i < array.length; i++) {
			if(array[i] > maxSoFar) {
				maxSoFar = array[i];
			}
		}
		return maxSoFar;
	}
	//calculates the mean of an array of doubles
	public static double getMean(double[] array) {
		double sum = 0;
		for(double value : array) {
			sum += value;
		}
		return ((double)(sum/array.length));	
	}
	
	//calculates median value in an array of doubles
	public static double getMedian(double[] array) {
		Arrays.sort(array);
		int a = (array.length/2)-1;
		int b = (array.length/2);
		double medAvg = (array[a] + array[b] )/ 2;
		double med = array[array.length/2];
		if((array.length % 2)!=0) {
			return med;
		}else {
			return medAvg;
		}	
	}
	//calculates the population standard deviation of an array
	public static double getStdDev(double[] array) {
		double sd = 0;
		for(int i=0; i < array.length; i++) {
			sd+=((array[i]-getMean(array))*(array[i]-getMean(array)))/array.length;
		}
		double stanDev = Math.sqrt(sd);
		return stanDev;
	}
	//calculates the mode of an array of doubles
	public static double getMode(double[] array) {
		//algorithm for sorting an unsorted array
		for(int i=0; i<array.length; i++) {
			double temp = array[i];
			int j = i - 1;
			while(j>=0 && array[0]>temp) {
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = temp;
		}
		//algorithm for finding mode using newly sorted array
		double mode = array[0];
    	int t = 1;
    	int t2 = 1;
    	for(int i=1;i<array.length;i++) {
    		//conditional that checks for repeating value
        	if(array[i-1] == array[i]){
            	t++;
        	}else {
            t=1;
        	}
        	//conditional that stores mode to be returned once it is identified
			if(t>=t2) {
            mode = array[i];
        	t2 = t;
        	}
        }
    return mode;	
	}						
}