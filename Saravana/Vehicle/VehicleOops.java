// Method Overriding:
// Create a Vehicle class with a method move() that prints "Vehicle is moving".
// Create a subclass Car that overrides the move() method to print "Car is moving fast".
// Demonstrate method overriding by calling move() on both Vehicle and Car objects.

class Vehicle{
    public void move(){
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle{
    public void move(){
        System.out.println("Vehicle is moving fast");
    }
}


public class VehicleOops{
    public static void main(String args[]){
        Car car = new Car();
        car.move();
    }
}