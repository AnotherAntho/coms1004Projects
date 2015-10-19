//Anthony Urena
//au2172
//README.txt - a README file explaining how to compile and run programs for PHW2

---
INTRODUCTION
---
The current directory, au2172programming3, contains five files: Prime.java,
Statistics.java, StatisticsTester.java, RockPaperScissors.java and the current README.txt. The current README.txt is a text file that explains the contents of the directory and how to compile and run programs. The other four files are java source files that contain Java code for diverse programs. 

---
JAVA SOURCE FILES
---

1. Prime.java contains the Java code for a program that determines whether or not a number is Prime. The program consists of a main method and a static method. The static method consists of an algorithm that takes an integer, determines if it is prime or not, and returns a boolean value (true or false) corresponding to whether or not the value is prime. The main method allows for the testing of this static method by calling it and passing severe hardcoded values. The main method is currently set up to print whether the given value is prime(true) or not(false). This program can be written in a text editor, saved as a .java file, and then compiled and run in a terminal environment or IDE.

2. Statistics.java contains the Java code for several statics methods that calculate various statistics for an array of doubles. Specifically, Statistics.java contains static methods for calculating the minimum, maximum, mean, median, standard deviation, and mode of an array of doubles. Each of these static methods take an array of doubles and return a double. Statistics.java DOES NOT contain a main method. As such, while Statistics.java can be written in a text editor, saved as a .java file, and then compiled into a .class file, it can not be run (the JVM will return an error message proclaiming the lack of a main method). Instead, Statistics.java serves to store various static methods that can be called upon by other classes at the appropriate time.

3. StatisticsTester.java contains the Java code for a program with a main method that takes user input (the number of doubles within the array to determine the array's size, and then the actual doubles themselves) to create an array of doubles. The program's main method then calls on the static methods from Statistics and passes this newly created array to them. This allows the program to print out the summary statistics of the user-created array of doubles. Because of this interaction between class, it is very important to first compile Statistics.java with "javac Statistics.java" first. After the Statistics class has been created, StatisticsTester.java can be compiled with "javac StatisticsTester.java" and then run with "java StatisticsTester." This will initiate the program's request of user input and its output of the relevant statistics that are calculated courtesy of Statistics.

4. RockPaperScissors.java contains the Java code for a game of Rock Paper Scissors between the user and a computer AI. The program consists of a main method that makes extensive use of while loops to code the game. After RockPaperScissors.java is compiled and run, the program will prompt the user to enter their choice: 0 for Rock, 1 for Paper, and 2 for Scissors. Once the user makes a choice, the program randomly generates a choice for the computer opponent. The program then compares the user and computer choices to determine who is the winner of the round. Paper beats Rock, Rock beats Scissors, and Scissors beat Paper. 1 point is given to either the user or computer if they win, and 0 points are awarded when there is a draw. These points are added to a scoreboard of sorts that is printed to show the current scores before each round. The game ends when either the user or computer reaches a total of 10 points. This causes the program to exit out. 

---
GENERAL WRITING, COMPILING, AND RUNNING
---
Several steps must be taken to create and run these programs. Java source code must first be written in a text editor of the programmer's choosing. After java code has been written in an appropriate text editor, it must be saved as a .java file. Once that file is created, it must then be compiled into machine code using the javac command. This creates a class file, which can then be run in a terminal using the java command. 
1. Open the Terminal app
2. Login to Cunix using uni and password
3. Create a new java source file for Problem1 by typing

pico Prime.java

4. You are now in the pico text editor. Enter your source code here
5. Save your file and exit out of the pico editor
6. Compile your java source file by typing

javac Prime.java

7. If all has gone well, you have created a Problem1.class file. If compile time errors appear, reopen your Problem1.java file with pico and make the proper edits. You can do this by typing

pico Prime1.java

8. Once your file is compiled, run the program by typing

java Prime1

9. Test your program to make sure it works properly
10. In the event of any runtime errors, make sure to make edits by opening Problem1.java with pico and recompiling again with javac.

I hope you find this guide informative. Enjoy and code on!