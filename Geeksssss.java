
import java.io.*;
class Geeks
{
    static int hexaToDec(String n)
    {
        int l = n.length();
        int base = 1;
        int dec_val = 0

        for (int i = l - 1; i >= 0; i--) {

            if (n.charAt(i) >= '0'
                && n.charAt(i) <= '9') {
                dec_val += (n.charAt(i) - 48) * base;

                // Incrementing base by power
                base = base * 16;
            }

          
            else if (n.charAt(i) >= 'A'
                     && n.charAt(i) <= 'F') {
                dec_val += (n.charAt(i) - 55) * base;

                // Incrementing base by power
                base = base * 16;
            }
        }

        // Returning the decimal value
        return dec_val;
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Custom input hexadecimal number to be
        // converted into decimal number
        String n = "1A";

        // Calling the above method to convert and
        // alongside printing the hexadecimal number
        System.out.println(hexaToDec(n));
    }
}