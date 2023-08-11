package Statements;


public class arrayj {
    public static void main(String[] args) {
        // Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
        // To declare an array, define the variable type with square brackets
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // You can access an array element by referring to the index number.
        // This statement accesses the value of the first element in cars
        System.out.println(cars[0]);
        // Outputs Volvo
        // Note: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.
        
        // To change the value of a specific element, refer to the index number
        cars[0] = "Opel";
        System.out.println(cars[0]); // Now outputs Opel instead of Volvo

        // To find out how many elements an array has, use the length property:
        System.out.println(cars.length);
        // Outputs 4

        // You can loop through the array elements with the for loop, and use the length property to specify how many times the loop should run.
        // The following example outputs all elements in the cars array:
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
          }

        //   There is also a "for-each" loop, which is used exclusively to loop through elements in arrays:
        for (String i : cars) {
            System.out.println(i);
          }
    }
}