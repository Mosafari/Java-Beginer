package OOP;

import java.time.LocalDate; // import the LocalDate class
import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.LocalTime; // import the LocalTime class
import java.time.format.DateTimeFormatter;

// Java does not have a built-in Date class, but we can import the java.
// time package to work with the date and time API. The package includes many date and time classes.


public class JavaDateTime {
    public static void main(String[] args) {
    // To display the current date, import the java.time.LocalDate class, and use its now() method
    LocalDate myObj = LocalDate.now(); // Create a date object
    System.out.println(myObj); // Display the current date

    // To display the current time (hour, minute, second, and nanoseconds), import the java.time.LocalTime class, and use its now() method
    LocalTime myObj2 = LocalTime.now();
    System.out.println(myObj2);

    // To display the current date and time, import the java.time.LocalDateTime class, and use its now() method
    LocalDateTime myObj3 = LocalDateTime.now();
    System.out.println(myObj3);

    // Formatting Date and Time
    // The "T" in the example above is used to separate the date from the time. You can use the DateTimeFormatter 
    // class with the ofPattern() method in the same package to format or parse date-time objects. The following 
    // example will remove both the "T" and nanoseconds from the date-time
    LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println("Before formatting: " + myDateObj);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
  }
}
