public class SandglassPattern {
    public static void main(String[] args) {
        int rows = 5;

        // Part 1: Top Half (Inverted Pyramid)
        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k < rows - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < rows - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
