package OOP;

import java.util.Scanner;

// The Scanner class is used to get user input, and it is found in the java.util package.

// To use the Scanner class, create an object of the class and use any of the available methods 
// found in the Scanner class documentation. In our example, we will use the nextLine() method, 
// which is used to read Strings

// To read other types, visit : https://www.w3schools.com/java/java_user_input.asp

public class UserInput {
     public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
    // for other types :
    System.out.println("Enter name, age and salary:");

    // String input
    String name = myObj.nextLine();

    // Numerical input
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}
// Note: If you enter wrong input (e.g. text in a numerical input), 
//  you will get an exception/error message (like "InputMismatchException").