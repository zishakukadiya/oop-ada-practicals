package student;

public class Student {
    public int rollNo;
    public String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void displayStudent() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
    }
}
