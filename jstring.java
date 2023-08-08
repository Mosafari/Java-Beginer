public class jstring {
  public static void main(String[] args) {
    // A String in Java is actually an object, which contain methods that can perform
    //  certain operations on strings. For example, the length of a string can be found with the length() method:
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length());

    String txt2 = "Hello World";
    System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
    System.out.println(txt2.toLowerCase());   // Outputs "hello world"

    String txt3 = "Please locate where 'locate' occurs!";
    System.out.println(txt3.indexOf("locate")); // Outputs 7

    // The + operator can be used between strings to combine them. This is called concatenation:
    String firstName = "John";
    String lastName = "Doe";
    System.out.println(firstName + " " + lastName);

    // You can also use the concat() method to concatenate two strings:
    System.out.println(firstName.concat(lastName));

    //  adding two var (str , int)
    int x = 10;
    int y = 20;
    int z = x + y;  // z will be 30 (an integer/number)

    String x2 = "10";
    String y2 = "20";
    String z2 = x2 + y2;  // z will be 1020 (a String)

    String x3 = "10";
    int y3 = 20;
    String z3 = x3 + y3;  // z will be 1020 (a String)



  }
}