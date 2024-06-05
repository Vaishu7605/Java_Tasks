// 2. Create a class named Rectangle with attributes 
// length and breadth (or width) and methods to calculate 
// and display the area. Use the Scanner class to get user
//  input for the rectangle's dimensions. 
// (Area of Rectangle = Length*Breadth) 

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float length, breadth, area;
        System.out.println("length is : ");
        length = sc.nextFloat();
        System.out.println("breadth is : ");
        breadth = sc.nextFloat();
        area = length * breadth;
        System.out.println("area of Rectangle : " + area);
    }
}
