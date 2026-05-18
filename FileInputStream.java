
import java.io.*;

// Main class
class FileInputStream {

    // Main driver method
    public static void main(String args[]) {

        // Reading content from file by passing local directory path
        // where file should exists
        FileInputStream GFG
            = new FileInputStream("/Desktop/GFG.txt");

        // This file does not exist in the location
        // This constructor FileInputStream
        // throws FileNotFoundException which
        // is a checked exception
    }
}