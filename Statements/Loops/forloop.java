package Statements.Loops;

public class forloop {
    public static void main(String[] args) {
        // When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop
        // Statement 1 is executed (one time) before the execution of the code block.
        // Statement 2 defines the condition for executing the code block.
        // Statement 3 is executed (every time) after the code block has been executed.
        // The example below will print the numbers 0 to 4:
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
          }
          
        // It is also possible to place a loop inside another loop. This is called a nested loop.
        // The "inner loop" will be executed one time for each iteration of the "outer loop":
        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times
            
            // Inner loop
            for (int j = 1; j <= 3; j++) {
            System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        } 
        // There is also a "for-each" loop, which is used exclusively to loop through elements in an array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
    
}
