//Anthony Urena
//au2172
//PersonTester - tester class that implements Person, Student, and Instructor 

public class PersonTester {

	public static final void main(String[] args) {
	
	//instantiation of person, student, and instructor objects
	Person a = new Person("Lisa", 1990);
	Student b = new Student("Harold", 1995, "Sociology");
	Instructor c = new Instructor("Elizabeth", 1958, 97800);
	
	//prints contents of objects
	System.out.println(a.toString());
	System.out.println(b.toString());
	System.out.println(c.toString());
	
	//tests the modification of specific parameters in each object
	System.out.println("Original Major: " + b.getMajor());
	b.setMajor("Computer Science");
	System.out.println("Updated Major: " + b.getMajor());
	
	System.out.println("Original Salary: " + c.getSalary());
	c.setSalary(40000);
	System.out.println("Updated Salary: " + c.getSalary());
	
	//demonstrates legality of assigning super class to subclass
	Person x;
	x = b;
	x.setName("Cayetano");
	x.setYear(1975);
	System.out.println(x.toString());
	System.out.println(b.toString());
	}	
}