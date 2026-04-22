import java.io.*;
import java.util.Scanner;

class FileAnalyzer {
    private String filename;

    FileAnalyzer(String filename) {
        this.filename = filename;
    }

    void analyze() {
        int charCount = 0, wordCount = 0, lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }
            System.out.println("File     : " + filename);
            System.out.println("Lines    : " + lineCount);
            System.out.println("Words    : " + wordCount);
            System.out.println("Chars    : " + charCount);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}

public class PBL26_FileCounter {
    public static void main(String[] args) {
        String filename;

        if (args.length >= 1) {
            filename = args[0];
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter filename: ");
            filename = sc.nextLine();
            sc.close();
        }

        FileAnalyzer fa = new FileAnalyzer(filename);
        fa.analyze();
    }
}
