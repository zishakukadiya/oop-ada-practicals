import java.util.Scanner;

abstract class Vehicle {
    protected String name;

    Vehicle(String name) {
        this.name = name;
    }

    abstract String fuelType();
    abstract int noOfWheels();

    void display() {
        System.out.println("Vehicle   : " + name);
        System.out.println("Fuel Type : " + fuelType());
        System.out.println("Wheels    : " + noOfWheels());
    }
}

class Car extends Vehicle {
    private String fuelChoice;

    Car(String name, String fuelChoice) {
        super(name);
        this.fuelChoice = fuelChoice;
    }

    @Override
    String fuelType() { return fuelChoice; }

    @Override
    int noOfWheels() { return 4; }
}

class Bike extends Vehicle {

    Bike(String name) {
        super(name);
    }

    @Override
    String fuelType() { return "Petrol"; }

    @Override
    int noOfWheels() { return 2; }
}

public class PBL18_AbstractVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter car name: ");
        String carName = sc.next();
        System.out.print("Fuel type (Petrol/Diesel): ");
        String fuel = sc.next();
        Car car = new Car(carName, fuel);

        System.out.print("\nEnter bike name: ");
        String bikeName = sc.next();
        Bike bike = new Bike(bikeName);

        System.out.println("\n--- Car ---");
        car.display();

        System.out.println("\n--- Bike ---");
        bike.display();

        sc.close();
    }
}
