import java.util.Scanner;

public class SumNatural {
    
    static int sum(int n) {
        if (n == 0)
            return 0;
        else
            return n + sum(n - 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            
            int result = sum(n);
            System.out.println("Sum of natural numbers = " + result);
        }
    }
}