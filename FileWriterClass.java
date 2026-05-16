
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterClass 
{
    public static void main(String[] args)
    {

        // Data to be written in file
        String text = "Welcome to GeeksforGeeks\nHappy Learning!";

        // Try block to check if exception occurs
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the Path : ");
        
            // Reading File name
            String path = br.readLine();

            // Create a FileWriter object
            // to write in the file
            FileWriter fWriter = new FileWriter(path);

            // Writing into file
            fWriter.write(text);

            // Printing the contents of a file
            System.out.println(text);

            // Closing the file writing connection
            fWriter.close();
        }

        // Catch block to handle if exception occurs
        catch (IOException e) {

            // Print the exception
            System.out.print(e.getMessage());
        }
    }
}