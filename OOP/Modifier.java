package OOP;

public class Modifier {
    final int x = 10;
    final double PI = 3.14;
    // access modifier, meaning that it is used to set the access level for classes, attributes, methods and constructors.
    // The public keyword is an access modifier

    // We divide modifiers into two groups:
    // Access Modifiers - controls the access level
    // Non-Access Modifiers - do not control access level, but provides other functionality

    // If you don't want the ability to override existing attribute values, declare attributes as final

    // Static
    // A static method means that it can be accessed without creating an object of the class, unlike public

    // An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass
    // public abstract void study(); // abstract method

    public static void main(String[] args) {
        Modifier newobj = new Modifier();
        // newobj.x = 50; // will generate an error: cannot assign a value to a final variable
        // newobj.PI = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(newobj.x);
    }
    //  more on : https://www.w3schools.com/java/java_modifiers.asp
}
