//Anthony Urena
//au2172
//Student - subclass inherits from person for student constructor

public class Student extends Person {
	
	//variable initialization
	private String major;
	
	//constructor
	public Student(String name, int year, String major) {
		super(name, year);
		this.major = major;
	}
	
	//helper methods
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMajor() {
		return major;
	}
	
	//converts contents of Student object to string	
	public String toString() {
		String n = super.getName();
		int y = super.getYear();
		return "Name: " + n + " Birth Year: " + y + " Major: " + major;
	}
}