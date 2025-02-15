
package myfirstapp;

import java.util.Scanner;

public class MyFirstApp {

    public static void main(String[] args) {
           
    
        // var
        int age;
        
        Scanner read = new Scanner(System.in);
        System.out.print("Input your age: ");
        
        age = read.nextInt();
       
       
        
        
        
//       System.out.print("Hello world!");
       System.out.print("You are "+age+"yrs old!");
       
       display();      // We have called the method here (in the main method) for execution
       
    
    }
    
    static void display(){
        System.out.println("Welcome to java :)");
        //This method has to be called in the main method for it to be executed
    }
    
}

// VARIABLES $ CONSTATNTS IN JAVA

/*
A VAR is a named data location in a computer memory.

VAR declaration
- Specifies the name and type of the var
SYNTAX( Datatype then Var name then close with a semicolon)

EXAMPLES
int age;
string stdNo;
char grade;


VAR INITIALIZATION
This is assigning a value to a var
SYNTAX (Datatype Varname=Value)

int age = 18;

-Vars are temporal


CONSTANTS
-Contents don't change

Definition





SCANNER CLASS READS USER INPUT


*/




// QUIZ 
/*
1. Rules for naming java identifiers (classes, vars, methods, arrays...)

*/