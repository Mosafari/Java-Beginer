package Statements;

public class ifelse {
    public static void main(String[] args) {
        // Java has the following conditional statements:
            // Use if to specify a block of code to be executed, if a specified condition is true
            // Use else to specify a block of code to be executed, if the same condition is false
            // Use else if to specify a new condition to test, if the first condition is false
            // Use switch to specify many alternative blocks of code to be executed
            int age = 15;
            if  (18 <= age  && age < 100) {
                System.out.println("You are old enough!");
            } else if (age < 18 && 0 < age){
                System.out.println("You are not old enough!");
            } else{
                System.out.println("Thats imposible :|");
            }

         }
}
