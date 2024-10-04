import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Counting {
    public static void main(String[] args) throws IOException {
        int characterCount = 0;
        int lineCount = 0;
        int wordCount = 0;

        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            characterCount += line.length();
            lineCount++;

            // Split the line into words
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }

        reader.close();

        System.out.println("Character count: " + characterCount);
        System.out.println("Line count: " + lineCount);
        System.out.println("Word count: " + wordCount);
    }
}

