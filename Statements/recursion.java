package Statements;

public class recursion {
    public static int sum(int k) {
      if (k > 0) {
        return k + sum(k - 1);
      } else {
        return 0;
      }
      }
    public static void main(String[] args) {
        // Recursion is the technique of making a function call itself. This technique 
        // provides a way to break complicated problems down into simple problems which are easier to solve.
        // Adding two numbers together is easy to do, but adding a range of numbers is more complicated. In the 
        // following example, recursion is used to add a range of numbers together by breaking it down into the 
        // simple task of adding two numbers:

        int result = sum(10);
    System.out.println(result);
  }
    
}
