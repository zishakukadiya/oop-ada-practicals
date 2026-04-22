import java.io.*;
import java.util.Scanner;

class StudentFileManager {
    private String filename = "students.txt";

    void writeRecords(int n) {
        Scanner sc = new Scanner(System.in);
        try (FileWriter fw = new FileWriter(filename);
             BufferedWriter bw = new BufferedWriter(fw)) {
            for (int i = 0; i < n; i++) {
                System.out.println("Student " + (i + 1) + ":");
                System.out.print("  Roll No: "); int roll = sc.nextInt();
                System.out.print("  Name: ");    String name = sc.next();
                System.out.print("  Marks: ");   int marks = sc.nextInt();
                bw.write(roll + "," + name + "," + marks);
                bw.newLine();
            }
            System.out.println("Records written to " + filename);
        } catch (IOException e) {
            System.out.println("IOException while writing: " + e.getMessage());
        }
    }

    void readRecords() {
        System.out.println("\n--- Student Records from " + filename + " ---");
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.printf("%-10s %-20s %-10s%n", "Roll No", "Name", "Marks");
            System.out.println("--------------------------------------");
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                System.out.printf("%-10s %-20s %-10s%n", parts[0], parts[1], parts[2]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException while reading: " + e.getMessage());
        } finally {
            System.out.println("File read operation complete.");
        }
    }
}

public class PBL27_StudentFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentFileManager sfm = new StudentFileManager();

        System.out.print("How many student records to write? ");
        int n = sc.nextInt();

        sfm.writeRecords(n);
        sfm.readRecords();

        sc.close();
    }
}
