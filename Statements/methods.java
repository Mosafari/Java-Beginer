package Statements;

public class methods {
    static void myMethod() {
            System.out.println("I just got executed!");
        }
    static int myReturnMethod(int x, int y) {
        return 5 + x;
        }

    static void wakeup(String fname) {
        System.out.println("bidar shoo " + fname);
        }
    static int plusMethod(int x, int y) {
        return x + y;
        }
        
    static double plusMethod(double x, double y) {
    return x + y;
    }
    public static void main(String[] args) {
//         A method is a block of code which only runs when it is called.
//         You can pass data, known as parameters, into a method.
//         Methods are used to perform certain actions, and they are also known as functions.
//         Why use methods? To reuse code: define the code once, and use it many times.

//          A method must be declared within a class. It is defined with the name of the method, 
            // followed by parentheses (). Java provides some pre-defined methods, such as System.out.println(), 
            // but you can also create your own methods to perform certain actions:

            // static void myMethod() {
            //     // code to be executed
            //   }

            
            // myMethod() is the name of the method
            // static means that the method belongs to the Main class and not an object of the Main class. You will learn more about objects and how to access methods through objects later in this tutorial.
            // void means that this method does not have a return value. You will learn more about return values later in this chapter

            // To call a method in Java, write the method's name followed by two parentheses () and a semicolon;
        myMethod();

        // ** A method can also be called multiple times
        myMethod();
        myMethod();

        // Information can be passed to methods as parameter. Parameters act as variables inside the method.
        // Parameters are specified after the method name, inside the parentheses. You can add as many parameters
        //  as you want, just separate them with a comma.
        wakeup("agha reza!!");
        wakeup("reza jan!!");
        // ** When a parameter is passed to the method, it is called an argument.
        //  ** You can have as many parameters as you like
        // Note that when you are working with multiple parameters, the method call must have the same number of arguments as there are parameters,
        //  and the arguments must be passed in the same order.

        // The void keyword, used in the examples above, indicates that the method should not return a value. If you want the method to return a 
        // value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method
        System.out.println(myReturnMethod(5,7));
        // You can also store the result in a variable (recommended, as it is easier to read and maintain)
        int z = myReturnMethod(9,7);
        System.out.println(z);

        // ** also It is common to use if...else statements inside methods

        // With method overloading, multiple methods can have the same name with different parameters
        // Instead of defining two methods that should do the same thing, it is better to overload one. 
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        // Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.
    }
    
}
