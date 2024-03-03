import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public static void readStudent() {
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("Student #" + i);
            System.out.print("ID: ");
            String id = input.next();
            System.out.print("Name: ");
            String name = input.next();
            System.out.print("Email: ");
            String email = input.next();
            Student student = new Student();
            student.setId(id);
            student.setName(name);
            student.setEmail(email);
            students.add(student);
        }
    }

    public static void getStudents() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student #" + (i + 1));
            System.out.println(students.get(i).getId());
            System.out.println(students.get(i).getName());
            System.out.println(students.get(i).getEmail());
        }
    }

    public static void getStudentById() {
        System.out.print("Enter the ID you want to search for: ");
        String id = input.next();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                System.out.println(students.get(i).getId());
                System.out.println(students.get(i).getName());
                System.out.println(students.get(i).getEmail());
            }
        }
    }

    public static void updateStudent() {
        System.out.println("Enter the ID of the student to update: ");
        String id = input.next();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                System.out.println("Student found");
                System.out.println(students.get(i).getId());
                System.out.println(students.get(i).getName());
                System.out.println(students.get(i).getEmail());
                System.out.println("New name: ");
                String newName = input.next();
                students.get(i).setName(newName);
                System.out.println("Updated name: " + students.get(i).getName());
                System.out.println("New email: ");
                String newEmail = input.next();
                students.get(i).setEmail(newEmail);
                System.out.println("Updated email: " + students.get(i).getEmail());
            }
        }

    }

    public static void main(String[] args) {
        readStudent();
        getStudentById();
        updateStudent();
    }

}
