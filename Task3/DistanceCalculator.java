
// 5. Create a class to find out the distance b/w two coordinates. (d=√((x2 – x1)² + (y2 – y1)²).
public class DistanceCalculator {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }

    // Main method to test the distance calculation
    public static void main(String[] args) {

        double x1 = 3.0;
        double y1 = 4.0;
        double x2 = 7.0;
        double y2 = 1.0;

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("The distance between the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance);
    }
}
