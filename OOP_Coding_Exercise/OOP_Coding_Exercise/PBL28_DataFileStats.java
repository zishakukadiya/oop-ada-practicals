import java.io.*;
import java.util.Scanner;

class DataFileReader {
    private String filename;

    DataFileReader(String filename) {
        this.filename = filename;
    }

    void analyze() {
        int totalLines = 0, totalWords = 0, totalChars = 0;

        try (FileReader fr = new FileReader(filename);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                totalLines++;
                // Count chars excluding spaces and newlines
                for (char c : line.toCharArray()) {
                    if (c != ' ') totalChars++;
                }
                // Count words
                String trimmed = line.trim();
                if (!trimmed.isEmpty()) {
                    totalWords += trimmed.split("\\s+").length;
                }
            }

            System.out.println("File     : " + filename);
            System.out.println("Lines    : " + totalLines);
            System.out.println("Words    : " + totalWords);
            System.out.println("Chars    : " + totalChars + " (excluding spaces and newlines)");

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: File '" + filename + "' not found.");
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}

public class PBL28_DataFileStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter filename (default: data.txt): ");
        String filename = sc.nextLine().trim();
        if (filename.isEmpty()) filename = "data.txt";

        // Create a sample data.txt if not present
        File f = new File(filename);
        if (!f.exists()) {
            try (FileWriter fw = new FileWriter(filename)) {
                fw.write("Java is a powerful programming language.\n");
                fw.write("It supports object oriented programming concepts.\n");
                fw.write("OOP includes inheritance polymorphism and encapsulation.\n");
                System.out.println("Sample " + filename + " created.");
            } catch (IOException e) {
                System.out.println("Could not create file: " + e.getMessage());
            }
        }

        DataFileReader reader = new DataFileReader(filename);
        reader.analyze();

        sc.close();
    }
}
