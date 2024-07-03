
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Comparator;

class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class main {

    public static void main(String[] args) {
        // Creating LinkedList instances
        LinkedList<Person> list1 = new LinkedList<>();
        LinkedList<Person> list2 = new LinkedList<>();

        // Adding Person objects to list1
        list1.add(new Person("Anjali", 30));
        list1.add(new Person("Pushpanjali", 25));
        list1.add(new Person("Piyush", 35));

        // Adding Person objects to list2
        list2.add(new Person("Trapti", 40));
        list2.add(new Person("Manorama", 28));
        list2.add(new Person("Annapurna", 33));

        // Displaying the contents of both lists
        System.out.println("List 1:");
        for (Person p : list1) {
            System.out.println(p);
        }

        System.out.println("\nList 2:");
        for (Person p : list2) {
            System.out.println(p);
        }

        // Merging list2 into list1
        list1.addAll(list2);

        // Sorting the merged LinkedList by age
        Collections.sort(list1, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.age, p2.age);
            }
        });

        // Reversing the sorted LinkedList
        Collections.reverse(list1);

        // Iterating through the LinkedList using an Iterator and printing each Person object
        System.out.println("\nReversed and sorted merged list:");
        ListIterator<Person> iterator = list1.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Checking if the LinkedList contains a Person object with the name "Anjali" and age 30
        Person anjali = new Person("Anjali", 30);
        System.out.println("\nContains Anjali (30): " + list1.contains(anjali));

        // Removing all Person objects where the age is less than 30
        list1.removeIf(person -> person.age < 30);

        // Converting the LinkedList to an array of Person objects and printing each element in the array
        Person[] personArray = list1.toArray(new Person[0]);
        System.out.println("\nLinkedList to Array:");
        for (Person p : personArray) {
            System.out.println(p);
        }

        // Clearing the LinkedList
        list1.clear();
        System.out.println("\nCleared list1, size: " + list1.size());
    }
}
