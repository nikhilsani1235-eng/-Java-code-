
public class Normal {


    static int normal(int[][] matrix, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // square and add
                sum += matrix[i][j] * matrix[i][j]; 
            }
        }
        // square root of sum
        return (int) Math.sqrt(sum); 
    }

    // Method to calculate the Trace of the matrix
    static int trace(int[][] matrix, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
             // add diagonal elements
            sum += matrix[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 4},
            {2, 3, 7},
            {0, 5, 1}
        };

        int size = matrix.length;

        System.out.println("Trace of the Matrix is: " 
        + trace(matrix, size));
        System.out.println("Normal of the Matrix is: " 
        + normal(matrix, size));
    }
}