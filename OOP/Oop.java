package OOP;

public class Oop {
    int x = 5;
    public static void main(String[] args) {
        // OOP stands for Object-Oriented Programming.

        // Procedural programming is about writing procedures or methods that perform operations
        //  on the data, while object-oriented programming is about creating objects that contain
        //   both data and methods.

        // Object-oriented programming has several advantages over procedural programming:

        //     OOP is faster and easier to execute
        //     OOP provides a clear structure for the programs
        //     OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier
        //      to maintain, modify and debug
        //     OOP makes it possible to create full reusable applications with less code and shorter 
        //     development time

        // Tip: The "Don't Repeat Yourself" (DRY) principle is about reducing the repetition of code. 
        // You should extract out the codes that are common for the application, and place them at a 
        // single place and reuse them instead of repeating it.

        // What are Classes and Objects?

        // Classes and objects are the two main aspects of object-oriented programming.
        // a class is a template for objects, and an object is an instance of a class.
        // When the individual objects are created, they inherit all the variables and methods from the class.

        // A Class is like an object constructor, or a "blueprint" for creating objects.
        // ** To create a class, use the keyword class

        //  ** a class should always start with an uppercase first letter, and that the name of the java file should match the class name.

        // To create an object of Oop, specify the class name, followed by the object name, and use the keyword new
        Oop ins = new Oop();
        System.out.println("The value of X in Main method : " + ins.x);

        // You can create multiple objects of one class:
        Oop obj1 = new Oop(); // Object 1
        Oop obj2 = new Oop(); // Object 2
        System.out.println("The value of X in Main method : " + obj1.x);
        System.out.println("The value of X in Main method : " + obj2.x);

    }
    
}
