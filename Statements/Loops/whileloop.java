package Statements.Loops;

public class whileloop {
    public static void main(String[] args) {
        // Loops can execute a block of code as long as a specified condition is reached.
        // Loops are handy because they save time, reduce errors, and they make code more readable.
        int i = 0;
        while (i < 5) {
        System.out.println(i);
        i++;
        }
        // Note: Do not forget to increase the variable used in the condition, otherwise the loop will never end!
        // Do-While
        // The do/while loop is a variant of the while loop. This loop will execute the code block once, before 
        // checking if the condition is true, then it will repeat the loop as long as the condition is true.
        int j = 0;
        do {
        System.out.println(j);
        j++;
        }
        while (j < 5);
        // ** Do not forget to increase the variable used in the condition, otherwise the loop will never end!
    }
}
