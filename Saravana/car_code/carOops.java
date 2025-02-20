// You are tasked with designing a Vehicle Management System that demonstrates inheritance, abstraction, and interfaces in Java.
// Requirements:
// Abstract Class Vehicle
// Fields: brand, model, year
// Abstract Method: start(), stop()
// Concrete Method: displayDetails()
// Interface FuelType
// Abstract Method: fuelEfficiency()
// Class Car (Extends Vehicle & Implements FuelType)
// Additional Fields: fuelCapacity, seats
// Implement start(), stop(), and fuelEfficiency()
// Class ElectricCar (Extends Car)
// Additional Field: batteryCapacity
// Override fuelEfficiency() to represent electric energy efficiency.
// Demonstrate the OOPs Concepts
// Create objects of Car and ElectricCar in main(), call all methods.

package car_code;
abstract class Vehicle {

    private String brand;
    private String model;
    private int year;
    public Vehicle(String brand,String model,int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public abstract void start();
    public abstract void stop();
    public void displayDetails(){
        System.out.println("Car brand: "+getBrand());
        System.out.println("Car model: "+getModel());
        System.out.println("Car year: "+getYear());
    }
}

interface FuelType{
    public void fuelEfficiency(int mileage);
    
}

class Car extends Vehicle implements FuelType{
    private int fuelCapacity;
    private int seats;
    public Car(int fuelCapacity,int seats,String brand,String model,int year){
        super(brand,model,year);
        this.fuelCapacity = fuelCapacity;
        this.seats = seats;
    }
    public int getFuelCapacity(){
        return fuelCapacity;
    }
    public int getSeats(){
        return seats;
    }
    public void start(){
        System.out.println("Car start");
    }
    public void stop(){
        System.out.println("Car stop");
    }
    public void fuelEfficiency(int mileage){
        System.out.println("Fuel Efficiency: "+mileage);
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Fuel capacity: "+getFuelCapacity());
        System.out.println("Seats: "+getSeats());
    }
}

class ElectricCar extends Car{
    private int batteryCapacity;
    public ElectricCar(int batteryCapacity,int fuelCapacity,int seats,String brand,String model,int year){
        super(fuelCapacity,seats,brand,model,year);
        this.batteryCapacity = batteryCapacity;
    }
    public int getBatteryCapacity(){
        return batteryCapacity;
    }
    public void fuelEfficiency(int range){
        System.out.println("Car range : "+getBatteryCapacity());
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Battery capacity: "+getBatteryCapacity());
    }
}
public class carOops{
    public static void main(String args[]){
        ElectricCar electricCar = new ElectricCar(90, 40, 7, "Hyunai", "Verna", 2013);
        electricCar.fuelEfficiency(120);
        electricCar.start();
        electricCar.stop();
        electricCar.fuelEfficiency(45);
        electricCar.displayDetails();
    }
}
