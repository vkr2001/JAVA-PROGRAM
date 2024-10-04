import java.io.*;

public class CpyUpperCase {
    public static void main(String[] args) {
        String src = "/home/nirajpc/TYBCA/Java Slips Programs/Slip_3/src.txt";
        String tgt = "/home/nirajpc/TYBCA/Java Slips Programs/Slip_3/tgt.txt";

        try (BufferedReader rd = new BufferedReader(new FileReader(src));
             BufferedWriter wt = new BufferedWriter(new FileWriter(tgt))) {

            String line;

            while ((line = rd.readLine()) != null) {
                // Convert the line to uppercase and write it to the target file
                wt.write(line.toUpperCase());
                wt.newLine();  // Add a newline character to separate lines in the target file
            }

            System.out.println("File copied and converted to uppercase successfully.");

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

