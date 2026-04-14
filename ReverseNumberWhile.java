public class ReverseNumberWhile {
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = 0;
        int originalNumber = number; 

        
        while (number != 0) {
            int remainder = number % 10; 
            reversedNumber = reversedNumber * 10 + remainder; 
            number = number / 10; 
        }

        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);
    }
}
