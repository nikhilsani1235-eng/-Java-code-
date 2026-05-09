class Person {
    void role() { System.out.println("I am a person."); }

    public void setName(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }
}
class Father extends Person {
    @Override void role()
    {
        System.out.println("I am a father.");
    }
}

public class Main {
    public static void main(String[] args)
    {
        Person p = new Father();
        p.role();
    }
}