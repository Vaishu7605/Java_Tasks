// 1. Create a class named Person with attributes name 
// and age. Use Scanner to get user input for a name 
// and age, then create a Person object and greet the 
// user by name and age. 

// import java.util.io;
import java.util.Scanner;

public class Person {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is : " + name);

        System.out.println("enter your age: ");
        String age = sc.nextLine();
        System.out.println("Your name is : " + age);
    }
}
