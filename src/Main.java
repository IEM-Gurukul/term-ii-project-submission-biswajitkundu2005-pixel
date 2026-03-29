import java.util.Scanner;
//Create Car Class
class Car {
    private int carID;
    private String brand;
    private String model;
    private double rentPerDay;
    private boolean isAvailable;

    public Car(int carID, String brand, String model, double rentPerDay) {
        this.carID = carID;
        this.brand = brand;
        this.model = model;
        this.rentPerDay = rentPerDay;
        this.isAvailable = true;
    }
    // ADD CAR METHODS
     public int getCarID() {
        return carID;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rentCar() {
        isAvailable = false;
    }

    public void returnCar() {
        isAvailable = true;
    }
    public void displayCar() {
        System.out.println("Car ID: " + carID);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rent per day: Rs. " + rentPerDay);
        System.out.println("Status: " + (isAvailable ? "Available" : "Rented"));
        System.out.println("---------------------------");
    }
}
//Add CarRentalSystem Class
class CarRentalSystem {
    private Car[] cars;
    private int carCount;

    public CarRentalSystem(int size) {
        cars = new Car[size];
        carCount = 0;
    }
public void addCar(int id, String brand, String model, double rent) {
    if (carCount < cars.length) {
        cars[carCount] = new Car(id, brand, model, rent);
        carCount++;
    } else {
        System.out.println("Car storage is full!");
    }
}
public void displayAllCars() {
    System.out.println("\n===== All Cars =====");
    for (int i = 0; i < carCount; i++) {
        cars[i].displayCar();
    }
}

public void displayAvailableCars() {
    System.out.println("\n===== Available Cars =====");
    boolean found = false;
    for (int i = 0; i < carCount; i++) {
        if (cars[i].isAvailable()) {
            cars[i].displayCar();
            found = true;
        }
    }
    if (!found) {
        System.out.println("No cars available right now.");
    }
}
public void rentCarByID(int id) {
    for (int i = 0; i < carCount; i++) {
        if (cars[i].getCarID() == id) {
            if (cars[i].isAvailable()) {
                cars[i].rentCar();
                System.out.println("Car rented successfully.");
            } else {
                System.out.println("Car is already rented.");
            }
            return;
        }
    }
    System.out.println("Car ID not found.");
}
public void returnCarByID(int id) {
    for (int i = 0; i < carCount; i++) {
        if (cars[i].getCarID() == id) {
            if (!cars[i].isAvailable()) {
                cars[i].returnCar();
                System.out.println("Car returned successfully.");
            } else {
                System.out.println("This car was not rented.");
            }
            return;
        }
    }
    System.out.println("Car ID not found.");
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarRentalSystem system = new CarRentalSystem(10);

        int choice, id;

        do {
            System.out.println("\n===== Car Rental System =====");
            System.out.println("1. Display All Cars");
            System.out.println("2. Display Available Cars");
            System.out.println("3. Rent a Car");
            System.out.println("4. Return a Car");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        } while (choice != 5);
    }
}
system.addCar(101, "Toyota", "Innova", 2500);
system.addCar(102, "Maruti", "Swift", 1500);
system.addCar(103, "Honda", "City", 2200);
system.addCar(104, "Hyundai", "i20", 1800);
