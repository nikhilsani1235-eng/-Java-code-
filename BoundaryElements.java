

// Main class
public class BoundaryElements {

    // Method to print boundary elements
    public void Boundary_Elements(int[][] mat) {
        
        // Printing the input matrix
        System.out.println("Input Matrix is:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        // Printing boundary values
        System.out.println("Resultant Matrix is:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == 0 || j == 0 || i == mat.length - 1 || j == mat[i].length - 1) {
                    System.out.print(mat[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        // Input matrix
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Create object and call method
        Geeks obj = new Geeks();
        obj.Boundary_Elements(mat);
    }
}