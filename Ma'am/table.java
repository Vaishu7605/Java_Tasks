
public class table {

    public static void main(String[] args) {
        // Define the size of the table
        int numRows = 10; // Number of rows in the table
        int numCols = 10; // Number of columns in the table

        // Generate and print the table
        printMultiplicationTable(numRows, numCols);
    }

    public static void printMultiplicationTable(int numRows, int numCols) {
        // Print the header row
        System.out.printf("%4s", " "); // Initial space for row headers
        for (int j = 1; j <= numCols; j++) {
            System.out.printf("%4d", j);
        }
        System.out.println();
        System.out.println("    " + "-".repeat(numCols * 4)); // Print a separator line

        // Print the table rows
        for (int i = 1; i <= numRows; i++) {
            System.out.printf("%2d |", i); // Row header
            for (int j = 1; j <= numCols; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
