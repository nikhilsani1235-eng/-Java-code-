import java.util.Scanner;

public class MethodOverloadingExample {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sum(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter two integers: ");
            int int1 = sc.nextInt();
            int int2 = sc.nextInt();
            System.out.println("Sum of two integers: " + sum(int1, int2));

            System.out.print("Enter three integers: ");
            int int3 = sc.nextInt();
            int int4 = sc.nextInt();
            int int5 = sc.nextInt();
            System.out.println("Sum of three integers: " + sum(int3, int4, int5));

            System.out.print("Enter two double values: ");
            double double1 = sc.nextDouble();
            double double2 = sc.nextDouble();
            System.out.println("Sum of two doubles: " + sum(double1, double2));

            System.out.print("Enter one integer and one double: ");
            int int6 = sc.nextInt();
            double double3 = sc.nextDouble();
            System.out.println("Sum of integer and double: " + sum(int6, double3));

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter correct numeric values.");
        } finally {
            sc.close();
        }
    }
}