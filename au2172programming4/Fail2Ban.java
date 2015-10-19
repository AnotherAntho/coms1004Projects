/*Anthony Urena
*au2172
*Fail2Ban - Checks a login log and creates ban file listing IP addresses with 3 or more failed attempts*/
import java.util.Scanner; 
import java.util.ArrayList;
import java.util.Collections;
import java.io.File; 
import java.io.PrintWriter; 
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Fail2Ban {

	public static final void main(String[] args) {

		//Allows passing of log file through command line
		String fileName = args[0]; 
		File inputFile = new File(fileName);
		
		//ArrayLists used to store invalid IP addresses
		ArrayList<String> invalids = new ArrayList<String>();
		ArrayList<String> invalids2 = new ArrayList<String>();
		
		//Creates output file with name ban.txt
		String outputFile = "ban.txt";
		
		//PrintWriter object allowing printing to output file
		PrintWriter out = null;
		try {
			out = new PrintWriter(outputFile);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found.");
		}
		
		//Primary algorithm searches for invalid IP and writes to ban.txt
		Scanner in = null;
		try {
			//populates ArrayList with all invalid IP addresses
			in = new Scanner(inputFile);
			String pattern = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
			while(in.hasNextLine()) {
				String line = in.nextLine();
				StringTokenizer t = new StringTokenizer(line);
				while(t.hasMoreTokens()) {
					String val = t.nextToken();
					if(val.equals("Invalid")){
						String[] parts = line.split(" Invalid ");
						String half = parts[1];
						StringTokenizer t2 = new StringTokenizer(half);
						while(t2.hasMoreTokens()) {
							String ip = t2.nextToken();
							if(ip.matches(pattern)) {
								invalids.add(ip);
							}
						}
				 	}
				 }				
			}
			Collections.sort(invalids);
			//populates a second ArrayList with invalid IP with 3+ attempts
			for(String s: invalids) {
				int num = Collections.frequency(invalids, s);
				if(num >= 3) {
					invalids2.add(s);
				}		
			}
			//Removes duplicates and writes IPs to ban.txt
			Set<String> set = new HashSet<String>(invalids2);
			for(String s: set) {
				out.println(s);
			}		
			out.close(); 
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found.");
		}		
	}
}