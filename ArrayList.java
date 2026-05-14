import java.util.*;

public class ArrayList


{
    public static void main(String[] args){
        
        // Using ArrayList
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Using Arrays.asList()
        List<String> colors = Arrays.asList("Red", "Green", "Blue");

        // Using List.of()
        List<String> languages = List.of("Java", "Python", "C++");

        // Accessing elements
        System.out.println("Fruits: " + fruits);
        System.out.println("Colors: " + colors);
        System.out.println("Languages: " + languages);
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Number of colors: " + colors.size());
    }
}