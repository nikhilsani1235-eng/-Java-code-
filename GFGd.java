
import java.io.*;
class GFG {

    public static void main(String[] args)
    {
        int number = 7;
        int m, n;
        for (m = 1; m <= number; m++) {

            // Inner loop 1
            for (n = 1; n < m; n++) {
                // Print whitespace
                System.out.print(" ");
            }

            // Inner loop 2
            for (n = m; n <= number; n++) {
                // Print star
                System.out.print("*"
                                 + " ");
            }

            // Ending line after each row
            System.out.println();
        }

        // Outer loop 2
        // prints the second half triangle
        for (m = number - 1; m >= 0; m--) {

            // Inner loop 1
            for (n = 0; n < m; n++) {
                // Print whitespace
                System.out.print(" ");
            }

            // Inner loop 2
            for (n = m; n <= number - 1; n++) {
                // Print star
                System.out.print("*"
                                 + " ");
            }

            // Ending line after each row
            System.out.println();
        }
    }
}