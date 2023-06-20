public class Student {
    String collegeName;
    int rollNo;
    String name;

    public Student(String collegeName, int rollNo, String name) {
        this.collegeName = collegeName;
        this.rollNo = rollNo;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student student1 = new Student(" College 1", 123, "ABC");
        student1.displayDetails();

        System.out.println();

        Student student2 = new Student(" College 2", 456, "DEF");
        student2.displayDetails();
    }
}
