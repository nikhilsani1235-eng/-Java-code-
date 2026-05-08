
import java.io.*;
public class GFG {
    static void decTohex(int n)
    {
        int[] hexNum = new int[100];
        int i = 0;
        while (n != 0) {

            // Storing remainder in hexadecimal array
            hexNum[i] = n % 16;
            n = n / 16;
            i++;
        }

        // Printing hexadecimal number array
        // in the reverse order
        for (int j = i - 1; j >= 0; j--) {
            if (hexNum[j] > 9)
                System.out.print((char)(55 + hexNum[j]));
            else
                System.out.print(hexNum[j]);
        }
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Custom input decimal number
        // to be converted into hexadecimal number
        int n = 2545;

        // Calling the above Method1 over number 'n'
        // to convert this decimal into hexadecimal number
        decTohex(n);
    }
}