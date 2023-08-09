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
            // There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.
            age = 18;
            String result = (18 <= age  && age < 100) ? "You are old enough!" : "You are not old enough!";
            System.out.println(result);
         }
}
