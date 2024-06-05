
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task_2 {
    // 2. Write a java program to Read content from file using BufferedReader 

    public static void main(String[] args) {
        String filePath = "example.txt";
        readContentFromFile(filePath);
    }

    public static void readContentFromFile(String filePath) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An IOException was caught: " + e.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.err.println("An IOException was caught while closing the BufferedReader: " + e.getMessage());
                }
            }
        }
    }
}
