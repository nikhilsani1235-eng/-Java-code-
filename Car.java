public class Car {
    String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

   
    // public Car() {
    //     model = "Unknown"; 
    //     System.out.println("Car object created!");
    }

    public static void main(String[] args) {
        Car myCar = new Car(); 
        System.out.println("Model: " + myCar.model);
    }

