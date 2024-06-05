
public class Task_2 {

    public static void main(String[] args) {
        // 1. Write a programto Swap Two Numbers in java. 
        int x = 10;
        System.out.println("value of x:" + x);
        int y = 5;
        System.out.println("value of y:" + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swapped:" + " x = " + x + ", y = " + y);

        // 2. Write a program to convert Integer numbers and Binary numbers in java. 
        int number = 15;
        String binary = Integer.toBinaryString(number);
        System.out.println("number is : " + number);
        System.out.println("converted into binary number : " + binary);

        // 3. Write a program to Find Factorial of a Number in Java. 
        int num = 10;
        long factorial = 1;
        for (int i = 1; i <= num; ++i) {
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
        // 4. Write a program to Add two Complex Numbers in Java. 

        // 5. Write a program  to Calculate Simple Interest in Java. 
        // formula Simple Interest = (P x T x R)/100
        // P = principal amount 
        // T = and 
        // R = rate
        float P = 5, R = 3, T = 8;
        float SI = (P * T * R) / 100;

        System.out.println();

        System.out.println(
                "Simple interest = " + SI);
    }
}
// for run this code....
// javac primitive_datatype.java
// java primitive_datatype
