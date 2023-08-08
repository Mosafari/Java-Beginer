
public class Main {
  public static void main(String[] args) {
    String name = "John";
    System.out.println(name);
    int myNum = 15;
    System.out.println(myNum);
    int myNum2;
    myNum2 = 15;
    System.out.println(myNum2);
    myNum = 20;  // myNum is now 20
    System.out.println(myNum);
    // final int myNum = 15;
    // myNum = 20;  // will generate an error: cannot assign a value to a final variable
    // Other Types
    // float myFloatNum = 5.99f;
    // char myLetter = 'D';
    // boolean myBool = true;
    // String myText = "Hello";

    String firstName = "John ";
    String lastName = "Doe";
    String fullName = firstName + lastName;
    System.out.println(fullName);
    System.out.println("John "+ lastName);

    int x = 5;
    int y = 6;
    System.out.println(x + y); // Print the value of x + y

    // Declare Many Variables
    int a = 5, b = 6, c = 50;
    System.out.println(a + b + c);
    int f, e, d;
    f = e = d = 50;
    System.out.println(e + f + d);

    // The byte data type can store whole numbers from -128 to 127.
    byte byt = 100;
    System.out.println(byt);

    // The short data type can store whole numbers from -32768 to 32767:
    short sht = 5000;
    System.out.println(sht);

    // The int data type can store whole numbers from -2147483648 to 2147483647.
    int it = 100000;
    System.out.println(it);

    // The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. 
    // ** Note that you should end the value with an "L"
    long lng = 15000000000L;
    System.out.println(lng);

    //  float & double can also be a scientific number with an "e" to indicate the power of 10
    float f1 = 35e3f;
    double d1 = 12E4d;
    System.out.println(f1);
    System.out.println(d1);

    //  boolean
    boolean isJavaFun = true;
    boolean isFishTasty = false;
    System.out.println(isJavaFun);     // Outputs true
    System.out.println(isFishTasty);   // Outputs false



  }
}