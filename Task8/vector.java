
import java.util.Vector;

public class vector {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

        vector.add(2, 25);

        vector.remove(3);

        int elementAtIndex1 = vector.get(1);

        int size = vector.size();
        int capacity = vector.capacity();

        System.out.println("Vector elements: " + vector);
        System.out.println("Element at index 1: " + elementAtIndex1);
        System.out.println("Size of the Vector: " + size);
        System.out.println("Capacity of the Vector: " + capacity);
    }
}
