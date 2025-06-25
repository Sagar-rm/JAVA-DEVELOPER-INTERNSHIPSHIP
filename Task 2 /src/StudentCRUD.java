import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class StudentCRUD {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: updateStudent(); break;
                case 4: deleteStudent(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        students.add(new Student(id, name, marks));
        System.out.println("Student added successfully.");
    }

    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            s.display();
        }
    }

    static void updateStudent() {
        System.out.print("Enter ID of student to update: ");
        int id = sc.nextInt();
        boolean found = false;

        for (Student s : students) {
            if (s.id == id) {
                sc.nextLine(); // Consume newline
                System.out.print("Enter new Name: ");
                s.name = sc.nextLine();
                System.out.print("Enter new Marks: ");
                s.marks = sc.nextDouble();
                System.out.println("Student updated successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    static void deleteStudent() {
        System.out.print("Enter ID of student to delete: ");
        int id = sc.nextInt();
        boolean removed = students.removeIf(s -> s.id == id);
        if (removed) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
}
