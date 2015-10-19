//Anthony Urena
//au2172
//Person2 - parent class for Person2 constructor with comparable interface 

public class Person2 implements Comparable<Person2> {
	
	//variable initialization
	private String name;
	private int year;
	
	//constructor	
	public Person2(String name, int year){ //constructor
		this.name=name;
		this.year=year;
	}
	
	//helper methods
	public void setName(String name) {
		this.name=name;
	}	
	public void setYear(int year) {
		this.year=year;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	
	//converts contents of person2 object to string
	public String toString() {
		return "Name: " + name + " Birth Year: " + year;
	}
	
	//allows for comparison of Person2 objects based on year of birth
	public int compareTo(Person2 other) {
		if(year < other.year) {
			return -1;
		}else if(year > other.year) {
			return 1;
		}else{
			return 0;
		}
	}		
}	