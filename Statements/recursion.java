package Statements;

public class recursion {
    public static int sum(int k) {
      if (k > 0) {
        return k + sum(k - 1);
      } else {
        return 0;
      }
    }
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
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
        // ** Halting Condition :
        // Just as loops can run into the problem of infinite looping, recursive functions can run into the problem 
        // of infinite recursion. Infinite recursion is when the function never stops calling itself. Every recursive 
        // function should have a halting condition, which is the condition where the function stops calling itself. 
        // In the previous example, the halting condition is when the parameter k becomes 0.

        // It is helpful to see a variety of different examples to better understand the concept. In this example, the function 
        // adds a range of numbers between a start and an end. The halting condition for this recursive function is when end is 
        // not greater than start:
        result = sum(5, 10);
        System.out.println(result);

        // The developer should be very careful with recursion as it can be quite easy to slip into writing a function which never 
        // terminates, or one that uses excess amounts of memory or processor power. However, when written correctly recursion can 
        // be a very efficient and mathematically-elegant approach to programming.
  }
    
}
