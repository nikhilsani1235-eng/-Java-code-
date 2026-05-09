
import java.io.*;
abstract class Creature {

    abstract void No_Of_legs();
}
class Elephant extends Creature {
    void No_Of_legs()
    {
        System.out.println("It has four legs");
    }
}
class Human extends Creature {

    public void No_Of_legs()
    {
        System.out.println("It has two legs");
    }
}

public class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating human object showing the implementation
        Human ob = new Human();

        ob.No_Of_legs();

        // Creating object of above class in  main
        Elephant ob1 = new Elephant();

        // Calling the function in main by
        // creating object of above non abstract class
        ob1.No_Of_legs();
        // Implementation of abstraction
    }
}