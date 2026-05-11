
import java.util.*;

// Driver Class
class GFGff {
  	
  	// Function to Find Common Elements 
    private static void FindCommonElement(String[] arr1,String[] arr2)
    {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {

                    // add common elements
                    set.add(arr1[i]);
                    break;
                }
            }
        }
      
      	// Common Elements in Arrays
      	System.out.println(set.toString());
    }

    // Main Method
    public static void main(String[] args)
    {

        // Create Array 1
        String[] arr1 = { "Article", "in", "Geeks", "for", "Geeks" };

        // Create Array 2
        String[] arr2 = { "Geeks", "for", "Geeks" };

        // Find the Common Elements
        FindCommonElement(arr1, arr2);
    }
}