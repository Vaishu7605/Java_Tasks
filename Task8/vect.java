
import java.util.List;
import java.util.Vector;

public class vect {

    public static void main(String[] args) {
        // Create a Vector of integers
        Vector<Integer> vector = new Vector<>();

        // Add elements 1 through 10 to the Vector
        for (int i = 1; i <= 10; i++) {
            vector.add(i);
        }

        // Create a sublist view of elements from index 3 to 7
        List<Integer> sublist = vector.subList(3, 8);

        // Modify an element in the sublist
        sublist.set(2, 100); // Modify the element at index 2 in the sublist

        // Print both the sublist and the original Vector
        System.out.println("Original Vector: " + vector);
        System.out.println("Sublist: " + sublist);
    }
}
