import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int age;
    Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }
    void display() {
        System.out.println("Roll No: " + rollNo + " | Name: " + name + " | Age: " + age);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5]; 
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Roll No: ");
            int rollNo = sc.nextInt();
            System.out.print("Age: ");
            int age = sc.nextInt();
            
            students[i] = new Student(name, rollNo, age);
        }
        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            s.display();
        }
        sc.close();
    }
}
