public class AlphabetPyramid {
    public static void main(String[] args) {
        int rows = 5; 
        char letter = 'A'; 

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(letter + " ");
            }
            letter++;
            System.out.println();
        }
    }
}
