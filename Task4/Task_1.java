
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task_1 {

    public static void main(String[] args) {
        // 1. Write a java program to Append text or string in a file 
        String filePath = "example.txt";
        String textToAppend = "This is the text to append.\n";
        appendTextToFile(filePath, textToAppend);
    }

    public static void appendTextToFile(String filePath, String textToAppend) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath, true);
            fileWriter.write(textToAppend);
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.err.println("An IOException was caught: " + e.getMessage());
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.err.println("An IOException was caught while closing the FileWriter: " + e.getMessage());
                }
            }
        }

        //  2. Write a java program to Read content from file using BufferedReader 
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
        //   3. Write a java program to Get the size of give file in bytes, kilobytes and megabytes 
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            long bytes = file.length();

            double kilobytes = (double) bytes / 1024;
            double megabytes = kilobytes / 1024;
            System.out.println("File size:");
            System.out.println(bytes + " bytes");
            System.out.println(String.format("%.2f", kilobytes) + " KB");
            System.out.println(String.format("%.2f", megabytes) + " MB");
        } else {
            System.err.println("File does not exist or is not a file.");
        }
    }
}
