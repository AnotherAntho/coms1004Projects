//Anthony Urena
//au2172
//Student2 - subclass for Student2 constructor

public class Student2 extends Person2 {
	
	//variable initialization
	private String major;
	
	//Student2 constructor
	public Student2(String name, int year, String major) {
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
	
	//converts contents of Student2 objects to string
	public String toString() {
		String n = super.getName();
		int y = super.getYear();
		return "Name: " + n + " Birth Year: " + y + " Major: " + major;
	}
}