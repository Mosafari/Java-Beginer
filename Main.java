
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
  }
}