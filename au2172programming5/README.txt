//Anthony Urena
//au2172
//README.txt - readme for files associated with final COMS1004 assignment

---
INTRODUCTION
---

The current directory, au2172homework5, contains 9 files: 7 java source files( Person.java, Student.java, Instructor.java, PersonTester.java, Person2.java, Student2.java, Person2Tester.java) and 2 text documents (written.txt, and the current README.txt). The various java source files are used in solving the problems assigned in homework #5. The written.txt file contains the answers to the written portion of the assignment, as well as a link to the author's curated website. Beyond introducing the aforementioned files, the current README.txt explains how to run and compile all of the java source files.

---
JAVA SOURCE FILES
---

1. Person.java, Student.java, Instructor.java, and PersonTester.java are all java source files associated with problem 4 of the homework assignment. The first three files are all constructor classes that are then implemented and tested in PersonTester.java. Person is a super class and Student and Instructor are subclasses that inherit behavior from Person. Person constructs a person with a name and year of birth, while Student adds a major of study to that identity and Instructor adding a salary instead. PersonTester demonstrates the creation of Person, Student, and Instructor objects and the modification of their parameters and values in order to demonstrate how inheritance works in Java.

2. Person2.java, Student2.java, and PersonTester2.java are all java source files associated with problem 5 of the homework assignment. Similar to problem 4, Person2 is a super class and Student2 is a subclass. Person2 implements the comparable interface to allow for comparison on the year of birth of individuals represented by Person2 objects. Since Student2 extends Person2, this comparison extends to this class as well. PersonTest2 demonstrates this by creating an arraylist of Student2 objects and sorting them in increasing-order based on year of birth.

---
TEXT FILES
---

1. written.txt is a simple text document containing answers to the first two problems in the homework assignment. It also contains a link to a website coded in HTML and CSS.

---
COMPILING AND RUNNING
---

Several steps must be taken to create and run this program. Java source code must first be written in a text editor of the programmer's choosing. After java code has been written in an appropriate text editor, it must be saved as a .java file. Once that file is created, it must then be compiled into machine code using the javac command. This creates a class file, which can then be run in a terminal using the java command. 

The java source files in this directory make use of inheritance and so it is important that the parent class be compiled before the subclass. The tester class can be used to ensure that all classes are compiled, running, and interacting properly.

The following steps will guide you through the process. 

See below for a step-by-step guide for Mac OSX using Person2Tester as an example. The following guide presumes that Person2.java and Student2.java have been written and compiled already and are housed within the same directory as Person2Tester.

1. Open the Terminal app
2. Login to Cunix using uni and password
3. Create a new java source file for Person2Tester by typing

pico Person2Tester.java

4. You are now in the pico text editor. Enter your source code here
5. Save your file and exit out of the pico editor
6. Compile your java source file by typing

javac Person2Tester.java

7. If all has gone well, you have created a Person2Tester.class file. If compile time errors appear, reopen your Person2Tester.java file with pico and make the proper edits. You can do this by typing

pico Person2Tester.java

8. Once your file is compiled, run the program by typing

java Person2Tester

9. Test your program to make sure it works properly
10. In the event of any runtime errors, make sure to make edits by opening Person2Tester.java with pico and recompiling again with javac.

I hope you find this guide informative. Enjoy and code on!