
import java.util.Arrays; 

class RemoveElements
{ 

    // function to remove all occurrences 
    // of an element from an array 
    public static int[] removeElements(int[] a, int k) 
    { 
        // Move all other elements to beginning 
        int ind = 0; 
        
        for (int i=0; i<a.length; i++) 
            if (a[i] != k) 
                a[ind++] = a[i]; 

        // Create a copy of arr[] 
        return Arrays.copyOf(a, ind); 
    } 

    // Driver code 
    public static void main(String[] args) 
    { 
        int[] a = { 3, 9, 2, 3, 1, 7, 2, 3, 5 }; 
        int k = 3; 
        a = removeElements(a, k); 
        System.out.println(Arrays.toString(a)); 
    } 
}