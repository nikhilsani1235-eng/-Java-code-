import java.util.Arrays;

class Geeksnt{
    
    public static void main(String[] args) {

        // Array of primitive type
        int[] arr1 = {2, -1, 3, 4};

        // Character array
        char[] arr2 = {'b', 'a', 'c', 'b'};

        // Sorting arrays in ascending order
        Arrays.sort(arr1); 
        Arrays.sort(arr2);

        // Print sorted arrays
        System.out.println(Arrays.toString(arr1)); 
        System.out.println(Arrays.toString(arr2));
    }
}