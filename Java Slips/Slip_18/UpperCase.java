import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UpperCase {
    public static void main(String[] args) {
        String filePath = "abc.txt";

        try (BufferedReader br = new BufferedReader(new FileReader("abc.txt")) ) {
            String line;
            while ((line = br.readLine()) != null) {
                // Convert each line to uppercase and print
                System.out.println(line.toUpperCase());
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

