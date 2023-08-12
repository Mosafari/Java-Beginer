package Statements;

public class methods {
    static void myMethod() {
            System.out.println("I just got executed!");
        }

    static void wakeup(String fname) {
        System.out.println("bidar shoo " + fname);
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

    }
    
}
