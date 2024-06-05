
import java.io.File;

public class Task_3 {

    public static void main(String[] args) {
        //  3. Write a java program to Get the size of give file in bytes, kilobytes and megabytes 
        String filePath = "example.txt";
        getFileSize(filePath);
    }

    public static void getFileSize(String filePath) {
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
