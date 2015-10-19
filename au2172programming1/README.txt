//Anthony Urena
//au2172
//README.txt - Describes files in directory and explains how to compile and run programs

The current directory, au2172programming1, contains four files: Problem1.java,
Problem2.java, DegreeConverter.java and the current README.txt. The current
README.txt is a text file that explains the contents of the directory and how to compile
and run programs. The other three files are java source files that contain Java code for
diverse programs. 

Specifically:

1. Problem1.java contains Java code for a program that calculates and displays the day and
month of Easter in a given year. The program takes one input in the form of the desired
Easter year (in the YYYY format), calculates the appropriate date of Easter (in Day/Month
format), and prints out the date of Easter for the input year.

2. Problem2.java contains Java code for a program that calculates and displays the amount
of change a customer should receive after a monetary transaction. The program provides
dollar and coin (quarters, dimes, nickels, and pennies) breakdowns for the user to give
to the customer. The program takes two inputs: the price to be paid in pennies and the 
amount of money given by the customer in pennies. The program also accounts for situations
when not enough money is provided by the customer and when exact change is provided, 
printing appropriate messages to note that fact.

3. DegreeConverter.java contains Java code for a program that converts temperature values
from degrees Fahrenheit to degrees Celsius, and vice versa. The program takes two inputs:
the desired conversion (denoted by either 1 for Fahrenheit to Celsius or 2 for Celsius to 
Fahrenheit), and the numerical temperature value to be converted. The program first asks
the user for the direction of the conversion and then prompts the user for the temperature
value to be converted. The program then performs the appropriate calculations and displays
the temperature in the desired converted units. The program also checks for invalid inputs
and displays an error message to note that.

Several steps must be taken to create and run these programs. Java source code must first
be written in a text editor of the programmer's choosing. After java code 
has been written in an appropriate text editor, it must be saved as a .java file. 
Once that file is created, it must then be compiled into machine code using the javac
command. This creates a class file, which can then be run in a terminal using the java
command. See below for a step-by-step guide for Mac OSX using Problem1 as an example.

1. Open the Terminal app
2. Login to Cunix using uni and password
3. Create a new java source file for Problem1 by typing

pico Problem1.java

4. You are now in the pico text editor. Enter your source code here
5. Save your file and exit out of the pico editor
6. Compile your java source file by typing

javac Problem1.java

7. If all has gone well, you have created a Problem1.class file. If compile time errors
appear, reopen your Problem1.java file with pico and make the proper edits. You can do
this by typing

pico Problem1.java

8. Once your file is compiled, run the program by typing

java Problem1

9. Test your program to make sure it works properly
10. In the event of any runtime errors, make sure to make edits by opening Problem1.java
with pico and recompiling again with javac

I hope you find this guide informative. Enjoy and code on!

