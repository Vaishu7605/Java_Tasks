
import java.util.ArrayList;

public class arraylist {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add some elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        fruits.add(1, "Orange");
        fruits.remove("Orange");

        // Use the size() method to get the number of elements in the ArrayList
        int numberOfFruits = fruits.size();
        System.err.println("--------------------add Element------------------");
        System.out.println("Fruits in the list: " + fruits);
        // Print the size of the ArrayList
        System.err.println("----------------------size of array--------------------");
        System.out.println("Number of fruits in the list: " + numberOfFruits);
    }
}
