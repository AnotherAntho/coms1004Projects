//Anthony Urena
//au2172
//Person - super class with Person constructor

public class Person {
	
	//variable initialization
	private String name;
	private int year;
	
	//person constructor	
	public Person(String name, int year){ //constructor
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
	
	//converts contents of person objects to string
	public String toString(){
		return "Name: " + name + " Birth Year: " + year;
	}
}	
	
