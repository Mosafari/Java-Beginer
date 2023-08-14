package OOP;

public class Main {
    int x = 5;
    // You can also create an object of a class and access it in another class.
    //  This is often used for better organization of classes (one class has all the attributes and
    //   methods, while the other class holds the main() method (code to be executed)).
    // Remember that the name of the java file should match the class name.

    // ** class attributes are variables within a class
    int y = 3; // an attribute
    //  ** Another term for class attributes is fields.

    // You can access attributes by creating an object of the class, and by using the dot syntax (.)

    int z;
    final int s = 5;
    public static void main(String[] args) {
        Main obj1 = new Main();
        System.out.println(obj1.x); // 5

        // You can also modify attribute values Or override existing values
        obj1.z = 10;
        obj1.x = 25;
        System.out.println(obj1.x); // 25
        System.out.println(obj1.z); // 10

        // If you don't want the ability to override existing values, declare the attribute as final
        // obj1.s = 21; // will generate an error: cannot assign a value to a final variable

        // The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).
        // The final keyword is called a "modifier".

        // If you create multiple objects of one class, you can change the attribute values in one object, without 
        // affecting the attribute values in the other.

        Main obj2 = new Main(); // new object
        obj2.x = 567;
        System.out.println(obj2.x); // 567
        System.out.println(obj1.x); // 25

        // also You can specify as many attributes as you want

    }


}
