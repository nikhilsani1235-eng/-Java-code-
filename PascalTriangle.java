import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows, i, j;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        numRows = s.nextInt();
        s.close();

        for (i = 0; i < numRows; i++) {
           
            for (int space = numRows; space > i; space--) {
                System.out.print(" ");
                        }
            int number = 1;
            
            for (j = 0; j <= i; j++) {
                System.out.print(number + " ");
                
               
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
