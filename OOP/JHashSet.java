package OOP;

import java.util.HashSet; // Import the HashSet class

import javax.print.attribute.standard.MediaSize.Other;

// A HashSet is a collection of items where every item is unique, and it is found in the java.util package
public class JHashSet {
    public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    // The HashSet class has many useful methods. For example, to add items to it, use the add() method
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    // even though BMW is added twice it only appears once in the set because every item in a set has to be unique.
    cars.add("Mazda");
    System.out.println(cars);

    // To check whether an item exists in a HashSet, use the contains() method
    System.out.println(cars.contains("Mazda"));

    // To remove an item, use the remove() method:
    cars.remove("Volvo");
    System.out.println(cars);
    // To remove all items, use the clear() method:
    // cars.clear();

    // To find out how many items there are, use the size method:
    System.out.println(cars.size());

    // Loop through the items of an HashSet with a for-each loop:
    for (String i : cars) {
        System.out.println(i);
      }

    // Other Types
    // Items in an HashSet are actually objects. In the examples above, we created items (objects) 
    // of type "String". Remember that a String in Java is an object (not a primitive type). To 
    // use other types, such as int, you must specify an equivalent wrapper class: Integer. For 
    // other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
    // Create a HashSet object called numbers
    HashSet<Integer> numbers = new HashSet<Integer>();

    // Add values to the set
    numbers.add(4);
    numbers.add(7);
    numbers.add(8);

    // Show which numbers between 1 and 10 are in the set
    for(int i = 1; i <= 10; i++) {
      if(numbers.contains(i)) {
        System.out.println(i + " was found in the set.");
      } else {
        System.out.println(i + " was not found in the set.");
      }
    }
  }
}
