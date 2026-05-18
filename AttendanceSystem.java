import java.util.ArrayList;
import java.util.Scanner;

class Student {

    String name;
    String attendance;

    Student(String name, String attendance) {

        this.name = name;
        this.attendance = attendance;
    }
}

public class AttendanceSystem {

    static ArrayList<Student> students = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n====== Attendance Management System ======");

            System.out.println("1. Add Student");
            System.out.println("2. Mark Attendance");
            System.out.println("3. View Students");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    markAttendance();
                    break;

                case 3:
                    viewStudents();
                    break;

                case 4:
                    System.out.println("System Closed 😎");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    static void addStudent() {

        System.out.print("Enter Student Name: ");

        String name = sc.nextLine();

        students.add(new Student(name, "Not Marked"));

        System.out.println("✅ Student Added Successfully");
    }

    static void markAttendance() {

        if (students.isEmpty()) {

            System.out.println("❌ No Students Found");
            return;
        }

        viewStudents();

        System.out.print("Select Student Number: ");

        int index = sc.nextInt();

        sc.nextLine();

        if (index <= 0 || index > students.size()) {

            System.out.println("❌ Invalid Student");
            return;
        }

        System.out.print("Enter Attendance (Present/Absent): ");

        String status = sc.nextLine();

        students.get(index - 1).attendance = status;

        System.out.println("✅ Attendance Updated");
    }

    static void viewStudents() {

        if (students.isEmpty()) {

            System.out.println("❌ No Students Available");
            return;
        }

        System.out.println("\n------ Student Records ------");

        for (int i = 0; i < students.size(); i++) {

            Student s = students.get(i);

            System.out.println(
                    (i + 1) + ". " +
                    s.name +
                    " --> " +
                    s.attendance
            );
        }
    }
}