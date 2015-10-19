//Anthony Urena
//au2172
//Instructor - subclass inherits from person for instructor constructor

public class Instructor extends Person {
	
	//variable initialization
	private int salary;
	
	//constructor
	public Instructor(String name, int year, int salary) {
		super(name, year);
		this.salary = salary;
	}
	
	//helper methods
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	
	//converts contents of instructor object to string
	public String toString() {
		String n = super.getName();
		int y = super.getYear();
		return "Name: " + n + " Birth Year: " + y + " Salary: " + salary;
	}
}