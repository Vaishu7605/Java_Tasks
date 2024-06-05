// 3. Create a class named Circle with an attribute radius
//  and a method to calculate the area. Use Scanner to get
//  user input for the circle's radius 
// (Area of Circle = πr*r) 

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Radius is :");
        double radius = sc.nextDouble();
        System.out.println("area of Circle(pi r*r):" + (Math.PI * radius * radius));
    }
}
