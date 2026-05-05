import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            // 1. Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // 2. Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // 3. Move to next line
            System.out.println();
        }
        sc.close();
    }
}
