//Anthony Urena
//au2172
//Person2Tester - tester class to create & populate arraylist with Student2 obj

import java.util.ArrayList;
import java.util.Collections;

public class Person2Tester {

	public static final void main(String[] args) {
	
	//creates arraylist for student2 objects and populates it
	ArrayList<Student2> students = new ArrayList<Student2>();
	students.add(new Student2("Jacob", 1989, "Math"));
	students.add(new Student2("Dialika", 1990, "Sociology"));
	students.add(new Student2("Dan", 1985, "Economics"));	
	
	//sorts arraylist
	Collections.sort(students);
	
	//prints contents of arraylist 
	for(Student2 s: students){
		System.out.println(s.toString());
	}	
	}
}