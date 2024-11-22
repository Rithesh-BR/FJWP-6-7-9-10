class Car {
    String model;    // Instance variable
    int year;        // Instance variable

    void displayCarInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class InstanceVariables {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Toyota Corolla";
        car1.year = 2020;
        car1.displayCarInfo();

        Car car2 = new Car();
        car2.model = "Honda Civic";
        car2.year = 2019;
        car2.displayCarInfo();
    }
}
