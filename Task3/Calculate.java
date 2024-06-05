// 4. Create a class name Calculator which will add, subtract, multiply and divide. 

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculate the numbers");
        System.out.println("Enter the first number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter the second number: ");
        float num2 = sc.nextFloat();
        System.out.println("Add the number: " + (num1 + num2));
        System.out.println("Subtract the number: " + (num1 - num2));
        System.out.println("Multiply the number: " + (num1 * num2));
        System.out.println("Divide number: " + (num1 / num2));

    }
}
