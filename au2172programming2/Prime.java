//Anthony Urena
//au2172
/*Prime.java - Uses a static method to determine whether or not 
an integer is Prime and prints out result on several test values*/

public class Prime {
	//Main method for Prime class
	public static final void main(String[] args) {	
		//Sample hardcoded values for testing
		int a = 13;
		int b = 4;
		int c = 5;
		int d = 2;
		int e = -8;
		//Print statements for testing
		System.out.println(" "+truePrime(a)+" for "+a);
		System.out.println(" "+truePrime(b)+" for "+b);
		System.out.println(" "+truePrime(c)+" for "+c);
		System.out.println(" "+truePrime(d)+" for "+d);
		System.out.println(" "+truePrime(e)+" for "+e);		
	}	
	//Static prime checking method where true=prime and false=not prime
	public static final boolean truePrime(int n) {
		if(n <= 0) {
			return false;
		}
		for(int i=2; i<=2 && i<=Math.floor(Math.sqrt(n)); i++) {
			if(n%2 == 0) { 
				return false;
			}	
		}
		return true;					
	} 		
}