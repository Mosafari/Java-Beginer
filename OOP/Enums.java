package OOP;

// An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

// To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma.
//  Note that they should be in uppercase letters:

enum Level {
    LOW,
    MEDIUM,
    HIGH
  }
  
public class Enums {
    enum Bin{
        TRUE,
        FALSE
    }
    public static void main(String[] args) {
        // You can access enum constants with the dot syntax:
        Level myVar = Level.MEDIUM; 
        // Enum is short for "enumerations", which means "specifically listed".
        // You can also have an enum inside a class:
        Bin bin = Bin.TRUE;
        System.out.println(myVar);
        System.out.println(bin);
        // Enums are often used in switch statements to check for corresponding values
        switch(bin){
            case TRUE :
                System.out.println("it's True!");
                break;
            case FALSE :
                System.out.println("it's False!");
                break;
        }
        // The enum type has a values() method, which returns an array of all enum constants.
        //  This method is useful when you want to loop through the constants of an enum:
        for (Level myVar2 : Level.values()) {
            System.out.println(myVar2);
          }
          
    }
}

// Difference between Enums and Classes
//     An enum can, just like a class, have attributes and methods. The only difference is that enum 
//     constants are public, static and final (unchangeable - cannot be overridden).
//     An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).
//     Why And When To Use Enums?
//     Use enums when you have values that you know aren't going to change, 
//     like month days, days, colors, deck of cards, etc.
