
import java.io.*;
import java.util.*;

// Class
class GFGsk {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating an ArrayList
        // Declaring the ArrayList
        ArrayList<String> list = new ArrayList<String>();

        // Adding (appending) new elements at
        // the end of the List
        // Custom inputs
        list.add("Geeks");
        list.add("for Geeks");

        // Declaring the Iterator
        Iterator<String> iterator = list.iterator();

        // Printing hasNext() values
        // Prints true because iterator has two more values
        System.out.println(iterator.hasNext());

        // Go to next value using next() method
        iterator.next();

        // Prints true because iterator has one more values
        System.out.println(iterator.hasNext());

        // Go to next value using next() method
        iterator.next();

        // Prints false because iterator has no more values
        System.out.println(iterator.hasNext());
    }
}