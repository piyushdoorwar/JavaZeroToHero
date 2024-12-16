public class CarClass {

    public static void main(String[] args) throws Exception {
        Car myCar = new Car();
        
        // Set fields
        myCar.brand = "Toyota";
        myCar.speed = 150;

        // Call the method
        myCar.displayDetails();
    }
}


class Car {
    String brand;
    int speed;

    void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}