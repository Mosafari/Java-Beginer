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

  }
}