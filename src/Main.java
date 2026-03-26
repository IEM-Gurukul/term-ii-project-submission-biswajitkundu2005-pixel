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
}
