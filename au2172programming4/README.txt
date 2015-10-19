//Anthony Urena
//au2172
//README.txt - A readme file that explains how to compile and run PHW4

---
INTRODUCITON
---

The current directory, au2172programming4, contains two files: Fail2Ban.java and README.txt Fail2Ban.java is a java source file containing code for a program. README.txt is a text document which explains the content of the directory and how to run and compile Fail2Ban.java

---
JAVA SOURCE FILES
---

1.Fail2Ban.java contains the Java code for a program that detects invalid IP addresses from a log file of attempted logins. Specifically, Fail2Ban takes as a command line argument a single log file, opens and reads that file, detects IP addresses that have failed 3 or more times to login, and then writes those IP addresses to an output text file called ban.txt. The program makes use of try/catch statements to handle FileNotFound exceptions. 

---
COMPILING AND RUNNING
---

Several steps must be taken to create and run this program. Java source code must first be written in a text editor of the programmer's choosing. After java code has been written in an appropriate text editor, it must be saved as a .java file. Once that file is created, it must then be compiled into machine code using the javac command. This creates a class file, which can then be run in a terminal using the java command. 

As Fail2Ban takes a command line argument, running this program is slightly different than usual.

The following steps will guide you through the process. 

See below for a step-by-step guide for Mac OSX using Fail2Ban as an example.

1. Open the Terminal app
2. Login to Cunix using uni and password
3. Create a new java source file for Fail2Ban by typing

pico Prime.java

4. You are now in the pico text editor. Enter your source code here
5. Save your file and exit out of the pico editor
6. Compile your java source file by typing

javac Fail2Ban.java

7. If all has gone well, you have created a Fail2Ban.class file. If compile time errors appear, reopen your Fail2Ban.java file with pico and make the proper edits. You can do this by typing

pico Fail2Ban.java

8. Once your file is compiled, run the program by typing

java Fail2Ban /*NAME OF TEXT FILE*/

For the purpose of example, let us use logs_processed.txt as the text file

You would run your program as such

java Fail2Ban logs_processed.txt

9. Test your program to make sure it works properly
10. In the event of any runtime errors, make sure to make edits by opening Fail2Ban.java with pico and recompiling again with javac.

I hope you find this guide informative. Enjoy and code on!